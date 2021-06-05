package FinalActivityTwo;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;


public class CalculatorTest {

	private Calculator theCalculator;

	@Test
	public void testGetSum() {
		assertEquals("sum error", Calculator.sum(1, 5), 6);
		assertEquals("sum error", Calculator.sum(-1, -2), -3);
		assertEquals("sum error", Calculator.sum(9, 0), 9);
		assertNotEquals("sum error", Calculator.sum(1, 2),0);
	}

	@Test
	public void testGetDifference() {
		assertEquals("diff error", Calculator.sub(2, 1), 1);
		assertEquals("diff error", Calculator.sub(-2, -1),-1);
		assertEquals("diff error", Calculator.sub(2, 2), 0);
		assertNotEquals("diff error", Calculator.sub(5, 1), 3);
	}

	@Test
	public void testGetMultiply (){
		assertThat(16.0, equalTo(Calculator.mult(8, 2)));
		assertThat(-6.0, equalTo(Calculator.mult(3, -2)));
		assertThat(18.0, equalTo(Calculator.mult(-6, -3)));
		assertThat(0.0, equalTo(Calculator.mult(7, 0)));
	}

	@Test
	public void testGetDivide() {
		assertThat(4.0, equalTo(Calculator.div(8, 2)));
		assertThat(-8.0, equalTo(Calculator.div(16, -2)));
		assertThat(4.0, equalTo(Calculator.div(-16, -4)));
		assertThat(0.0, equalTo(Calculator.div(0, 5)));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivisionByZero() throws IllegalArgumentException {
		Calculator.div(2, 0);
	}
}