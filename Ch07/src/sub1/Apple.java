package sub1;

public class Apple {	// 명시하지않았을뿐 Object 상속받는중
	
		private String country;
		private int price;
		
		public Apple(String country, int price) {
			this.country = country;
			this.price = price;
		}

		@Override
		public String toString() {
			return "Apple [hashcode="+hashCode()+" country=" + country + ", price=" + price + "]";
		}
		

		
		
		
}
