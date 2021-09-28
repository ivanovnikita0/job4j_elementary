package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rs1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rs1;
    }

    public static void main(String[] args) {

        double result1 = Point.distance(1, 0, 1, 3);
        System.out.println("result1 (1, 0) to (1, 3) " + result1);

        double result2 = Point.distance(1, 5, 2, 3);
        System.out.println("result2 (1, 5) to (2, 3) " + result2);
    }
}
