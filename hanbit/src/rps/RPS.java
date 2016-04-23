package rps;

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

/**
 * 2016. 4. 16.
 * rps.java
 * ggum1213@gmail.com
 * Story : 가위바위보 게임
 */
public class RPS {
	/**
	 컴퓨터와 사용자간의 가위바위보 게임을 완성하시오
	 Math.random()*E+S)
	 S=시작값
	 E=마지막값
	 */
	public static void main(String[] args) {
		
		System.out.println("***가위바위보게임***");
		System.out.println("가위:1, 바위:2, 보:3");
		Scanner scanner = new Scanner(System.in);
		//--------가공해야할 데이터를 입력하는 부분--------
		int sccisors=1, rock=2, paper=3, RpsValue=0, comValue=0;
		RpsValue = scanner.nextInt();
		comValue = (int) (Math.random()*3+1);
		String result="";
		switch (RpsValue) {
		case 1:
			if (comValue==1) {
				result="사용자 가위, 컴퓨터가위 :무승부";
			}else if (comValue==2) {
				result="사용자 가위, 컴퓨터바위 :패배";		
			}			
			 else {
				 result="사용자 가위, 컴퓨터가위 :승리"; 
				}
			break;
		case 2:
			if (comValue==1) {
				result="사용자 바위, 컴퓨터가위 :승부";
			}else if (comValue==2) {
				result="사용자 바위, 컴퓨터바위 :무승부";		
			}			
			 else {
				 result="사용자 바위, 컴퓨터가위 :패배"; 
				}
			break;
		case 3:
			if (comValue==1) {
				result="사용자 보, 컴퓨터가위 :패배";
			}else if (comValue==2) {
				result="사용자 보, 컴퓨터바위 :승리";		
			}			
			 else {
				 result="사용자 보, 컴퓨터가위 :무승부"; 
				}
			break;
		
		default:result="1~3까지 숫자만 입력바랍니다";
			break;
		}
		//----------결과가 보여지는 부분--------
		System.out.println(result);
	}
}
