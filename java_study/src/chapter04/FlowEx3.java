package chapter04;
import java.util.*;
public class FlowEx3 {
	public static void main(String[] args) {
		System.out.print("숫자를 하나 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");		
		} else {
			System.out.println("입력하신 숫자는 0 이 아닙니다.");
		}
		
	//FlowEx4
		int score = 0;
		char grade = ' ';
		
		System.out.print("점수를 입력하세요 .>");
		Scanner i = new Scanner(System.in);
		score = i.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >=80) { // (80 <= score && 90<score)
			grade = 'B';
		} else if (score >=70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("당신의 학점은"+grade+"입니다.");
		i.close();
		scanner.close();
	}
}
