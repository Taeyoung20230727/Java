package sub3;

import java.io.Serializable;

public class Apple implements Serializable {		// 직렬화 선언
 	
	
	private static final long serialVersionUID = 1L;	// 객체의 문서버전, 위에 Apple에 마우스대고 add default누름
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		
		this.country = country;
		this.price = price;
	}

	public void show() {
		System.out.println("-----------------------");
		System.out.println("원산지 : " + country);
		System.out.println("가격 : " + price);
		System.out.println("-----------------------");
		
	}
	
	
	
	
}
