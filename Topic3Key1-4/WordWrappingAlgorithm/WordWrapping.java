package WordWrappingAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class WordWrapping {

	private int rowLength;
	private String input;
	private final int one = 1;

	public WordWrapping(int rowLength, String input) {
		this.rowLength = rowLength;
		this.input = input;
	}

	public String readIt() {
		String result = new String();
		String word = new String();
		int rowPosition = rowLength;
		int actualPosition = 0;
		int blankPosition = 0;
		List<String> list = new ArrayList<String>();

		//First you check if the RowLength is greater than the String length
		
		if (rowLength > input.length()) {
			return input;
		} else {
			//In case the if is not achieved, perform a while until you complete the string
			while (rowPosition < input.length()) {
				//If there's a space right in the position where you want to make a wrap, you make a wrap until the space without including it
				if (actualCharBlank(input, rowPosition)) {
					for (int f = actualPosition; f < rowPosition; f++) {
						word += input.charAt(f);
					}
					list.add(word);
					word = new String();
					rowPosition += (rowLength + one);
					actualPosition += (rowLength + one);
				} else {
					//If there's a space in the position next to where you want to make a wrap, make a wrap until the space without including it
					if (nextCharBlank(input, rowPosition)) {
						for (int f = actualPosition; f < rowPosition; f++) {
							word += input.charAt(f);
						}
						list.add(word);
						word = new String();
						rowPosition += (rowLength + one);
						actualPosition += (rowLength + one);
					} else {
						//If there's a letter in the position next to where you want to make a wrap,  make a wrap until the last space and start from there for the next wrap
						blankPosition = lastBlankPosition(input, actualPosition, rowPosition);
						if (blankPosition != 0) {
							for (int f = actualPosition; f < blankPosition; f++) {
								word += input.charAt(f);
							}
							list.add(word);
							word = new String();
							rowPosition = (blankPosition + one + rowLength);
							actualPosition = (blankPosition + one);

						} else {
						//If not it's because you can wrap the word and it contains no spaces	
							for (int f = actualPosition; f < rowPosition; f++) {
								word += input.charAt(f);
							}
							list.add(word);
							word = new String();
							rowPosition += rowLength;
							actualPosition += rowLength;
						}
					}

				}

			}
			//Line that adds the final part of the string
			for (int f = actualPosition; f < input.length(); f++) {
				word += input.charAt(f);
			}
			list.add(word);
		}

		int i = 0;
		for (String myWord : list) {
			if (i != 0 && i < list.size()) {
				result += ",";
			}
			result += myWord;
			i++;
		}

		return result;

	}

	public int lastBlankPosition(String word, int initial, int lengthWanted) {
		int position = 0;
		for (int i = initial; i < lengthWanted; i++) {
			if (word.charAt(i) == ' ') {
				position = i;
			}
		}
		return position;
	}

	public boolean actualCharBlank(String word, int position) {
		if (word.charAt(position) == ' ') {
			return true;
		}
		return false;
	}

	public boolean nextCharBlank(String word, int position) {
		if (word.charAt(position++) == ' ') {
			return true;
		}
		return false;
	}

}
