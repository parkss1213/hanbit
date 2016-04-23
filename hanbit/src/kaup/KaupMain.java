package kaup;

import java.util.Scanner;

public class KaupMain {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		KaupBean kaup = new KaupBean();
		KaupService service = new KaupServiceImpl();
		while(true){
			System.out.println("=== 카우푸 지수 구하기 프로그램 ===");
			System.out.println("[메뉴] 1.계속 2.종료");
			int key = scanner.nextInt();
			switch (key) {
			case 1:
				/* 데이터 입력 */
				System.out.println("이름,키,몸무게 입력");
				kaup.setName(scanner.next());
				kaup.setHeight(scanner.nextDouble());
				kaup.setWeight(scanner.nextDouble());
				/* 연산 */
				/* 결과 출력 */
				System.out.println(service.getResult(service.getIndex(kaup)));
				break;
			case 2: System.out.println("시스템 종료입니다");return;
			default:System.out.println("1, 2번만 선택이 가능합니다");
				break;
			}
		}
	}
	
}