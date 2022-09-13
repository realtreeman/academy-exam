package sampleTest;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			String inputValue = scan.nextLine();
			int val = Integer.parseInt(inputValue);
			if(val >= 90 && val<=100) {
				System.out.println("A등급입니다.");
			}else if(val>=80 && val<90) {
				System.out.println("B등급");
			}else if(val>=70 && val<80) {
				System.out.println("C등급");
			}else if(val>=60 && val<70) {
				System.out.println("D등급");
			}else if(val>=0 && val<60)  {
				System.out.println("F등급");
			}else {
				System.out.println("0~100의 점수값을 입력하세요.");
			}
		} catch (Exception e) {
			System.out.println("올바른 값을 입력하세요.");
		}
		
		
		//System.out.println("입력한 값 출력 : " + inputValue);
	}
}
