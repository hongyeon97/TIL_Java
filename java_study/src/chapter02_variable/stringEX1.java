package chapter02_variable;

public class stringEX1 {
	//char-변수 하나, string-문자열을 사용한다. 
	//string은 공백의 문자열 저장이 가능하나, char에는 하나이상의 문자가 필요하다. (blank는 가능)
	//덧셈연산자로 문자와 숫자를 결합, 계산할 수 있다. 
	//숫차+문자열의 경우는 문자열의 결합을 결과로 얻는다.

	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);;
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7+"");
		System.out.println(""+7);
		System.out.println(""+"");
		System.out.println(7+7+"");//7+7+"" -> 14+"" => "14"
		System.out.println(""+7+7);//""+7+7 -> "7"+7 => "7"+"7"

	}

}
