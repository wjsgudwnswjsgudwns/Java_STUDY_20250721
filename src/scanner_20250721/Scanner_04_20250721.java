package scanner_20250721;

import java.util.Scanner;

public class Scanner_04_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100 사이의 정수 중 컴퓨터가 생각한 숫자를 맞추는 게임
		Scanner scanner = new Scanner(System.in);
		int comNumber = (int) (Math.random()*100) + 1;
		
		System.out.println("***** 숫자 맞추기 *****");
		System.out.println("** 1부터 100사이의 숫자를 맞춰보세요. **");
		int count = 0;
		while (true) {
			count ++;
			
			System.out.println("숫자를 입력 하세요 (0)입력시 종료 : ");
			int userNum = scanner.nextInt();
			
			if (userNum == 0) {
				break;
			}
			
			if (userNum > comNumber) {
				System.out.println("당신의 입력한 값이 너무 큽니다.");
			} else if (userNum < comNumber) {
				System.out.println("당신의 입력한 값이 너무 작습니다.");
			} else {
				System.out.println("정답입니다. " + count + "번 입력하셨습니다.");
				break;
			}
		}
	}

}
