package com.example.demo.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.calculator.service.CalculatorService;

//Controllerだよ！という注釈
@Controller
public class CalculatorController {

	private final CalculatorService calculatorService;

	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	//以下のURLにアクセスがあった際にこのプログラムが呼ばれる
	@GetMapping("calculator")
	public String showcalculatorForm() {
		return "calculator.html";
	}

	@PostMapping("calculator")
	public String doPost(
			@RequestParam("num1") int num1,
			@RequestParam("num2") int num2,
			@RequestParam("operation") String operation,
			CalculatorService sevice,
			Model model) {
		int result = 0;
		String errorMessage = null;
		try {
			 result = calculatorService.calculator(num1, num2, operation);
		}catch (ArithmeticException e) {
			errorMessage = e.getMessage();
		}
		model.addAttribute("errorMessage", errorMessage);
		model.addAttribute("result", result);
		return "calculator.html";

	}

}
