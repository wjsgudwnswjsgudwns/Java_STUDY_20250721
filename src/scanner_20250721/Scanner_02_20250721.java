package scanner_20250721;

import java.util.Scanner;

public class Scanner_02_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {	//무한루프
		Scanner scanner = new Scanner(System.in); //scanner라는 객체를 저렇게 선언해서 써야함
		
		System.out.println("종료하려면 나이에 0을 입력하세요.");
		
		System.out.print("당신의 이름을 입력하세요 : ");
		String str = scanner.nextLine(); // 문자열 받기
		
		System.out.print("당신의 나이를 입력하세요 : ");
		int age = scanner.nextInt(); // 정수 받기
		
		if (age == 0) {
			System.out.println("종료합니다.");
			break;
		}
		
		System.out.println("입력한 이름 : " + str);
		System.out.println("당신의 나이 : " + age);
		}
	}

}
