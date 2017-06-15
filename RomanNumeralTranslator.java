package labs;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralTranslator {
	static StringBuilder map;
	Map<String, Map<Character, String>> bigMap = new HashMap<>();

	public RomanNumeralTranslator() {
		super();
		map = new StringBuilder();
		// TODO Auto-generated constructor stub
	}

	public String translateRomanNumbers(char numberEntry, String whichMap) {

		Map<Character, String> ones = new HashMap<>();

		ones.put('0', "");
		ones.put('1', "I");
		ones.put('2', "II");
		ones.put('3', "III");
		ones.put('4', "IV");
		ones.put('5', "V");
		ones.put('6', "VI");
		ones.put('7', "VII");
		ones.put('8', "VIII");
		ones.put('9', "IX");
		bigMap.put("ones", ones);

		Map<Character, String> tens = new HashMap<>();
		tens.put('0', "");
		tens.put('1', "X");
		tens.put('2', "XX");
		tens.put('3', "XXX");
		tens.put('4', "XL");
		tens.put('5', "L");
		tens.put('6', "LX");
		tens.put('7', "LXX");
		tens.put('8', "LXXX");
		tens.put('9', "XC");
		bigMap.put("tens", tens);

		Map<Character, String> hundreds = new HashMap<>();
		hundreds.put('0', "");
		hundreds.put('1', "C");
		hundreds.put('2', "CC");
		hundreds.put('3', "CCC");
		hundreds.put('4', "CD");
		hundreds.put('5', "D");
		hundreds.put('6', "DC");
		hundreds.put('7', "DCC");
		hundreds.put('8', "DCCC");
		hundreds.put('9', "CM");
		bigMap.put("hundreds", hundreds);

		Map<Character, String> thousands = new HashMap<>();
		thousands.put('0', "");
		thousands.put('1', "M");
		thousands.put('2', "MM");
		thousands.put('3', "MMM");
		thousands.put('4', "MMMv");
		thousands.put('5', "v");
		thousands.put('6', "vM");
		thousands.put('7', "vMM");
		thousands.put('8', "vMMM");
		thousands.put('9', "Mx");
		bigMap.put("thousands", thousands);

		Map<Character, String> tenthousands = new HashMap<>();
		tenthousands.put('0', "");
		tenthousands.put('1', "x");
		tenthousands.put('2', "xx");
		tenthousands.put('3', "xxx");
		tenthousands.put('4', "xl");
		tenthousands.put('5', "l");
		tenthousands.put('6', "lx");
		tenthousands.put('7', "lxx");
		tenthousands.put('8', "lxxx");
		tenthousands.put('9', "cx");
		bigMap.put("tenthousands", tenthousands);

		Map<Character, String> hundredthousands = new HashMap<>();
		hundredthousands.put('1', "c");
		hundredthousands.put('2', "cc");
		hundredthousands.put('3', "ccc");
		hundredthousands.put('4', "cd");
		hundredthousands.put('5', "d");
		hundredthousands.put('6', "dc");
		hundredthousands.put('7', "dcc");
		hundredthousands.put('8', "dccc");
		hundredthousands.put('9', "cm");
		hundredthousands.put('0', "");
		bigMap.put("hundredthousands", hundredthousands);

		Map<Character, String> millions = new HashMap<>();
		millions.put('1', "m");
		millions.put('2', "mm");
		millions.put('3', "mmm");
		millions.put('4', "meleventy");
		millions.put('5', "eleventy");
		millions.put('6', "eleventym");
		millions.put('7', "eleventymm");
		millions.put('8', "eleventymmm");
		millions.put('9', "you broke it ");
		millions.put('0', "");
		bigMap.put("millions", millions);

		System.err.print((bigMap.get(whichMap).get(numberEntry)));
		
		
		map.append(bigMap.get(whichMap).get(numberEntry));
		return bigMap.get(whichMap).get(numberEntry);
	

	}

	public String parseInput(String numberEntry) {
		RomanNumeralTranslator something = new RomanNumeralTranslator();

		char[] characters = numberEntry.toCharArray();

		int place = characters.length;

		if (place == 1) {
			something.translateRomanNumbers(characters[0], "ones");
		}
		if (place == 2) {
			something.translateRomanNumbers(characters[0], "tens");
			something.translateRomanNumbers(characters[1], "ones");
		}
		if (place == 3) {
			something.translateRomanNumbers(characters[0], "hundreds");
			something.translateRomanNumbers(characters[1], "tens");
			something.translateRomanNumbers(characters[2], "ones");
		}
		if (place == 4) {
			something.translateRomanNumbers(characters[0], "thousands");
			something.translateRomanNumbers(characters[1], "hundreds");
			something.translateRomanNumbers(characters[2], "tens");
			something.translateRomanNumbers(characters[3], "ones");
		}
		if (place == 5) {
			something.translateRomanNumbers(characters[0], "tenthousands");
			something.translateRomanNumbers(characters[1], "thousands");
			something.translateRomanNumbers(characters[2], "hundreds");
			something.translateRomanNumbers(characters[3], "tens");
			something.translateRomanNumbers(characters[4], "ones");
		}
		if (place == 6) {
			something.translateRomanNumbers(characters[0], "hundredthousands");
			something.translateRomanNumbers(characters[1], "tenthousands");
			something.translateRomanNumbers(characters[2], "thousands");
			something.translateRomanNumbers(characters[3], "hundreds");
			something.translateRomanNumbers(characters[4], "tens");
			something.translateRomanNumbers(characters[5], "ones");
		}
		if (place == 7) {
			something.translateRomanNumbers(characters[0], "millions");
			something.translateRomanNumbers(characters[1], "hundredthousands");
			something.translateRomanNumbers(characters[2], "tenthousands");
			something.translateRomanNumbers(characters[3], "thousands");
			something.translateRomanNumbers(characters[4], "hundreds");
			something.translateRomanNumbers(characters[5], "tens");
			something.translateRomanNumbers(characters[6], "ones");
		}
		System.err.println(map);
		return map.toString();
	}
	

}
