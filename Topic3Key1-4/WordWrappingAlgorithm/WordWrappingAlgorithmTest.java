package WordWrappingAlgorithm;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordWrappingAlgorithmTest {
	
	/* In this point I supposed that the strings couldn't have two ' ' in a 
	 * row anywhere and that they didn't contain special characters such as /n /t 	 
	 */
	@Test
	public void test60_30() {

		WordWrapping wordWrapping = new WordWrapping(60, "input string with 30 characters or more");
		assertEquals(wordWrapping.readIt(), "input string with 30 characters or more");
	}
	
	@Test
	public void test604_30() {

		WordWrapping wordWrapping = new WordWrapping(10, "input string with 30 characters or more");
		assertEquals(wordWrapping.readIt(), "input,string,with 30,characters,or more");
	}

	@Test
	public void test7_hw() {

		WordWrapping wordWrapping = new WordWrapping(5, "Hello Word!");
		assertEquals(wordWrapping.readIt(), "Hello,Word!");

	}

	@Test
	public void test3_abcdef() {

		WordWrapping wordWrapping = new WordWrapping(3, "a b c d e f");
		assertEquals(wordWrapping.readIt(), "a b,c d,e f");
	}

	@Test
	public void test5_exc() {

		WordWrapping wordWrapping = new WordWrapping(5, "Excelent");	
		assertEquals(wordWrapping.readIt(), "Excel,ent");
	}
}
