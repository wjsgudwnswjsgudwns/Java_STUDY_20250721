package java_array_20250721;

public class Ex_01_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {90,80,70,100,85};
		
		int avg = 0;
		for(int sum : arr) {
			avg += sum;
		}
		
		System.out.println("평균 : "+avg/(double) arr.length);	
// 합계/길이 | 소숫점이 날라갈것을 생각해서 실수로 강제 형변환을 해야함. 나눗셈 할때 꼭 기억하자.
	}

}
