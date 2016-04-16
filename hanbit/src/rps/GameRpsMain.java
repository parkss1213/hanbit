package rps;

import java.util.Scanner;


public class GameRpsMain {
	public static void main(String[] args) {
		System.out.println("***가위바위보게임***");
		System.out.println("가위:1, 바위:2, 보:3");
		Scanner scanner = new Scanner(System.in);
		int scan=scanner.nextInt();
		String result="";
		//----[데이터 입력]----
		GameRPS gameRPS = new GameRPS();
		result=gameRPS.play(scan);
		//----[데이터 출력]----
		System.out.println(result);
	}
}
