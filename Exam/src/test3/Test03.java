package test3;

class Car{							// Car라는 클래스의 속성 3가지
	private String brand;				// 패턴 인지하기
	private String name;
	private int price;
	
	public Car(String brand, String name, int price) {			// 속성 3가지를 초기화해야함
		this.brand = brand;										// 이렇게 초기화
		this.name = name;
		this.price = price;
	}
	
	public void drive() {
		System.out.println(name+" 운행중...");
	}
	
	public void info() {
		System.out.println("브랜드 : " + brand);
		System.out.println("차량명 : " + name);
		System.out.println("가 격 : " + price);
	}
	
}

public class Test03 {
	public static void main(String[] args) {
		
		Car sonata = null;
		Car bmw = null;
		
		sonata = new Car("현대","소나타", 3000);
		bmw    = new Car("bmw","520d", 5000);
		
		sonata.drive();
		sonata.info();
		
		bmw.drive();
		bmw.info();
		
	}
}
