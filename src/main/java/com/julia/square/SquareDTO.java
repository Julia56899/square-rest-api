package com.julia.square;

// DTO — это просто класс-обёртка для данных, которые приходят в теле запроса
public class SquareDTO {

    // поле, в котором хранится число из запроса
    private Integer number;

    // пустой конструктор нужен, чтобы Spring мог сам создать объект из JSON
    public SquareDTO(){}

    // конструктор если хотим сразу передать число
    public SquareDTO(Integer number) {
        this.number = number;
    }

    // геттер — возвращает число
    public Integer getNumber() {
        return number;
    }

    // сеттер — устанавливает число
    public void setNumber(Integer number) {
        this.number = number;
    }
}
