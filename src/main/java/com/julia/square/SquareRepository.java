package com.julia.square;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

// репозиторий — тут хранятся данные и методы для работы с ними
@Repository
public class SquareRepository {
    // HashMap хранит пары: число → его квадрат (вместо базы данных)
    HashMap<Integer,Integer> square = new HashMap<>();


    // метод сохраняет пару число-результат в нашу "базу"
    void save (Integer id, Integer result) {
        square.put(id,result);
    }



    // метод возвращает всё что есть в хранилище
    HashMap<Integer,Integer> findAll() {
        return square;
    }


}