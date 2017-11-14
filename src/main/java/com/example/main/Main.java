package com.example.main;

import com.example.classes.Calculator;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.addition(2, 2));
		System.out.println(calculator.substraction(2,2));
		System.out.println(calculator.division(2, 2));
		System.out.println(calculator.multiplication(2, 2));
		

	}

}
