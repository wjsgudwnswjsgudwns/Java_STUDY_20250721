package chapter05_20250721;

public class Chapter05_03_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열 사용시 주의사항
		int[] intArr = {10, 20, 30, 40, 50};
		
//		System.out.println(intArr[5]); 
		// 배열의 범위를 벗어난 오류 out of bounds error 발생 
		// 항상 기억하자. 배열의 index는 0,1,2,3,4...이다.
		
		
//		intArr[5] = 300;	
		// 중간에 넣을 수 없다.
//		System.out.println(intArr[5]);	
		// 배열의 범위를 벗어난 오류 out of bounds error 발생
		
		
		for(int i=0;i<=4;i++) {
//			System.out.println(intArr[5]);
			// 배열의 범위를 벗어난 오류 out of bounds error 발생
		}
		
		String[] strArr = {"Kor", "Jap", "USA"};
		System.out.println(strArr[1]+7777);	// 출력결과를 문자열로 바뀜
		
		String[] strArr2 = new String[5];
		System.out.println(strArr[2]+7777);	// null 값이 "null"이라는 문자열로 바뀌면서 null7777로 바뀜
		
		System.out.println("====================================================");
		
		int[] intArr2 = {60, 70, 80, 90, 100,1,123,4,2315,123,321415,823,13251,3214,43124,647,9,5695,4,35,73,73,35,635,74};
		// 배열의 원소가 몇개인지 셀 수 없을떄
		
		System.out.println(intArr2.length); // 배열의 원소가 몇개인지 알려줌
		
		System.out.println("====================================================");
		
		int arrLength = intArr2.length;
		for(int i=0;i<intArr2.length;i++) {	// 배열의 길이만큼만 반복되게
			System.out.println(intArr2[i]);
		}
		
	}

}
