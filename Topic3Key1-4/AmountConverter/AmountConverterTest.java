package AmountConverter;

import static org.junit.Assert.*;

import org.junit.Test;

public class AmountConverterTest {

	@Test
	public void testForConvert() {
		AmountConverter amountConverter = new AmountConverter("25.04");
		assertEquals(amountConverter.toText(), " twenty five and 4/100 dollars");
		
		amountConverter = new AmountConverter("225.33");
		assertEquals(amountConverter.toText(), " two hundred twenty five and 33/100 dollars");

		amountConverter = new AmountConverter("2525.05");
		assertEquals(amountConverter.toText(), " two thousand five hundred twenty five and 5/100 dollars");
	
		amountConverter = new AmountConverter("22512.33");
		assertEquals(amountConverter.toText(), " twenty two thousand five hundred twelve and 33/100 dollars");
	
		amountConverter = new AmountConverter("635225.33");
		assertEquals(amountConverter.toText(), " six hundred thirty five thousand two hundred twenty five and 33/100 dollars");
		
		amountConverter = new AmountConverter("1678225.33");
		assertEquals(amountConverter.toText(), " one millon six hundred seventy eight thousand two hundred twenty five and 33/100 dollars");
	
		amountConverter = new AmountConverter("89087656.33");
		assertEquals(amountConverter.toText(), " eighty nine millon thousand six hundred fifty six and 33/100 dollars");
		
		amountConverter = new AmountConverter("123456789.33");
		assertEquals(amountConverter.toText(), " one hundred twenty three millon four hundred fifty six thousand seven hundred eighty nine and 33/100 dollars");
	}

	@Test
	public void testHowManyDigits() {

		AmountConverter amountConverter = new AmountConverter("280919.7");
		assertEquals(amountConverter.howManyDigits(), 6);

		amountConverter = new AmountConverter("123456789.3");
		assertEquals(amountConverter.howManyDigits(), 9);
	}

}
