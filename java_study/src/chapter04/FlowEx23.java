package chapter04;

import java.util.Scanner;

public class FlowEx23 {

	public static void main(String[] args) {
		int i =5;
		while(i--!=0) {
			System.out.println(i+" - I can do it.");
		}
		int j =11;
		System.out.println("카운트다운을 시작합니다.");
		while(j-- != 0) {
			System.out.println(j);
			for(int k=0; k<2;k++) {
				;//지연시간 늘리는 반복문용
			}
		}
		System.out.println("GAME OVER");
		
		System.out.println();
		//FlowEx25;
		int num =0, sum =0;
		System.out.print("숫자를 입력하세요.(예: 12345) >");
		
		Scanner scanner =new Scanner(System.in);
		String tmp=scanner.nextLine();
		num=Integer.parseInt(tmp);
		
		while(num!=0) {
			
			sum+= num%10;
			System.out.printf("sum=%3d num=%d%n",  sum,num);
			num/=10;
			
		}
		System.out.println("각 자리수의 합:"+sum);
		scanner.close();
		
		int a=0;
		int b=0;
		
		while((a+=++b) <=100) {
			System.out.printf("%d - %d%n",  b, a);
			
		}
		
		

	}

}
