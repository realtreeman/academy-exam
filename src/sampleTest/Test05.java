package sampleTest;

//메소드 바꾸는거 오버로드
public class Test05 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int result1 = cal.add(10,12);
		int result2 = cal.add("10",12);
		int result3 = cal.add(10,"12");
		int result4 = cal.add("10","12");
		
		System.out.println("결과 1: " + result1);
		System.out.println("결과 2: " + result2);
		System.out.println("결과 3: " + result3);
		System.out.println("결과 4: " + result4);
		
		
	}
}
