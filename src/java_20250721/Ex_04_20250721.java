package java_20250721;

public class Ex_04_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int odd =0;
		
		for (int i=1;i<=100;i++) {
			odd = 0;
			if(i%2==1) {
			}
			odd = (i+1)/2;
		}
		
		int even=0;
		for (int i=1;i<=100;i++) {
			even =0;
			if(i%2==0) {
			}
			even = i/2;
		}
		
		System.out.println("홀수 갯수 : " + odd + "개");
		System.out.println("짝수 갯수 : " + even + "개");
	}

}
