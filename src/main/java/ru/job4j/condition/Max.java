package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean rt = left > right;
        int result = rt ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int rs = Max.max(1, 2);
        System.out.println(rs);
    }
}
