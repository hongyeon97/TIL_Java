package chapter03_operator;

public class OperatorEx21 {

	public static void main(String[] args) {
		System.out.printf("10 == 10.0f 	\t %b %n", 10==10.0f);
		System.out.printf("'0' == 0 	\t %b%n",'0'==0);
		System.out.printf("'A'== 65 	\t %b%n",'A'>'B');
		System.out.printf("'A'+1 !='B' 	\t %b%n",'A'+1 != 'B');
		
		//OperatorEx22
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		//실수형은 근사값으로 저장되므로 오차가 발생할 수 있다.
		//10.0f는 오차없이 저장할수있지만 0.1f는 2진수변환과정중 오차가 발생.
		//double과 float타입이 적은 오차로 저장된다.
		System.out.printf("10.0 = 10.0f		%b%n", 10.0 == 10.0f);
		System.out.printf("0.1 == 0.1f 		%b%n",0.1 == 0.1f);
		System.out.printf("f = %19.17f%n", f);
		System.out.printf("d = %19.17f%n",d);
		System.out.printf("d2 = %19.17f%n",d2);
		System.out.printf("d==f			%b%n",d==f);
		System.out.printf("d==d2 			%b%n",d==d2);
		System.out.printf("d2==f			%b%n",d2==f);
		System.out.printf("(float)d==f		%b%n",(float)d==f);
		

	}

}
