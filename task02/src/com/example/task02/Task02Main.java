package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber) {
        switch (monthNumber) {
            case 12: case 1: case 2:
                return "Зима";
            case 3: case 4: case 5:
                return "Весна";
            case 6: case 7: case 8:
                return "Лето";
            case 9: case 10: case 11:
                return "Осень";
            default:
                throw new IllegalArgumentException(String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        }
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}