package syntax;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class Dvid {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0 ;
		System.out.println("===나눗셈 문법===");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 수입력");
		a = scanner.nextInt();
		System.out.println("두번째 수입력");
		b = scanner.nextInt();
		c = a/b;
		d = a%b;
		System.out.println(a+"/"+b+"="+c+"..."+d
				);
	}
}
