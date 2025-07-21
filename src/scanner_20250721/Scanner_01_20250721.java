package scanner_20250721;

import java.util.Scanner;

public class Scanner_01_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); //scanner라는 객체를 저렇게 선언해서 써야함
		
		System.out.println("당신이 제일 좋아하는 숫자를 입력 하세요 : ");
		int num1 =scanner.nextInt(); //사용자로 부터 정수를 입력 받아 정수 변수를 num1에 저장 하겠다.
		System.out.println("당신이 제일 좋아하는 숫자는 "+ num1 + "입니다.");
		scanner.close(); // 사용했으면 닫아줘야 함. 필수임.
		
	}

}
