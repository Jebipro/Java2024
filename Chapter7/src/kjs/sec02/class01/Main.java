package kjs.sec02.class01;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalHospital hospital = new AnimalHospital();

		Dog d1 = new Dog(20);
		hospital.CheckPatient(d1);

		Cat c1 = new Cat(0.5);
		hospital.CheckPatient(c1);

	}
}