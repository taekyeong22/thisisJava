package ch03.sec3;

public class OperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		z = x++;
		System.out.println("z: "+ z);
		System.out.println("x: "+ x);
		
		z = ++x;
		System.out.println("z: "+ z);
		System.out.println("x: "+ x);
		
		z = ++x + y++;
		System.out.println("z: "+ z);
		System.out.println("x: "+ x);
		System.out.println("y: "+ y);
		
		//CompareOperator
		int num1 = 1;
		double num2 = 1.0;
		boolean result1 = (num1 == num2);
		System.out.println(result1);
		
		float num3 = 0.1f;
		double num4 = 0.1;
		System.out.println((double)num3); //0.10000000149011612
		boolean result2 = (num3 == num4); //float와 double의 정밀도 차이로 인해 false
		boolean result3 = (num3 == (float)num4);
		System.out.println(result2);
		System.out.println(result3);
		
		String str1 = "자바";
		String str2 = "Java";
		boolean result4 = (str1.equals(str2));
		boolean result5 = (!str1.equals(str2));
		System.out.println(result4);
		System.out.println(result5);		
		
	}
}
