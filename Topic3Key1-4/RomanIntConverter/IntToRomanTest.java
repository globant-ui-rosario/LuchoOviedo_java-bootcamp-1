package RomanIntConverter;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntToRomanTest {

	@Test
	public void testSomeCases() {
		assertEquals("I", IntToRoman.convert(1));
		assertEquals("III", IntToRoman.convert(3));
		assertEquals("IV", IntToRoman.convert(4));
		assertEquals("V", IntToRoman.convert(5));
		assertEquals("VIII", IntToRoman.convert(8));
		assertEquals("IX", IntToRoman.convert(9));
		assertEquals("X", IntToRoman.convert(10));
		assertEquals("L", IntToRoman.convert(50));
		assertEquals("C", IntToRoman.convert(100));
		assertEquals("D", IntToRoman.convert(500));
		assertEquals("M", IntToRoman.convert(1000));
	}

	@Test
	public void testDificultCases() {

		assertEquals(IntToRoman.convert(1954), "MCMLIV");
		assertEquals(IntToRoman.convert(1990), "MCMXC");
		assertEquals(IntToRoman.convert(2014), "MMXIV");
		assertEquals(IntToRoman.convert(32), "XXXII");
		assertEquals(IntToRoman.convert(40), "XL");
		assertEquals(IntToRoman.convert(90), "XC");
		assertEquals(IntToRoman.convert(400), "CD");
		assertEquals(IntToRoman.convert(900), "CM");
		assertEquals(IntToRoman.convert(1804), "MDCCCIV");
		assertEquals(IntToRoman.convert(408), "CDVIII");
		assertEquals(IntToRoman.convert(1066), "MLXVI");
		assertEquals(IntToRoman.convert(20), "XX");

	}

}
