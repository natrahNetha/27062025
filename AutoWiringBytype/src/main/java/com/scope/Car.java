package com.scope;

public class Car {

	public Car() {
		System.out.println("this is Car constacter...!");
	}

	private Engine engine;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void Drive() {
		int result = engine.start();

		if (result >= 1) {
			System.out.println("Car Started for Journey");
		} else {
			System.out.println("Car have problem..");
		}
	}
}
