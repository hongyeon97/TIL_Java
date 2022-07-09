package chapter02_variable;

public class FloatToBinEx {

	public static void main(String[] args) {
		float f = 9.12345657f;
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n", f);
		System.out.printf("%X%n",i);

	}

}
