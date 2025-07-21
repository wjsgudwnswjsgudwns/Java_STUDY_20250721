package java_array_20250721;

public class Ex_03_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 3, 7, 3, 3, 5, 3, 6, 9, 3, 3, 3};
		
		int count = 0;	// 3을 카운트 하기 위한 변수
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i] == 3) {
				count++;	//3이 몇개 인지 카운트
			}
		}
		System.out.println(count);	
	}

}
