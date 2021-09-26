package br.com.jadson.calculator.domain.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {


    @Test
    void sumTest(){
        Assertions.assertEquals(40, new Calculator().sum(10, 30));
    }

    @Test
    void subTest(){
        Assertions.assertEquals(20, new Calculator().sub(30, 10));
    }

    @Test
    void multTest(){
        Assertions.assertEquals(300, new Calculator().mult(30, 10));
    }

    @Test
    void divTest(){
        Assertions.assertEquals(3, new Calculator().div(30, 10));
    }

}