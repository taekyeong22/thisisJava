package ch04.sec4;

public class ForExample {
	public static void main(String[] args) {
		//for문에서 float 사용 금지
		for(float x = 0.1f; x <= 1.0f; x+=0.1f) {
			System.out.println(x);
		}
	}
}
