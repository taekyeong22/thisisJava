package ch02.sec2;

public class Calculator {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int result = x + y;
		System.out.println(result);
		
		int var1 = 0b1011;
		int var2 = 0206;
		int var3 = 365;
		int var4 = 0xB3;
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
			
		long var5 = 10;
		long var6 = 20L;
		//long var7 = 100000000000000;
		long var8 = 100000000000000L;
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var8);
		
		char var7 = '가';
		//char var8 = '';
		char var9 = ' ';
		System.out.println(var7);
		
		float var10 = 0.1234567890123456789f;
		double var11 = 0.1234567890123456789;
		System.out.println(var10);
		System.out.println(var11);

		double var12 = 3e6;
		float var13 = 3e6F;
		double var14 = 2e-3;
		System.out.println(var12);
		System.out.println(var13);
		System.out.println(var14);
	}

}
