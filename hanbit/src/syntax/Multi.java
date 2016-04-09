package syntax;

import java.util.Scanner;

public class Multi {
	public static void main(String[] args) {
		int a=0, b=0, c=0; // 지역변수 초기화
		System.out.println("===곱셈 문번===");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 수");
		a = scanner.nextInt();
		System.out.println("두번째 수");
		b = scanner.nextInt();
		c = a*b;
		System.out.println(a+"*"+b+"="+c);
	}
}
