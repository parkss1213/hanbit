package syntax;

import java.util.Scanner;
/**
 * 2016. 4. 16.
 * Calc4.java
 * ggum1213@gmail.com
 * Story : Switch case ex1
 */
public class Calculator {
    public String execute(int a, String op, int b) {
    String result="";
        switch (op) {
		case "+":
			result=a+"+"+b+"="+(a+b);
			break;
		case "-":
			result=a+"-"+b+"="+(a-b);
			break;
		case "*":
			result=a+"*"+b+"="+(a*b);
			break;
		case "/":
			result=a+"/"+b+"="+(a/b)+"..."+(a%b);
			break;

		default:result="연산기호를 잘못 입력했습니다";
			break;
		
		}
        return result;
  }
}