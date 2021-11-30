package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресенье";
                break;
            default:
                name = "Ошибка";
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(1));
        System.out.println(nameOfDay(2));
        System.out.println(nameOfDay(3));
        System.out.println(nameOfDay(4));
        System.out.println(nameOfDay(5));
        System.out.println(nameOfDay(6));
        System.out.println(nameOfDay(7));
        System.out.println(nameOfDay(8));

    }
}


