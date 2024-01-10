package test3;


abstract class Shape {	//추상클래스
	public abstract void draw();
}

 class Triangle extends Shape {		// 상속받을 클래스 이름
	 @Override
	 public void draw() {
		 System.out.println("draw Triangle!");
	 }
 }
 class Circle extends Shape {		// 상속받을 클래스 이름
	 @Override
	 public void draw() {
		 System.out.println("draw Circle!");
	 }
 
 }

public class Test09 {
	
	public static void main(String[] args) {
		
		Test09 here = new Test09();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}
	public void draw(Shape obj) {		// 상속받을 클래스 이름
		obj.draw();
	}
}
