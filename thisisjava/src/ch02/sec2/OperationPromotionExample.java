package ch02.sec2;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 20;
		int result1 = v1 + v2;
		System.out.println(result1);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result2 = v3 + v4 + v5;
		System.out.println(result2);
		
		char v6 = '가';
		char v7 = '나';
		int result3 = v6 + v7;
		System.out.println(result3);
		
		//정수의 연산은 정수
		int v8 = 10;
		int result4 = v8 / 3;
		double result5 = v8 / 3;
		double result6 = (double)(v8 / 3);
		System.out.println(result4);
		System.out.println(result5);		
		System.out.println(result6);
		
		//double타입 변환 후 연상
		double result7 = v8 / 3.0;  
		double result8 = (double)v8 / 3;
		System.out.println(result7);
		System.out.println(result8);
		
		//+연산
		int result9 = 10 + 7 + 8;
		System.out.println(result9);
		
		String result10 = 10 + 7 + "8";
		System.out.println(result10);

		String result11 = 10 + "7" + 8;
		System.out.println(result11);
		
		String result12 = "10" + 7 + 8;
		System.out.println(result12);

		String result13 = "10" + (7 + 8);
		System.out.println(result13);
		
		
		
		
		
	}
}
