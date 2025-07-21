package java_20250721;

public class Ex_06_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			sum = sum + i;
			if(sum>=100) {
				System.out.println(i);
				break;
			}
		}
		System.out.println(sum);
		
	}

}

