package kjs.sec02.class03;

public class Anonymous {
//	RemoteController tv = new TV();
	RemoteController tv = new RemoteController() {
			public void TurnOn() {
				System.out.println("Turn on Tv");
			}
			
			public void TurnOff() {
				System.out.println("Turn off Tv");		
			}
	};


}
