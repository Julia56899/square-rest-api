package com.julia.square;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.Map;

// это контроллер — он принимает запросы от пользователя и отдаёт ответы
@RestController
public class SquareController {

// подключаю сервис, чтобы использовать его методы
@Autowired
    private SquareService squareService;



// POST запрос на /api/square — принимает число, считает квадрат и возвращает результат
@PostMapping("/api/square")
@ResponseBody
    public int square (@RequestBody SquareDTO squareDTO) {
    // берём число из тела запроса и передаём в сервис
    return squareService.calculate(squareDTO.getNumber());
}


// GET запрос на /api/allList — возвращает все сохранённые пары число-квадрат
@GetMapping ("/api/allList")
    public Map<Integer,Integer> allList() {
    // просим сервис отдать всё что есть в хранилище
    return squareService.getAll();
}

}
