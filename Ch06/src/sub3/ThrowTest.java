package sub3;

/*
 *  날짜 : 2024/01/08
 * 	이름 : 정태영 
 *  내용 : Java 예외 발생시키기 실습하기
 */

// 사용자 정의 예외 클래스
class MinusException extends Exception {
	
	public MinusException(String msg) {
		super(msg);
	}
}

class OverException extends Exception {
	
	public OverException(String msg) {
		super(msg);
	}
	
}

class Score {
	
	public void check(int score) throws MinusException, OverException {	// throws로 위로 올려줘야함
		if(score < 0) {
			
			// 예외 발생시키기
			throw new MinusException("점수는 음수가 될 수 없습니다.");		// throw는 예외를 개발자가 만드는것이고		
		}else if(score > 100) {
			// 예외 발생시키기
			throw new OverException("점수는 100점을 초과할 수 없습니다.");		// 똑같이 예외를 만드는것
		}else {
			System.out.println("점수는 이상없습니다.");
		}
	}
	
}


public class ThrowTest {

	public static void main(String[] args) {
		
		Score score = new Score();
		
		try {
			score.check(-3);
			score.check(102);
			score.check(96);
		} catch (MinusException | OverException e) {		//	 	 |	사용가능
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료...");
			
	}
}
