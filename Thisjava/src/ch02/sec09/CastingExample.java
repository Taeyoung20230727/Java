package ch02.sec09;
/*
 * 교재 58p
 * 
 */

public class CastingExample {
	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println("result1: " + result1);
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2;
		System.out.println("result2: " + result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5;
		System.out.println("result3: " + result3);
		
		int v8 = 10;
		int result5 = v8 / 4;
		System.out.println("result5: " + result5);
		
		int v9 = 10;
		double result6 = v9 / 4.0;
		System.out.println("result6: " + result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11;
		System.out.println("result7: " + result7);
		
	}		
}
