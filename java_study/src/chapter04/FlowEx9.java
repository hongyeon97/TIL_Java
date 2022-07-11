package chapter04;
import java.util.*;

public class FlowEx9 {
public static void main(String[] args) {
	char grade = ' ';
	
	System.out.print("당신의 점수를 입력하세요.(1~100) >");
	Scanner scanner = new Scanner(System.in);
	int score = scanner.nextInt();
	
	switch(score/10) {

	case 9:
		grade='A';
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';	
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
	}

	System.out.println("당신의 학점은 "+grade+"입니다.");
	scanner.close();
	
}
}
