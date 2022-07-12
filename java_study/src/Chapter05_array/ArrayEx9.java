package Chapter05_array;

import java.util.Arrays;

public class ArrayEx9 {

	public static void main(String[] args) {
		int[] code = {-4, -1, 4, 6, 11};
		int [] arr = new int[10];
		
		for (int i =0; i< arr.length; i++) {
			int tmp = (int)(Math.random() * code.length);
					arr[i] = code[tmp]; //code의 값이  랜덤하게 arr에 들어간다.
		}
		System.out.println(Arrays.toString(arr));

	}

}
