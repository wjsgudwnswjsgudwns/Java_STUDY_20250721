package chapter05_20250721;

public class Chapter05_01_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열을 선언과 동시에 초기화
		int[] intArr = {10, 20, 30, 40, 50};
		double[] doubleArr = {3.14, 5.18, 6.97, 0.27, 7.49};
		String[] strArr = {"Kor", "Jap", "USA", "Fra", "Ger"};
		boolean[] flagArr = {true, false, true, true};
		
		// 배열의 크기만 지정하고 기본값으로 초기화
		int[] intArr2 = new int[5]; // 4바이트(정수형) 방이 5개 만들어짐 -> 0으로 초기화됨 -> int[] intArr2 = {0, 0, 0, 0, 0};
		intArr[0] = 100; // index 0부터 시작해서 원하는 위치에 맘대로 5개를 넣어주면 됨.
		intArr[2] = 60;
		intArr[3] = 80;
		
		double[] doubleArr2 = new double[3]; // double[] doubleArr2 = {0.0, 0.0, 0.0};
		String[] strArr2 = new String[3];	// String[] strArr2 = {null, null, null}; 
		boolean[] flagArr2 = new boolean[4]; // boolean[] flagArr2 = {false, false, false, false};
		
		// new 연산자를 사용하여 배열의 선언과 동시에 초기화
		int[] intArr3 = new int[] {1, 2, 3, 4, 5, 6};
		String[] strArr3 = new String[] {"aaa","bbb","ccc"};
		
	}

}