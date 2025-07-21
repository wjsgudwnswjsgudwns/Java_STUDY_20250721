package scanner_20250721;

import java.util.Scanner;

public class Scanner_03_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력 (0입력시 프로그램 종료) : ");
		int num = scanner.nextInt();
		
		if (num == 0) {
			System.out.println("종료합니다");
			break;
		}
		
		if (num%2 == 1) {
			System.out.print("홀!!");
		}	else {
			System.out.print("짝!!");
		}
		scanner.close();
		}
	}

}
