package com.julia.square;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// главный класс — отсюда запускается всё приложение
@SpringBootApplication
public class SquareRestApiApplication {
    // точка входа, Spring сам поднимает сервер при запуске
    public static void main(String[] args) {
        SpringApplication.run(SquareRestApiApplication.class, args);
    }



}
