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

        float in1 = 180;
        float expected1 = 3;
        float out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("180 rubles are 3 dollars. Test result :" + passed1);

        float in2 = 100;
        float expected2 = 116;
        float out2 = Converter.euroToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("100 euro are 116 dollars. Test result :" + passed2);

        float in3 = 100;
        float expected3 = 7000;
        float out3 = Converter.euroToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("100 euro are 7000 rubles. Test result :" + passed3);

        float in4 = 232;
        float expected4 = 200;
        float out4 = Converter.dollarToEuro(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("232 dollars are 200 euro. Test result :" + passed4);

        float in5 = 150;
        float expected5 = 9000;
        float out5 = Converter.dollarToRuble(in5);
        boolean passed5 = expected5 == out5;
        System.out.println("150 dollars are 9000 rubles. Test result :" + passed5);

    }

}
