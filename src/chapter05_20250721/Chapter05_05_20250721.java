package chapter05_20250721;

public class Chapter05_05_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 향상된 for문
		
		int[] arr = {10,20,30,40,50};
		// 모든 배열 원소를 출력하는 for문을 작성하시오
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		// 향상된 for문으로 전환
		for( int num : arr) { 
// ***for(임시로 저장할 로컬 변수 : 배열의 이름)*** 
		// *배열에서 하나씩 끄집어 낸다*
			System.out.println(num);
		}
		
		// 다음 배열의 모든 원소 중 짝수만 출력
		int[] numArr = {10,20,30,11,22,33,44,55};
		for(int num : numArr) {
			if(num%2==0) {
				System.out.println(num);
			}
		}
		
	}

}
