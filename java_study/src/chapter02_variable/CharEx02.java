package chapter02_variable;

public class CharEx02 {
	//specialCharEx
	public static void main (String[] args) {
		System.out.println('\'');// ''' 처럼 나오지않고 \'에의해 작은따옴표가 출력
		System.out.println("abc\t123\b456");//\b에의해 \t만큼 지워진다.
		System.out.println("\n");
		System.out.println("\"Hello\"");//큰따옴표 출력
		System.out.println("c:\\");//역슬래시 출력
	}

}
