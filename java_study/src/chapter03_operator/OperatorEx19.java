package chapter03_operator;

public class OperatorEx19 {

	public static void main(String[] args) {
		int x = 10;
		int y = 8;
		
		System.out.printf("%d을 %d로 나누면, %n",x,y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n",x/y,x%y);
		
		System.out.println(-10%8);
		System.out.println(10%-8); //나눠지는 수로 음수도 허용, 부호는 무시됨.
		System.out.println(-10%-8); //왼쪽피연산자의 부호를 붙이면 된다.

	}

}
