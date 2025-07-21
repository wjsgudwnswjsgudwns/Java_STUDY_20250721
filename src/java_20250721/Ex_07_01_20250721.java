package java_20250721;

public class Ex_07_01_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int odd =0;
		
		for (int i=1;i<=100;i++) {
			if(i%2==1) {
				odd = odd + i;
			}
		}
		
		int even=0;
		for (int i=1;i<=100;i++) {
			if(i%2==0) {
				even = even + i;
			}
		}
		
		System.out.println (odd-even);
	}

}
