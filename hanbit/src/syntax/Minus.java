package syntax;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class Minus {
	public static void main(String[] args) {
		System.out.println("수의 빼기 프로그램");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 정수입력");
		int a = scanner.nextInt();
		System.out.println("두번째 정수입력");
		int b = scanner.nextInt();
		int c=a-b;
		System.out.println(a+"-"+b+"="+c);
	}
}
