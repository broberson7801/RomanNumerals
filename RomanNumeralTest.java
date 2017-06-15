package labs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RomanNumeralTest {
	
	RomanNumeralTranslator interpret = new RomanNumeralTranslator();
	UserInput translate;

	@Before
	public void setUp() throws Exception {
		translate = new UserInput();
		
	}

	@After
	public void tearDown() throws Exception {
		translate = null;
	}

	@Test
	public void test_roman_numerals_from_one_to_ten() {
		String[] testArray = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
		String[] testArray2 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		for(int i = 0; i < testArray.length; i++) {
			assertEquals(testArray[i],interpret.parseInput(testArray2[i]));
		}
		
	}

}
