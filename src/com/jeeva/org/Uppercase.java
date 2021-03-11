package com.jeeva.org;


public class Uppercase {
	public static void main(String[] args) {
		int upper = 0, lower = 0, dig=0, nc=0;
		String s = "The Letter word is @ 123456 ";

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if (Character.isLowerCase(ch)) {
				lower++;
			} else if (Character.isUpperCase(ch)) {
				upper++;
			}else if (Character.isDigit(ch)) {
				dig++;
			}else {
				nc++;
			}
			
		}
		System.out.println("Uppercase letter is "+upper);
		System.out.println("Lower case letter is "+lower);
		System.out.println("Digit is "+dig);
		System.out.println("Number count  "+nc);
	}

}
