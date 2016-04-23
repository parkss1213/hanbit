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
	 * [문제] 과목별 점수를 입력받아 
	    총점, 평균, 학점을 구하는 프로그램 완성 (과목은 국, 영, 수)
	 **/
	public static void main(String[] args) {
		// ---(1) 변수 선언 영역 ---
		Scanner scanner = new Scanner(System.in);
		GradeBean grade = new GradeBean();
		GradeService service = new GradeServiceImpl();
		int total = 0, avg=0;
		String name = "", result="";
		// ---(2) 파라미터 입력 영역 ---
		System.out.println("이름 : [ ] 국어 : [ ] ,영어 : [ ],수학 : [ ], java[ ]");
		name = scanner.next();
		grade.setName(scanner.next());
		// ---(3) 메소드 호출
		grade.setKor(scanner.nextInt());
		grade.setEng(scanner.nextInt());
		grade.setMath(scanner.nextInt());
		// ---(4) 리턴값 출력 영역 ---
		System.out.println(grade.getName() +" 의 학점은 "+service.getGrade(grade)+ " 학점입니다 ");

	}
}
