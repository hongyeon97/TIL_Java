package chapter02_variable;

public class varEx2 {
	//변수의 값교환은 새로운 변수를 하나 더 선언하여 값을 교환한다.
	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("x:"+x+" y:"+y);
		
		tmp=x;
		x=y;
		y=tmp;
		
		System.out.println("x:"+x+" y:"+y);
	}
}
