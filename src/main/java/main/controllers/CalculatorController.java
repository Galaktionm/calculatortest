package main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.services.CalculatorService;

@RequestMapping("/calculator")
@RestController
public class CalculatorController {
	
	@Autowired
	private CalculatorService calculator;
	
	@GetMapping
	public Integer getResult(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		return calculator.getSum(a, b);
	}

}
