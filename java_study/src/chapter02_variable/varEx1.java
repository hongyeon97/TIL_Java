package chapter02_variable;

public class varEx1 {
	//1. 변수는 단하나의 값을 저장할 수 있는 메모리 공간.
	//2. 변수 타입, 변수이릅, 초기화 를 통해 선언을한다.

	public static void main(String[] args) {
		int year= 0; //변수선언
		int age = 14;//변수선언
		
		System.out.println(year);
		System.out.println(age);
		
		year = age+2000;
		age = age+1;
		
		System.out.println(year);
		System.out.println(age);

	}

}
