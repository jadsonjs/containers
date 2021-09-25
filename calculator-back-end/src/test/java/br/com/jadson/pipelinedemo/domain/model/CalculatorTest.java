package br.com.jadson.pipelinedemo.domain.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    /**
     * Simple calculate test
     */
    @Test
    void sumTest(){
        Assertions.assertEquals(40, new Calculator().sum(10, 30));
    }

    @Test
    void subTest(){
        Assertions.assertEquals(20, new Calculator().sub(30, 10));
    }

}