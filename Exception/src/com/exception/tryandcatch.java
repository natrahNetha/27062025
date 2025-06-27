package com.exception;

public class tryandcatch {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		try {
			String s = "Gangula natraj";
			int length = s.length();
			
			System.out.println(length);

		} catch (Exception e) {
			System.out.println("Error find ");
		//	e.printStackTrace();
		}

	}
}
