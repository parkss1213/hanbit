package syntax;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class Calc {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d = 0;
       String op = "";
       Scanner scanner = new Scanner(System.in);
       System. out.println("첫번째 정수 입력:" );
        a = scanner.nextInt();
       System. out.println("연산자 종류를 입력(+, -, *, / )");
        op = scanner.next();
       System. out.println("두번째 정수 입력:" );
        b = scanner.nextInt();

        if (op .equals("+" )) {

           System. out.println("===정수 덧셈===" );
            c = a + b;
           System. out.println(a + "+" + b + "=" + c );

       } else if (op .equals("-" )) {
           System. out.println("==정수 뺄셈==" );
            c = a - b;
           System. out.println(a + "-" + b + "=" + c );

       } else if (op .equals("*" )) {
           System. out.println("==정수 곱셈==" );
            c = a * b;
           System. out.println(a + "*" + b + "=" + c );

       } else if (op .equals("/" )) {
           System. out.println("==정수 나눗셈==" );
            c = a / b;
            d = a % b;
           System. out.println(a + "/" + b + "=" + c + "..." + d );

       } else {
           System. out.println("연산기호를 잘못 입력했습니다.");
       }

  }
}