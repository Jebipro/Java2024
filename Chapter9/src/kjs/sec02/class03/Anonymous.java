package kjs.sec02.class03;

public class Anonymous {
//	RemoteController tv = new TV();
	RemoteController tv = new RemoteController() {
			public void TurnOn() {
				System.out.println("Turn on TV.");
			}
			
			public void TurnOff() {
				System.out.println("Turn off TV.");		
			}
	};
	
	public void TVControl() {
		RemoteController localtv = new RemoteController() {
			public void TurnOn() {
				System.out.println("Turn on TV.");
			}
			
			public void TurnOff() {
				System.out.println("Turn off TV.");		
			}
		};
		
		localtv.TurnOn();
		localtv.TurnOff();
	}
	
	public void TVTurnOnAndTurnOff(RemoteController rc) {
		rc.TurnOn();
		rc.TurnOff();
	}
}