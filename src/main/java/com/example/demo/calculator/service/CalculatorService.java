package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public int calculator(int num1, int num2, String operation) throws ArithmeticException {
		//各ケース毎の分岐コード
		switch (operation) {
		case "plus":
			return plus(num1, num2);

		case "minus":
			return minus(num1, num2);

		case "multi":
			return multi(num1, num2);

		case "divide":
			if (num2 != 0) {
				return divide(num1, num2);
			} else {
				throw new ArithmeticException("0では割れません");
				//「例外が発生してるかもです〜」っていう報告
			}

		default:
			throw new ArithmeticException("Invalid operation: "+ operation);
		}
	}

	private int plus(int num1, int num2) {
		// TODO 自動生成されたメソッド・スタブ
		return num1 + num2;
	}

	private int minus(int num1, int num2) {
		// TODO 自動生成されたメソッド・スタブ
		return num1 - num2;
	}

	private int multi(int num1, int num2) {
		// TODO 自動生成されたメソッド・スタブ
		return num1 * num2;
	}

	private int divide(int num1, int num2) {
		// TODO 自動生成されたメソッド・スタブ
		return num1 / num2;

	}
}
