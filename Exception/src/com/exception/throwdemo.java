package com.exception;

public class throwdemo {
	
//	private String getName(int id) throws NoDataFoundException {
//		if (id == 100) {
//			return "Raju";
//		} else if (id == 101) {
//			return "Rani";
//		} else {
//			throw new NoDataFoundException("Invalid Id");
//		}
//	}
//
//	public static void main(String[] args) throws NoDataFoundException {
//		throwdemo d = new throwdemo();
//		d.getName(200);
//	}
	
	 public static void waitForIt() throws InterruptedException {
	        Thread.sleep(1000);  // This line may throw InterruptedException
	        System.out.println("Waited for 1 second");
	    }

	    public static void main(String[] args) {
	        try {
	            waitForIt();
	        } catch (InterruptedException e) {
	            System.out.println("Caught exception: " + e.getMessage());
	        }
	    }
	

}
