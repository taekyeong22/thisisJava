package ch03.sec3;

public class BitLogicExample {
	public static void main(String[] args) {
		// 1 true/ 0 false 로 생각
		System.out.println("45 & 25  = " + (45 & 25));
		System.out.println("45 | 25  = " + (45 | 25));
		System.out.println("45 ^ 25  = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("================================");
		
		
		int test = 136;
		byte btest = (byte)test;
		System.out.println(btest);
		
		byte receiveData = (byte)test;
		
		//비트 논리곱 연산으로 부호없는 정수 얻기
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		
		//자바 API로 unsigned(자연수) 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		System.out.println("================================");
		
		
		//BiteShift
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int)Math.pow(2, 3);//2의 3제곱
		System.out.println(result1);
		System.out.println(result2);
		
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int)Math.pow(2, 3);//2의 3제곱
		System.out.println(result3);
		System.out.println(result4);
		System.out.println("================================");
		
		//BiteShift2 (각 byte를 부호없는 정수로 출력)
		//1,2,4,8,16,32,64,128,256,512,1024,...
		//0 0 1 0  0  0  0  0   1   1    0 ...   => 722
		//[00000000][00000000][00000011][00000100]
		//     0         0        3         4       -==> 부호없는 정수?
		int value = 772; 
		
	    //우측으로 3byte(24bit) 이동 후 [00000000] 읽기 
		byte byte1 = (byte) (value >>> 24);
		int int1 = byte1 & 255;
		System.out.println(int1);
	
	    //우측으로 2byte(16bit) 이동 후 [00000000] 읽기 
		byte byte2 = (byte) (value >>> 16);
		int int2 = byte2 & 255;
		System.out.println(int2);
		
	    //우측으로 1byte(8bit) 이동 후 [00000011] 읽기 
		byte byte3 = (byte) (value >>> 8);
		int int3 = byte3 & 255;
		System.out.println(int3);
		
	    //끝 [00000100] 읽기 
		byte byte4 = (byte) value;
		int int4 = byte4 & 255;
		System.out.println(int4);		
	}
}
