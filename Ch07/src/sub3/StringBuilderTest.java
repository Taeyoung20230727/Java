package sub3;

/*
 * 날짜 : 2024/01/09
 * 이름 : 정태영
 * 내용 : Java StringBuilder 클래스 실습
 */

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// String immutable 특성
		String str = "Hello";
		System.out.println("str 객체주소 : " + System.identityHashCode(str));		// Hello생성
		
		str += "World";
		System.out.println("str 객체주소 : " + System.identityHashCode(str));		// 새로 생성해서 HelloWorld를 만듬 못덮어씌움
		
		System.out.println("str : " + str);
		
		// String의 immutable 단점을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Hello");	// Hello생성
		
		sb.append("World");
		System.out.println("sb 객체 주소 : "+ System.identityHashCode(sb) );	// 덮어씌워서 HelloWorld 만듬
		
		System.out.println("sb : " + sb);
	}
}
