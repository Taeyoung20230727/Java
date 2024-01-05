package ch03.sec01;

/*
 * 80p 
 */


// 연산자는 int 타입에 넣어야함
public class IncreseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("---------------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("---------------------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("---------------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("---------------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);		
	}
	
}
