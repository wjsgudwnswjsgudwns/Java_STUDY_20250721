package java_20250721;

public class Ex_03_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if (i%2 == 1) {
				sum =sum + i;
			}
		}
		System.out.println(sum);
	}

}
