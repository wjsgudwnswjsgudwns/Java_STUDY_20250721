package chapter05_20250721;

public class Chapter05_04_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {10,20,30,40,50}; // 1차원 배열
		
		int[][] intArr2 = new int[4][3]; // 행과 열로 이루어진 2차원 배열은 나중에 초기화 해도 된다. *4행 3열*
		System.out.println(intArr2[0][0]); // 일단 0으로 초기화가 됐다는걸 알 수 있음.
		
		int[][] arr2 = { 
						 {10,20},
						 {30,40},
						 {50,60} 
						 		  }; // 2차원 배열 선언과 동시에 특정 값으로 초기화 *3행 2열*
		System.out.println(arr2[2][1]); // 60
		
		System.out.println("==============================================================");
		
		// for문을 사용하여 2차원 배열의 모든 원소를 출력
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=1;j++) {
				System.out.println(arr2[i][j]);
			}
		}
		
		System.out.println("==============================================================");
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.println(arr2[i][j]);
			}
		}
		
	}

}
