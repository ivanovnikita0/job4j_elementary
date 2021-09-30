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

        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result :" + passed);

        in = 180;
        expected = 3;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 3 dollars. Test result :" + passed);

        in = 100;
        expected = 116;
        out = Converter.euroToDollar(in);
        passed = expected == out;
        System.out.println("100 euro are 116 dollars. Test result :" + passed);

        in = 100;
        expected = 7000;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println("100 euro are 7000 rubles. Test result :" + passed);

        in = 232;
        expected = 200;
        out = Converter.dollarToEuro(in);
        passed = expected == out;
        System.out.println("232 dollars are 200 euro. Test result :" + passed);

        in = 150;
        expected = 9000;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println("150 dollars are 9000 rubles. Test result :" + passed);

    }

}
