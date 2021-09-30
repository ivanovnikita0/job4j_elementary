package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest  {

    @Test
    public void whenMan175Then86() {
        short in = 175;
        double expected = 86.25;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenWoman165Then63() {
        short in = 165;
        double expected = 63.25;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

}