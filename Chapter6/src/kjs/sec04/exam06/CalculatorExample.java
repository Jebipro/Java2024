package kjs.sec04.exam06;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
		
		//정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		
		//직사각형희 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);
		
		//결과 출력
		System.out.println("정사격형의 넓이=" + result1);
		System.out.println("직사각형의 넓이=" + result2);
	}
}