package com.exception;

public class tryandfinal {
	public static void main(String[] args) {

		System.out.println("Main Block is started..!");
//		try {
//            
//			int i =10/0;
//			
//		} finally {
//			System.out.println("i am From the final Blcok ....!");
//		}

//		System.out.println("main( ) method started...");
//		try {
//			System.out.println("try block start");
//			String s = null;
//			int i = s.length();
//			System.out.println(i);
//			System.out.println("try block end");
//		} catch (ArithmeticException e) {
//			System.out.println("in catch block");
//			e.printStackTrace();
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("main( ) method ended...");

		try {
			System.out.println("try blcok is started..");
			int i = 10 / 0;
			System.out.println("try block is ended..");

		} catch (Exception e) {
			System.out.println("Error find");
		} finally {
			System.out.println(" Iam from the finally block");
		}

	}
}
