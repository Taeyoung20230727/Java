package sub7;

/*
 *  날짜 : 2024/01/04
 *  이름 : 정태영
 *  내용 : Java 추상클래스 실습하기
 */

public class AbstractClassTest {

	public static void main(String[] args) {
	
		// Car car = new Car("소나타", "흰색", 0); // 추상클래스는 객체생성 불가능
		
		Car sonata = new sedan("소나타","흰색",0,2000);
		Car bongo = new Truck("봉고","남색",0,0);
		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		bongo.speedUp(60);
		bongo.speedDown(10);
		bongo.show();
	}
	
	
}
