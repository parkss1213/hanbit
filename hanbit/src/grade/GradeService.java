package grade;

public interface GradeService {
	public int getTotal(GradeBean grade);//추상적메소드
	


	// 평균구하기
	public int getAvg(GradeBean grade);


	// 학점구하기 : getGrade
	/*
	 * 평균 점수가 
	 * 90이상 A 
	 * 80이상 B 
	 * 70이상 C 
	 * 60이상 D 
	 * 50이상 E 
	 * 40이상 F 학점입니다.
	 */
	public String getGrade(GradeBean grade);

	}
	


