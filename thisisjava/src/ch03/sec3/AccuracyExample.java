package ch03.sec3;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		
		double pieceUnit = 0.1;
		int totalPieces = apple * 10;
		
		int number = 7;
		
		double result1 = apple - number * pieceUnit;
		System.out.println(result1); //정확한 계산값 no => 정수로 계산해야한다
		
		int result2 = totalPieces - number; 
		System.out.println(result2);
		System.out.println(result2 / 10);  //정수 나누기 정수는 정수
		System.out.println(result2 / 10.0);
	}
}
