package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rs1 = value / 70;
        return rs1;
    }

    public static float rubleToDollar(float value) {
        float rs1 = value / 60;
        return rs1;
    }

    public static float euroToDollar(float value) {
        float rs1 = value * 1.16f;
        return rs1;
    }

    public static float euroToRuble(float value) {
        float rs1 = value * 70;
        return rs1;
    }

    public static float dollarToEuro(float value) {
        float rs1 = value / 1.16f;
        return rs1;
    }

    public static float dollarToRuble(float value) {
        float rs1 = value * 60;
        return rs1;
    }

    public static void main(String[] args) {

        float euro = Converter.rubleToEuro(1000);
        System.out.println("1000 rubles are " + euro + " euro.");

        float dollar = Converter.rubleToDollar(1000);
        System.out.println("1000 rubles are " + dollar + " dollar.");

        float dollar1 = Converter.euroToDollar(1000);
        System.out.println("1000 euro are " + dollar1 + " dollar.");

        float ruble2 = Converter.euroToRuble(1000);
        System.out.println("1000 euro are " + ruble2 + " rubles.");

        float euro2 = Converter.dollarToEuro(1000);
        System.out.println("1000 dollars " + euro2 + " euro.");

        float ruble = Converter.dollarToRuble(1000);
        System.out.println("1000 dollars " + ruble + " rubles.");
    }

}
