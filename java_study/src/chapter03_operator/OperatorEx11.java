package chapter03_operator;

public class OperatorEx11 {

	public static void main(String[] args) {
		char a = 'a';
		char d= 'd';
		char zero= '0';
		char two ='2';
		//유니코드 뺄셈
		
		System.out.printf("'%c'-'%c'= %d%n", d, a,  d-a);//d-a=3
		System.out.printf("'%c' -'%c' = %d%n",two,zero,two-zero);
		System.out.printf("'%c'=%d%n", a,(int)a);
		System.out.printf("'%c'=%d%n", d, (int)d);
		System.out.printf("'%c'=%d%n",zero, (int)zero);
		System.out.printf("'%c'=%d%n",two,(int)two);
		
		//OperatorEx12
		char c1= 'a';
		char c2= c1;
		char c3 = ' ';
		
		int i = c1+1;
		c3=(char)(c1+1); //계산결과값이 int이므로 char c3에 담기위해서는 형변환 필요
		c2++;
		c2++;
		
		System.out.println("i="+i);//int값 계산 출력
		System.out.println("c2="+c2); //c1의 a값이 ++;되어 c로 출력
		System.out.println("c3=" +c3);
		


	}

}
