package com.qaa.module3.unit_testing_exercises.exercise1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	private Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

	@Test
	void addSmallNumbersTest() {
		// Arrange
		double num1 = 10, num2 = 30;
		double expected = 40;
		
		// Act
		double actual = calculator.add(num1, num2);
		
		// Assert
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void subtractSmallNumbersTest() {
		// Arrange
		double num1 = 12, num2 = 8;
		double expected = 4;
		
		// Act
		double actual = calculator.subtract(num1, num2);
		
		// Assert
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void multiplySmallNumbersTest() {
		// Arrange
		double num1 = 5, num2 = 3;
		double expected = 15;
		
		// Act
		double actual = calculator.multiply(num1, num2);
		
		// Assert
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void divideSmallNumbersTest() {
		// Arrange
		double num1 = 30, num2 = 10;
		double expected = 3;
		
		// Act
		double actual = calculator.divide(num1, num2);
		
		// Assert
		Assertions.assertEquals(expected, actual);
	}
	@Test
	void addMediumNumbersTest() {
		// Arrange
		double num1 = 120, num2 = 302;
		double expected = 422;
		
		// Act
		double actual = calculator.divide(num1, num2);
		
		// Assert
		Assertions.assertEquals(expected, actual);
	}
}