package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import main.services.CalculatorService;

@SpringBootTest
class JenkinsCalculatorApplicationTests {
	
	@Autowired
	private CalculatorService calculator;

	@Test
	public void testCalculator() {
		assertEquals(5, calculator.getSum(2, 3));
	}
}
