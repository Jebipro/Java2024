package kjs.sec02.class02;

public class Worker extends Person {
	void work() {
		System.out.println("Go to work");
	}

	void wake() {
		System.out.println("Wake up at 6.");
		work();
	}
}