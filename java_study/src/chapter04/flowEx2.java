package chapter04;
import java.util.*;
public class flowEx2 {

	public static void main(String[] args) {
		int input;
		
		System.out.print("숫자를 하나 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		input = Integer.parseInt(tmp);
		
		if(input ==0) {
			System.out.println("입력하신 숫자는 0 입니다.");
		}
		//블록문 없이
		if(input!=0)
			System.out.println("입력하신 숫자는 0이 아닙니다."); //여기까지 if문
			System.out.printf("입력하신 숫자는 %d입니다.",input);//이건 그냥 출력문
			
		scanner.close();
	}

}
