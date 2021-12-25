package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int dif = money - price;
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        for (int coin : coins) {
            while (dif >= coin) {
                dif = dif - coin;
                rsl[size] = coin;
                size = size + 1;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}