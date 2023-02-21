package main.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	
	public Integer getSum(Integer a, Integer b) {
		return a+b;
	}
	

}
