package org.czwief.lab01;

import org.czwief.lab01.calculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

	private final Calculator calculator;

	public CalculatorTest() {
		this.calculator = new Calculator();
	}

	@Test
	public void testAdd()
	{
		assertEquals("3 + 2 = 5", 5, calculator.add(3, 2));
		assertEquals("3 + 2 = 5", 5, calculator.add(2, 3));
		assertEquals("-3 + -3 = -6", -6, calculator.add(-3, -3));
		assertEquals("0 + 1 = 1", 1, calculator.add(0, 1));
		assertEquals("1 + 0 = 1", 1, calculator.add(1, 0));

		// Bonus points: what in the world is going on here?
		assertEquals("1073741824 + 1073741824 = -2147483648", -2147483648, calculator.add(1073741824, 1073741824));
	}

	@Test
	public void testSubtract()
	{
		assertEquals("3 + 2 = 5", 5, calculator.subtract(3, 2));
		assertEquals("3 + 2 = 5", 5, calculator.subtract(2, 3));
		assertEquals("-3 + -3 = -6", -6, calculator.subtract(-3, -3));
		assertEquals("0 + 1 = 1", 1, calculator.subtract(0, 1));
		assertEquals("1 + 0 = 1", 1, calculator.subtract(1, 0));
	}

	@Test
	public void testMultiply()
	{
		assertEquals("3 * 2 = 6", 6, calculator.multiply(3, 2));
		assertEquals("2 * -3 = -6", -6, calculator.multiply(2, -3));
		assertEquals("-3 * -3 = 9", 9, calculator.multiply(-3, -3));
		assertEquals("0 * 1 = 0", 0, calculator.multiply(0, 1));
		assertEquals("1 * 0 = 0", 0, calculator.multiply(1, 0));
	}

	@Test
	public void testDivide()
	{
		assertEquals("4 / 2 = 2", 2, calculator.divide(4, 2));
		assertEquals("100 / 10 = 10", 10, calculator.divide(100, 10));
		assertEquals("-3 / -3 = 1", 1, calculator.divide(-3, -3));

		// Bonus points: explain this!
		assertEquals("5 / 2 = 2", 2, calculator.divide(5, 2));
		assertEquals("3 / -3 = -1", -1, calculator.divide(3, -3));

		// Bonus points: what should happen if we test this?
		// calculator.divide(1, 0)
	}

	@Test
	public void testModulus()
	{
		assertEquals("4 % 2 = 0", 0, calculator.modulus(4, 2));
		assertEquals("100 % 10 = 0", 0, calculator.modulus(100, 10));
		assertEquals("-3 % 2 = -1", -1, calculator.modulus(-3, 2));

		// Bonus points: explain this!
		assertEquals("5 % 2 = 1", 1, calculator.modulus(5, 2));
		assertEquals("3 % -3 = 0", 0, calculator.modulus(3, -3));
	}

}