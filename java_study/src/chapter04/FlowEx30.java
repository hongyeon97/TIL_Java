package chapter04;

public class FlowEx30 {

	public static void main(String[] args) {
		int sum =0;
		int i =0;
		while(true) {
			if(sum>100)
				break;
			++i;
			sum+=i;
			//break이후로 while문을 빠져나온다.
		}
		System.out.println("i="+i);
		System.out.println("sum="+sum);
		
		//FlowEx31
		System.out.println();	
		for(int j =0; j<=10; j++) {
			if(j%3==0)
				continue;//
			System.out.println(j); //실행되지 않지만 for 문은 유지된다
		}

	}

}
