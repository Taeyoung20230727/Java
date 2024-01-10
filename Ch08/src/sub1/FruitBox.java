package sub1;

public class FruitBox<T> {	// 치환변수 T를 가지고있다고 <T> 해줌

	private T fruit;		// 치환변수는 T로 많이쓰나 다른문자써도 상관없음
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
}
