import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		assertEquals(8, Calculator.add(3, 5));
	}

	@Test
	public void testSubtract() {
		assertEquals(-2, Calculator.subtract(3, 5));
	}

	@Test
	public void testMultiply() {
		assertEquals(15, Calculator.multiply(3, 5));
	}

	@Test
	public void testDivide() {
		assertEquals(0, Calculator.divide(10, 5));
	}

}
