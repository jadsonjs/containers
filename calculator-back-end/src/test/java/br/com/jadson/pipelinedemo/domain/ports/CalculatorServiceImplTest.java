package br.com.jadson.pipelinedemo.domain.ports;

import br.com.jadson.pipelinedemo.services.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CalculatorServiceImplTest {

    @InjectMocks
    CalculatorServiceImpl service;

    /**
     * Simple calculate test for service
     */
    @Test
    void sumTest(){
        Assertions.assertEquals(40, service.sum(10, 30));
    }

    @Test
    void subTest(){
        Assertions.assertEquals(20, service.sub(30, 10));
    }

}