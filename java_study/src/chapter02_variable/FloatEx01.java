package chapter02_variable;

public class FloatEx01 {

	public static void main(String[] args) {
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;
		
		System.out.printf("		123456789012345678901234%n");
		System.out.printf("f	:	  %f%n",f);// %f는 소수점이하 6자리까지표현
		System.out.printf("f	:	 %24.20f%n",f);//전체24자리수중 소수점이하 20자리를 표현하라는 뜻
		System.out.printf("f2	:	 %24.20f%n",f2);//%24.20
		System.out.printf("d	:	 %24.20f%n", d);
		//정밀도가 7자리이기때문에 원래값에서 7자리값만 오차없이 저장된다.

	}

}
