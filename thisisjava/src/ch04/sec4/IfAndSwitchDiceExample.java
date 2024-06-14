package ch04.sec4;

public class IfAndSwitchDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;
		
		//if
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num == 2) {
			System.out.println("2번이 나왔습니다.");			
		}else if(num == 3) {
			System.out.println("3번이 나왔습니다.");			
		}else if(num == 4) {
			System.out.println("4번이 나왔습니다.");		
		}else if(num == 5) {
			System.out.println("5번이 나왔습니다.");			
		}else {
			System.out.println("6번이 나왔습니다.");			
		}
		
		//switch
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다.");
		}
	}
}
