package chapter02_variable;

import java.util.Scanner;
public class ScannerEx {
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두자리 정수중 하나 입력해주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용 : "+input);
		System.out.printf("sum =%d%n",num);
		
	}

}