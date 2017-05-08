package RomanIntConverter;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToIntTest {

	@Test
	public void testOneLetter() {

		RomanToInt romanToInt = new RomanToInt();
		assertEquals(romanToInt.convert("I"), 1);
		assertEquals(romanToInt.convert("V"), 5);
		assertEquals(romanToInt.convert("X"), 10);
		assertEquals(romanToInt.convert("L"), 50);
		assertEquals(romanToInt.convert("C"), 100);
		assertEquals(romanToInt.convert("D"), 500);
		assertEquals(romanToInt.convert("M"), 1000);
	}

	@Test
	public void testOneToTwenty() {

		RomanToInt romanToInt = new RomanToInt();
		assertEquals(romanToInt.convert("I"), 1);
		assertEquals(romanToInt.convert("II"), 2);
		assertEquals(romanToInt.convert("III"), 3);
		assertEquals(romanToInt.convert("IV"), 4);
		assertEquals(romanToInt.convert("V"), 5);
		assertEquals(romanToInt.convert("VI"), 6);
		assertEquals(romanToInt.convert("VII"), 7);
		assertEquals(romanToInt.convert("VIII"), 8);
		assertEquals(romanToInt.convert("IX"), 9);
		assertEquals(romanToInt.convert("X"), 10);
		assertEquals(romanToInt.convert("XI"), 11);
		assertEquals(romanToInt.convert("XII"), 12);
		assertEquals(romanToInt.convert("XIII"), 13);
		assertEquals(romanToInt.convert("XIV"), 14);
		assertEquals(romanToInt.convert("XV"), 15);
		assertEquals(romanToInt.convert("XVI"), 16);
		assertEquals(romanToInt.convert("XVII"), 17);
		assertEquals(romanToInt.convert("XVIII"), 18);
		assertEquals(romanToInt.convert("XIX"), 19);
		assertEquals(romanToInt.convert("XX"), 20);

	}

	@Test
	public void testDificultCases() {

		RomanToInt romanToInt = new RomanToInt();
		assertEquals(romanToInt.convert("MCMLIV"), 1954);
		assertEquals(romanToInt.convert("MCMXC"), 1990);
		assertEquals(romanToInt.convert("MMXIV"), 2014);
		assertEquals(romanToInt.convert("XXII"), 22);
		assertEquals(romanToInt.convert("XL"), 40);
		assertEquals(romanToInt.convert("XC"), 90);
		assertEquals(romanToInt.convert("CD"), 400);
		assertEquals(romanToInt.convert("CM"), 900);
		assertEquals(romanToInt.convert("MCMIV"), 1904);
		assertEquals(romanToInt.convert("CCVII"), 207);
		assertEquals(romanToInt.convert("MLXVI"), 1066);
	}

}
