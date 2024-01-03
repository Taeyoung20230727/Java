package ch03.sec01;

/*
 * 78p 
 */


// 연산자는 int 타입에 넣어야함
public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("x: " + x);
		
		byte b = 100;
		int y = -b;
		System.out.println("y: " + y);
		
	}
	
}
