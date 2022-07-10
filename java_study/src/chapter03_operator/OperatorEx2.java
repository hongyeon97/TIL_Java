package chapter03_operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		int i = 5, j=0;
		j = i++;
		System.out.println("j = i++; 실행후, i=" +i+",j = "+j);
		
		i=5;
		j=0;
		
		j=++i;
		System.out.println("j = ++i; 실행후, i="+i+",j = "+j);
		
		//OperatorEx3
		i=5;
		j=5;
		System.out.println(i++);//출력후 값증가 후위형
		System.out.println(++j); //증가후 값출력 전위형
		System.out.println("i = "+ i + ", j = "+j); 
		//이미 증가된 값으로 출력
		
		//OperatorEx4
		
		i=-10;
		i=+i; //부호연산자 +는 하는일이 없다.
		System.out.println(i);
		
		i = -10;
		i=-i; //뺄셈연산자는 부호를 반대로 변경한 결과를 반영
		System.out.println(i);

	}

}
