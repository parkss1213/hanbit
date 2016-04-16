package grade;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * GradeMain.java
 * ggum1213@gmail.com
 * Story : 성적 프로그램
 */
public class GradeMain {
	/**
	 [문제]
	 과목별 점수를 입력받아 총점, 평균, 학점을 구하는 프로그램 완성
	 (과목은 국, 영, 수)
	 **/
	public static void main(String[] args) {
		//----(1) 변수선언 영역----
		Scanner scanner = new Scanner(System.in);
		Grade grade = new Grade();
		int total=0;
		String name="";
		//----(2) 파라미터 입력 영역----
		System.out.println("이름:[],국어:[],영어:[],수학:[]");
		name = scanner.next();
		kor=scanner.nextInt();
		eng=scanner.nextInt();
		math=scanner.nextInt();
		//----(3) 메소드 호출----
		total=grade.getTotal(kor, eng, math);
		avg=grade.getAvg(total);
		//----(4) 리턴값 출력 영역----
		System.out.println(name+"의 총점은"+total+"이고, 평균은"+avg+"이다");
	}
}
