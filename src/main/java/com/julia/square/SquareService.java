package com.julia.square;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

// сервис — тут вся логика приложения
@Service
public class SquareService {

    // подключаю репозиторий чтобы сохранять и читать данные
    private final SquareRepository squareRepository;
    // счётчик для порядкового номера записи
    private Integer counter = 0;


    // конструктор — Spring сам передаст нужный репозиторий
    @Autowired
    public SquareService(SquareRepository squareRepository) {
        this.squareRepository = squareRepository;
    }

// метод считает квадрат числа и сохраняет результат
public int calculate (Integer number ) {
// умножаем число само на себя
int result = number*number;

// увеличиваем счётчик и используем как id записи
int id = ++counter;
// сохраняем в репозиторий: число → квадрат
squareRepository.save(number, result);


// возвращаем результат обратно в контроллер
return result;
}

// метод возвращает все сохранённые результаты
public HashMap<Integer,Integer> getAll() {
    // вызываем репозиторий и отдаём всё что там есть
return squareRepository.findAll();
}
}
