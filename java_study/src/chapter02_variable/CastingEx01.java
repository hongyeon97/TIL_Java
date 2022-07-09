package chapter02_variable;

public class CastingEx01 {

	public static void main(String[] args) {
		//형변환
		double d = 85.4;
		int score = (int)d;
		
		System.out.println("score=" +score);
		System.out.println("d="+d); //형변환 후에도 변수 d는 변화가 없다.

	}

}
