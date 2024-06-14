package ch05.sec5;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		//참조할 객체자 없으므로 nullPointerException
		int[] intArry = null;
//		intArry[0] = 10; 
		
		String str = null;
//		System.out.println(str.length());
		
		//쓰레기 객체
		String hobby = "여행";
		hobby = null; // "여행"에 해당되는 String 객체 -> 쓰레기 객체
		
		String kind1 = "자동차";
		String kind2 = kind1; //kind1 변수에 저장된 번지를 kind2 변수에 대입
		kind1 = null; // "자동차"에 해당되는 String 객체 -> 쓰레기 객체 아님(kind2에 여전히 참조)
		System.out.println("kind2: " + kind2);
	}
}
