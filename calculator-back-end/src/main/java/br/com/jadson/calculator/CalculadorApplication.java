package br.com.jadson.calculator;

import br.com.jadson.calculator.services.CalculatorServiceImpl;
import br.com.jadson.calculator.domain.ports.CalculatorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CalculadorApplication {

	/**
	 * Run the application
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CalculadorApplication.class, args);
	}

	/**
	 * Define concrete service.
	 * @return
	 */
	@Bean
	public CalculatorService calculatorService(){ return new CalculatorServiceImpl(); }

}
