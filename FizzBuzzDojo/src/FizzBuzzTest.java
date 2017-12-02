import static org.junit.Assert.assertEquals;
import static java.util.Arrays.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	public static final String FIZZ = "Fizz";
	public static final String BUZZ = "Buzz";
	public static final String BANG = "Bang";
	
	FizzBuzzGame fizzBuzz;
	
	@Before
	public void setUp() {
		fizzBuzz = new FizzBuzzGame(asList(
				new WordRule(3, FIZZ),
				new WordRule(5, BUZZ),
				new WordRule(7, BANG),
				new DefaultRule()));
	}
	
	@Test
	public void testSayNumberPrintNumber(){
		assertEquals("1", fizzBuzz.say(1));
		assertEquals("2", fizzBuzz.say(2));
	}
	
	@Test
	public void testSayMultipleOfThreePrintFizz() {
		assertEquals(FIZZ, fizzBuzz.say(3));
		assertEquals(FIZZ, fizzBuzz.say(6));
	}
	
	@Test
	public void testSayMultipleOfFivePrintBuzz() {
		assertEquals(BUZZ, fizzBuzz.say(5));
		assertEquals(BUZZ, fizzBuzz.say(10));
	}
	
	@Test
	public void testSayMultipleOfThreeAndFivePrintFizzBuzz() {
		assertEquals(FIZZ + BUZZ, fizzBuzz.say(3 * 5));
	}

	@Test
	public void testSayMultipleOfSevenPrintFizzBang() {
		assertEquals(BANG, fizzBuzz.say(7));
		assertEquals(BANG, fizzBuzz.say(14));
	}
	
	@Test
	public void testSayMultipleOfThreeAndFiveAndSevenPrintFizzBang() {
		assertEquals(FIZZ + BUZZ + BANG, fizzBuzz.say(3*5*7));
	}

}
