package ch02.sec2;

public class StringExample {
	public static void main(String[] args) {
		String str1 = "나는 \"자바\"를 배웁니다.";
		String str2 = "나는 \t자바\t를 배웁니다.";
		String str3 = "나는 \n자바\n를 배웁니다.";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		String str4 = "" +
		              "{\n" +
		              "\t\"id\":\"winter\",\n" +
		              "\t\"name\":\"눈꽃송이\"\n" +
		              "}";
		System.out.println(str4);
		System.out.println("===================================");
		
		String str5 = """
					  {
					  	"id":"winter"
					  	"name":"눈꽃송이"
					  }
					  """;	
		System.out.println(str5);		
		System.out.println("===================================");
		
		String str6 = """
				나는 자바를 \
				학습합니다.
				나는 자바 
				고수가 될것..
				""";
		System.out.println(str6);		
		System.out.println("===================================");
	}
}
