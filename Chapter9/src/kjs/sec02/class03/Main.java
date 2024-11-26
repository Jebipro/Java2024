package kjs.sec02.class03;

public class Main {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
//		anony.tv.TurnOn();
//		anony.tv.TurnOff();
		
//		anony.TVControl();
		
		anony.TVTurnOnAndTurnOff(new RemoteController() {
			public void TurnOn() {
				System.out.println("Turn on TV.");
			}
			
			public void TurnOff() {
				System.out.println("Turn off TV.");		
			}
		  }
	    );
	} 
}