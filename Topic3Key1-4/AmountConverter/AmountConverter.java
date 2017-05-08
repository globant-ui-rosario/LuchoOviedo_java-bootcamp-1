package AmountConverter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AmountConverter {

	private int dolar, cents;
	private String textNumber;

	public int getDolar() {
		return dolar;
	}

	public int getCents() {
		return cents;
	}

	static final String[] numberNames = { " zero", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };

	static final String[] hundredNames = { " zero", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };

	public AmountConverter(String number) {
		BigDecimal amBigDecimal = new BigDecimal(number);
		this.dolar = amBigDecimal.intValue();
		this.cents = amBigDecimal.subtract(amBigDecimal.setScale(0, RoundingMode.FLOOR))
				.movePointRight(amBigDecimal.scale()).intValue();
		this.textNumber = null;
	}

	public int howManyDigits() {
		int numberOfDigits = 0;
		int number = this.getDolar();

		while (number != 0) {

			number = number / 10;
			numberOfDigits++;

		}

		return numberOfDigits;

	}

	public String toText() {
		if (this.textNumber == null) {
			textNumber = new String();
		}

		switch (this.howManyDigits()) {
		case 1:
			readOneDigitNumber(this.getDolar());
			break;
		case 2:
			readTwoDigitsNumber(this.getDolar());
			break;
		case 3:
			readThreeDigitsNumber(this.getDolar());
			break;
		case 4:
			readFourDigitsNumber(this.getDolar());
			break;
		case 5:
			readFiveDigitsNumber(this.getDolar());
			break;
		case 6:
			readSixDigitsNumber(this.getDolar());
			break;
		case 7:
			readSevenDigitsNumber(this.getDolar());
			break;
		case 8:
			readEightDigitsNumber(this.getDolar());
			break;
		case 9:
			readNineDigitsNumber(this.getDolar());
			break;
		}

		return textNumber += " and " + this.getCents() + "/100 dollars";

	}

	public void readOneDigitNumber(int number) {

		this.textNumber += numberNames[number];
	}

	private void readTwoDigitsNumber(int number) {

		if (number < 20) {

			this.textNumber += numberNames[number];

		} else {

			int position = number / 10;

			this.textNumber += hundredNames[position];

			if ((number % 10) > 0) {

				position = number % 10;
				this.textNumber += numberNames[position];
			}

		}
	}

	private void readThreeDigitsNumber(int number) {

		if ((number / 100) > 0) {

			int position = number / 100;
			this.textNumber += numberNames[position] + " hundred";
			int twoDigits = number % 100;
			this.readTwoDigitsNumber(twoDigits);
		}
	}

	private void readFourDigitsNumber(int number) {

		if ((number / 1000) > 0) {

			int position = number / 1000;
			this.textNumber += numberNames[position] + " thousand";
			int threeDigitsNumber = number % 1000;
			this.readThreeDigitsNumber(threeDigitsNumber);

		}

	}

	private void readFiveDigitsNumber(int number) {

		if ((number / 1000) > 0) {
			int twoDigitsNumber = number / 1000;
			this.readTwoDigitsNumber(twoDigitsNumber);
			this.textNumber += " thousand";
			int threeDigitsNumber = number % 1000;
			this.readThreeDigitsNumber(threeDigitsNumber);
		}

	}

	private void readSixDigitsNumber(int number) {

		if ((number / 1000) > 0) {
			int threeDigitsNumber = number / 1000;
			this.readThreeDigitsNumber(threeDigitsNumber);
			this.textNumber += " thousand";
			threeDigitsNumber = number % 1000;
			this.readThreeDigitsNumber(threeDigitsNumber);
		}

	}

	private void readSevenDigitsNumber(int number) {

		if ((number / 1000000) > 0) {
			int position = number / 1000000;
			this.textNumber += numberNames[position] + " millon";
			int sixDigitsNumber = number % 1000000;
			this.readSixDigitsNumber(sixDigitsNumber);
		}

	}

	private void readEightDigitsNumber(int number) {
		if ((number / 1000000) > 0) {
			int twoDigitsNumber = number / 1000000;
			this.readTwoDigitsNumber(twoDigitsNumber);
			this.textNumber += " millon";
			int sixDigitsNumber = number % 1000000;
			this.readSixDigitsNumber(sixDigitsNumber);
		}
	}

	private void readNineDigitsNumber(int number) {
		if ((number / 1000000) > 0) {
			int threeDigitsNumber = number / 1000000;
			this.readThreeDigitsNumber(threeDigitsNumber);
			this.textNumber += " millon";
			int sixDigitsNumber = number % 1000000;
			this.readSixDigitsNumber(sixDigitsNumber);
		}

	}

}
