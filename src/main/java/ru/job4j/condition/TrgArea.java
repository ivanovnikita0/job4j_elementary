package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double rs1 = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return rs1;
    }

    public static void main(String[] args) {
       double result = TrgArea.area(4, 5, 6);
       System.out.println("area (4, 5, 6) = " + result);
    }
}
