package chapter03_operator;

public class OperatorEx26 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		System.out.printf(" a=%d, b=%d%n", a,b);
		System.out.printf("a!=0 || ++b!=0 =%b%n", a!=0 || ++b!=0);
		//좌측 피연산자 값이 참이라 이미 결과가 나왔기에 우측 피연산자는 평가하지 않는다.
		System.out.printf("a=%d, b=%d%n",a,b);
		//따라서 b는 여전히 0이다.
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
		System.out.printf("a=%d, b=%d%n", a,b);
	}

}
