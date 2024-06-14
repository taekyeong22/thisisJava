package ch04.sec4;

public class SwitchExample {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		}
		
		//Switch Expresstions
		switch(grade) {
			case 'A', 'a' -> {
				System.out.println("우수 회원입니다.");
			}
			case 'B', 'b' -> {
				System.out.println("일반 회원입니다.");
			}
			default -> {
				System.out.println("손님입니다.");
			}
		}
		
		//등급에 따라 score 변수 대입 
		int score1 = switch(grade) {
			case 'A' -> 100;
			case 'B' -> {
				int result = 100 - 20;
				yield result;
			}
			default -> 60; //이 경우 반드시 default가 필요
		};
		System.out.println(score1);
	}
}
