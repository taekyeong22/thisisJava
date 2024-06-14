package ch04.sec4;

public class BreakExample {
	public static void main(String[] args) {
//		while(true){
//			int num = (int)(Math.random() * 6) + 1;
//			System.out.println(num);
//			if(num == 6) {
//				break;
//			}
//		}
//		System.out.println("프로그램종료");
//		
//		for(char upper = 'A'; upper <= 'Z'; upper++) {
//			for(char lower = 'a'; lower <= 'z'; lower++) {
//				System.out.println(upper + "=" + lower);
//				if(lower == 'g') {
//					break;
//				}
//			}
//		}
//	
//		System.out.println("프로그램 실행종료");
		
		
		Outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "=" + lower);
				if(lower == 'g') {
					break Outter;
				}
			}
		}
	
		System.out.println("프로그램 실행종료");
	}
}
