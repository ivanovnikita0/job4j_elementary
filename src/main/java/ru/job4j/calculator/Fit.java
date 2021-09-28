package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rs1 = (height - 100) * 1.15;
        return rs1;
    }

    public static double womanWeight(short height) {
        double rs1 = (height - 110) * 1.15;
        return rs1;
    }

    public static void main(String[] args) {
        short height = 170;
        double man = Fit.manWeight(height);
        System.out.println("Man 170 is " + man);
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 170 is " + woman);
    }
}