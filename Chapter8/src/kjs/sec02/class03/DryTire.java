package kjs.sec02.class03;

public class DryTire implements Tire {

	int maxSpeed = 100;
	int speed = 0;

	public void SetData(int speed, int distance) {
		this.speed = speed;

	}
	
	public boolean NeedChange() {
		if(speed > maxSpeed)
			return true;
		else
			return false;

	}
}