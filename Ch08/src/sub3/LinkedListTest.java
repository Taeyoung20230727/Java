package sub3;

import java.util.LinkedList;

/*
 * 날짜 : 2024/01/10
 * 이름 : 정태영
 * 내용 : Java LinkedList 실습
 */
public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("서울");
		list.add("대전");
		list.add("대구");
		list.add("부산");
		list.add("광주");
		
		System.out.println(list);
		
		
		// 링크(데이터) 추가
		list.add(1, "수원");		// Arraylist 처럼 한칸씩 다 밀리는게 아닌 그 부분만떼서 집어넣는형식
		list.addFirst("인천");
		list.addLast("울산");
		System.out.println(list);
	}
	
}
