package chapter05_20250721;

public class Chapter05_02_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr1 = {100, 200, 300, 400, 500};
		
		// 배열 numArr1의 모든 원소 출력
		for(int i=0;i<=4;i++) {	
			System.out.println( numArr1[i] );
		}
		
		System.out.println("============================================================");
		
		// 배열의 모든 원소의 합을 구하시오.
		int sum=0;
		for(int i=0;i<=4;i++) {
			sum += numArr1[i];
		}
		System.out.println(sum);
	}

}