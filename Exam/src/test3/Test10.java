package test3;

	interface Buyer {
		public void buy();
	}
	interface Seller {
		public void sell();
	}
	
	class Customers implements Buyer,Seller {		// 인터페이스는 상속 , 다중구현 가능
		
		@Override
		public void sell() {
			System.out.println("판매하기");
		}
		@Override
		public void buy() {
			System.out.println("구매하기");
		}
		
	}

public class Test10 {
	public static void main(String[] args) {
		Buyer buyer = new Customers();			// 앞에꺼 따라가는게 아닌 위에 저장되어있는 클래스명 가져오기
		Seller seller = new Customers();
		
		buyer.buy();
		seller.sell();
	}
}
