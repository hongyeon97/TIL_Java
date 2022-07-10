package chapter03_operator;

public class OpreatorEx05 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d +%d = %d%n",	a,b,a+b);
		System.out.printf("%d -%d = %d%n",	a,b,a-b);
		System.out.printf("%d *%d = %d%n",	a,b,a*b);
		System.out.printf("%d /%d = %d%n",	a,b,a/b); //실수부는 버려짐(반올림x)
		System.out.printf("%d /%f = %f%n",	a,(float)b,a/(float)b);
		
		//OperatorEx07
		byte x = 10;
		byte y = 30;
		byte z = (byte)(x*y); //300은 btye형범위초과로 데이터손실 발생
		System.out.println(z);
		
		//OperatorEx08
		a=1_000_000;
		b=2_000_000;
		long c = a*b; //int값의 형범위 초과로 오버플로우 발생
		System.out.println(c);
		c = (long)a*b;
		System.out.println(c);
		
		//OperatorEx09
		long i = 1_000_000*1_000_000;
		long j = 1_000_000*1_000_000L; //접미사 L을 붙여줌
		System.out.println("i="+i); //오버플로우 발생
		System.out.println("j="+j);
		
		//OperatorEx10
		a=1_000_000; //int a 
		int result1 = a*a/a; //a*a과정에서 이미 오버플로우가 발생 
		int result2 = a/a*a; //int범위를 넘어서지않아서 가능
		
		System.out.printf("%d * %d / %d = %d%n",a,a,a,result1);
		System.out.printf("%d / %d * %d = %d%n",a,a,a,result2);
	}

}
