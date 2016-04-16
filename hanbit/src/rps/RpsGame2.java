package rps;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * rps.java
 * ggum1213@gmail.com
 * Story : 가위바위보 게임
 */
public class RpsGame2 {
	/**
	 컴퓨터와 사용자간의 가위바위보 게임을 완성하시오
	 Math.random()*E+S)
	 S=시작값
	 E=마지막값
	 */
	public static void main(String[] args) {
		int sccisors=1, rock=2, paper=3, RpsValue=0, comValue=0;
		System.out.println("**가위바위보게임***");
		System.out.println("가위:1, 바위:2, 보:3");
		Scanner scanner = new Scanner(System.in);
		RpsValue = scanner.nextInt();
		comValue = (int) (Math.random()*3+1);
		switch (RpsValue) {
		case 1:
			if (comValue==1) {
				System.out.println("비겼습니다");
			}else if (comValue==2) {
				System.out.println("이겼습니다");		
			}			
			 else {
				System.out.println("지셨습니다"); 
				}
			break;
		case 2:
			if (comValue==1) {
				System.out.println("비겼습니다");
			}else if (comValue==2) {
				System.out.println("이겼습니다");		
			}			
			 else {
				System.out.println("지셨습니다"); 
				}
			break;
		case 3:
			if (comValue==1) {
				System.out.println("비겼습니다");
			}else if (comValue==2) {
				System.out.println("이겼습니다");		
			}			
			 else {
				System.out.println("지셨습니다"); 
				}
			break;
		
		default:System.out.println("1~3까지 숫자만 입력바랍니다");
			break;
		}
	}
}
