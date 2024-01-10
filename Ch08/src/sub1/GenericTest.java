package sub1;
/*
 * 날짜 : 2024/01/10
 * 이름 : 정태영
 * 내용 : Java 제네릭 실습
 */
public class GenericTest {

	public static void main(String[] args) {
		
		Apple a = new Apple("한국",3000);
		Banana b = new Banana("일본",2500);
		
		FruitBox<Apple> box1 = new FruitBox<>();		// 뒤에괄호안 Apple은 생략가능
		FruitBox<Banana> box2 = new FruitBox<>();
		
		box1.setFruit(a);
		box2.setFruit(b);
		
		System.out.println("box1 내용 : " + box1.getFruit());
		System.out.println("box2 내용 : " + box2.getFruit());
		
		
	}
}
