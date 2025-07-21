package java_array_20250721;

public class Ex_01_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {90,80,70,100,85};
		
		int avg = 0;
		for(int sum : arr) {
			avg += sum;
		}
		
		System.out.println("평균 : "+avg/arr.length);	// 합계/길이
	}

}
