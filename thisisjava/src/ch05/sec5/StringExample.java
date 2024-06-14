package ch05.sec5;

import java.util.concurrent.atomic.LongAccumulator;

public class StringExample {
	public static void main(String[] args) {
		//문자추출
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		switch(sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
		
		//문자열 길이
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		}else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}
		
		//문자열 대체 
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String 입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);		
		System.out.println(newStr); //oldStr과 다른 새로운 문자열 참조
		
		//문자열 잘라내기
		String ssn2 = "880815-1234567";
		
		String fristNum = ssn2.substring(0, 6);
		String secondNum = ssn2.substring(7); 
		
		System.out.println(fristNum);
		System.out.println(secondNum);
		
		//문자열 찾기
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String subString = subject.substring(location);
		System.out.println(subString);
		
	    location = subject.indexOf("자바");
	    if(location != -1) {
	    	System.out.println("자바와 관련된 책입니다.");
	    }else {
	    	System.out.println("자바와 관련된 책이 아닙니다.");
	    }
	    
	    boolean result = subject.contains("자바");
	    if(result) {
	    	System.out.println("자바와 관련된 책입니다2.");
	    }else {
	    	System.out.println("자바와 관련된 책이 아닙니다2.");
	    }
	    
	    //문자열 분리
	    String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
	    
	    String[] tokens = board.split(",");
	    
	    System.out.println(tokens[0]);
	    System.out.println(tokens[1]);
	    System.out.println(tokens[2]);
	    System.out.println(tokens[3]);
	    System.out.println("=======================");
	    
	    for(int i = 0; i < tokens.length; i++) {
	    	System.out.println(tokens[i]);
	    }
	}
}
