package java_array_20250721;

public class Ex_05_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		int times=1; // 모든 원소를 곱할거기 때문에 초기화를 1로 지정
		for(int i=0;i<arr.length;i++) {
			times = times * arr[i];
		}
		System.out.println(times);		// 모든 원소 곱
	}

}
