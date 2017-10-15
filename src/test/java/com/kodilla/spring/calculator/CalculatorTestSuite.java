package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.addAToB(10,-2.5);
        double subResult = calculator.subtractBFromA(10, -2.5);
        double mulResult = calculator.multiplyAByB(10, -2.5);
        double divResult = calculator.divideAByB(10, -2.5);
        //Then
        Assert.assertEquals(7.5, addResult, 0.001);
        Assert.assertEquals(12.5, subResult, 0.001);
        Assert.assertEquals(-25.0, mulResult, 0.001);
        Assert.assertEquals(-4.0, divResult, 0.001);
    }
}
