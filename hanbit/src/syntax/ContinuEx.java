package syntax;

/**
 * 2016. 4. 16.
 * ContinuEx.java
 * ggum1213@gmail.com
 * Story : 명령문(return,break, continu)
 */
public class ContinuEx {
	/**
	 [문제]
	 1부터 10까지 정수에서 3의 배수를 제외한 수만 출력
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
		if (i%3==0) {
			continue;
			// 조건이 맞으면 아래로 진행하지 말고 다시 처음에서 시작해라
		}	System.out.print(i+"\t");
		}
	}
}
