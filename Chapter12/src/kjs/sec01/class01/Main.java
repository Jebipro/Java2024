package kjs.sec01.class01;

import java.awt.Toolkit;

public class Main {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i =0; i<5; i++) {
			toolkit.beep();
			System.out.println("TTing");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		
		for(int i =0; i<5; i++) {
			System.out.println("DDong");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}