package test2;

/*
 *  날짜 : 2023/12/29
 *  이름 : 정태영
 *  내용 : 자바 팩토리얼 재귀 메서드 연습문제 
 *  
 */

public class Test08 {

	public static void main(String[] args) {
		
		
		System.out.println("3! = " +factorial(3));
		System.out.println("4! = " +factorial(4));
		System.out.println("5! = " +factorial(5));
	}
	
	public static int factorial(int n) {
		
		if (n <= 1) {
			return 1;
		}
		
		return n * factorial(n-1); // 왜 -   : !은 n*n-1*n-2~~라 줄어들어야함
	}
	
	
}

