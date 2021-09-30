package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest  {
    @Test
    public void when46to83then5() {
        double expected = 5;
        int x1 = 4;
        int y1 = 6;
        int x2 = 8;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when77to49then3() {
        double expected = 3.6;
        int x1 = 7;
        int y1 = 7;
        int x2 = 4;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when63to11then5() {
        double expected = 5.38;
        int x1 = 6;
        int y1 = 3;
        int x2 = 1;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
}