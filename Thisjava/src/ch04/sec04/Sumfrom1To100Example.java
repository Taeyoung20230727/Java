package ch04.sec04;

/*
 * 126p 
 */

public class Sumfrom1To100Example {
	public static void main(String[] args) {
		
	int sum = 0;
	int i;
	
	for(i=1; i <= 100; i++) {
		sum += i;
	}
		
	System.out.println("1~" + (i-1) + "합 : " + sum);
	}
	
}
