Square REST API

Простой REST API на Spring Boot, который принимает число, возводит его в квадрат и сохраняет результат в памяти.

Технологии:

Java 17, Spring Boot 3.4.1, Maven

Структура проекта:

1.SquareRestApiApplication — точка входа, запуск приложения

2.SquareController — обрабатывает HTTP-запросы

3.SquareService — бизнес-логика, вычисляет квадрат числа

4.SquareRepository — хранилище в памяти на основе HashMap

5.SquareDTO — объект для передачи входных данных

Запуск:
mvn spring-boot:run

Приложение запустится по адресу http://localhost:8080

Тестирование:

Все эндпоинты можно протестировать через Postman.

Шаг 1 — Вычислить квадрат числа

Метод: POST

URL: http://localhost:8080/api/square

Body — raw — JSON:
```json
{
  "number": 5
}
```
Ответ: 25

Шаг 2 — Посмотреть все результаты

Метод: GET

URL: http://localhost:8080/api/allList

Тело не нужно. В ответ придут все числа, которые были посчитаны:
```json
{
  "5": 25
}
```

 Контакты:

Разработчик: Юлия

GitHub: @Julia56899

Email: gusak.julia233@gmail.com

Telegram: @julia8880