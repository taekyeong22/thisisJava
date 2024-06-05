package ch03.sec3;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
//		double z = x / y;
		double z = x % y;
		
		//잘못된 코드
		//정수일때 예외 발생
		//System.out.println(x / 0);
		
		//실수일때
		System.out.println(z + 2);
		
		//알맞은 코드
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z + 2);
		}
	}
}
