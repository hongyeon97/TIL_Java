package chapter02_variable;

public class overflowEx {
	public static void main(String[]args) {
		short sMin = -32768; //short 양수부 최소값
		short sMax=32767; //short 음수부 최대값
		char cMin = 0; //char양수 최소값
		char cMax=65535;//char 양수최대값
		
		System.out.println("sMin = " + sMin); //short의 최소값
		System.out.println("sMin -1 = " + (short)(sMin-1)); //short의 최댓값(오버플로발생)
		System.out.println("sMax = " + sMax);//short의 최댓값
		System.out.println("sMax +1 = " + (short)(sMax+1));//short의 최소값 (오버플로발생)
		System.out.println("cMin = " + (int)cMin);//char의 최소값
		System.out.println("cMin -1 = " + (int)--cMin);//char의 최대값(오버플로발생)
		System.out.println("cMax = " + (int)cMax);//char의 최대값
		System.out.println("cMax +1 = " + (int)++cMax);//char의 최소값(오버플로 발생)
	}
}
