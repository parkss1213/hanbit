package grade;

public class GradeServiceImpl implements GradeService{
	// 총점구하기
	@Override
	public int getTotal(GradeBean grade) {
		int total = grade.getKor()+grade.getEng()+grade.getMath()+grade.getJava();
		return total;
	}

	// 평균구하기
	@Override
	public int getAvg(GradeBean grade) {
		int avg = (getTotal(grade))/4;
		return avg;
	}

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
	public String getGrade(GradeBean grade) {
		String result = "";
		
		// 알고리즘
		switch ((getTotal(grade))/4 / 10) {
		case 10:result = "A";break;
		case 9:result = "A";break;
		case 8:result = "B";break;
		case 7:result = "C";break;
		case 6:result = "D";break;
		case 5:result = "E";break;
		default:
			result = "F";break;
		}
		return result;

	}
}
	

