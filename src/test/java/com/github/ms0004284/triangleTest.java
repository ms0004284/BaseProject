package com.github.ms0004284;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class triangleTest {
    @Test
    public void getType() throws Exception {
        triangle tr1 = new triangle(5,10,5);
        String result = tr1.getType();
        Assert.assertEquals("不是三角形", result);
    }
}
