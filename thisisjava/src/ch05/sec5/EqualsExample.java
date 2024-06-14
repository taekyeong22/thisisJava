package ch05.sec5;

public class EqualsExample {
	public static void main(String[] args) {
		String strVal1 = "홍길동";
		String strVal2 = "홍길동";
		
		if(strVal1 == strVal2){
			System.out.println("strVal1과 strVal2은 참조가 같음");
		}else{
			System.out.println("strVal1과 strVal2은 참조가 다름");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2은 문자열이 같음");
		}
		
		String strVal3 = new String("홍길동");
		String strVal4 = new String("홍길동");
		
		if(strVal3 == strVal4){
			System.out.println("strVal3과 strVal4은 참조가 같음");
		}else{
			System.out.println("strVal3과 strVal4은 참조가 다름");
		}
		
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3과 strVal4은 문자열이 같음");
		}
		
		String hobby = "";
		if(hobby.equals("")) {
			System.out.println("hobby변수가 참조하는 String객체는 빈 문자열");
		}
	}
}
