package chapter03_operator;

public class OperatorEx14 {

	public static void main(String[] args) {
		char c = 'a';
		for(int i = 0; i<26; i++);{
			System.out.print(c++);
		}
		System.out.println();
		
		c='A';
		for(int i =0; i<26;i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		c='0';
		for(int i = 0; i<10;i++);{
			System.out.print(c++);
		}
		System.out.println();
		
		//OperatorEx15
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase -32); //계산식은 int형이므로 꼭 형변환 필요
		System.out.println(upperCase);//대문자 출력
		
		//OperatorEx16
		float pi = 3.141592f;
		float shortPi = (int)(pi*1000) /1000f;
		//3141.592f에서 int형변환시 정수부만 남고 소수부는 모두 버림된다 **반올림되지 않는다**
		System.out.println(shortPi);
		
		//OperatorEx17
		double pi2 = 3.141592;
		double shortPi2 =(int)(pi2 *1000 +0.5) / 1000.0; //반올림을 하기위해 0.5를 더해줌
		System.out.println(shortPi2);
		
		//OperatorEx18
		shortPi2 = Math.round(pi*1000)/1000.0; //round메서드:반올림
		System.out.println(shortPi);
		
		
		
	}

}
