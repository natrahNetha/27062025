package com.exception;

import java.util.Scanner;

public class StudentResult {

	public void checkMarks(int Marks) throws InvalidMarksException {

		if (Marks < 0 || Marks > 100) {
			throw new InvalidMarksException("Plase Enter the Markers btw 0-100 only");
		}
		if (Marks > 50) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

	public static void main(String[] args) {
		StudentResult s = new StudentResult();
		Scanner s1 = new Scanner(System.in);

		try {

			
			System.out.println("Enter The number");
			int nextInt = s1.nextInt();
			s.checkMarks(nextInt);
			
			
		} catch (InvalidMarksException e) {
			// TODO: handle exception
			System.out.println("Error" + e.getMessage());
		} finally {
			System.out.println(" i am From the finally Block ");
		}
	}

}
