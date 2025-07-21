package java_20250721;

public class Ex_04_02_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oddCount=0;
		int evenCount=0;
		
		for (int i=1;i<=100;i++) {
			if(i%2==1) {	
				oddCount++;
			}	else  {	
				evenCount++;
			}
			
		}
		
		System.out.println("홀수 갯수 : " + oddCount + "개");
		System.out.println("짝수 갯수 : " + evenCount + "개");
	}

}