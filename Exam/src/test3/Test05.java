package test3;

	
	class Vehicle {
		private String name;
		private int price;
		
		public Vehicle (String name, int price) {  // 생성자
			this.name = name;
			this.price = price;
		}
		
		public void info() {
			System.out.println("========");
			System.out.println("차량명 : "+name);
			System.out.println("가격 : "+price);
			System.out.println("========");
		}
		
	}

	class CarFactory {
		private static CarFactory instance = new CarFactory();		
		private CarFactory() {}
		
		public static CarFactory getInstance() {			
			return instance;
		}
		
		public Vehicle createCar(String name, int price) {		// return 되는 값을보고 결정(Vehicle)
				return new Vehicle(name,price);
		}
		
	}

public class Test05 {
	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();		// private 이라 new CarFactory로 못부름
		
		Vehicle avante = factory.createCar("아반테", 2500);
		Vehicle sonata = factory.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();
		
	}
	
	
	
	
	
}