package chapter04;

import java.util.Scanner;

public class FlowEx12 {

	public static void main(String[] args) {
		for (int i = 1; i<=5; i++)
			System.out.println(i);
		
		for (int i =1; i <=5; i++)
			System.out.print(i);
		
		System.out.println();
	int sum = 0;
	//FlowEx13
	for(int i=1; i<=10; i++) {
		sum +=i; //sum=sum+i;
		System.out.printf("1부터 %2d까지의 합: %2d%n", i,sum);
	}
	
	//FlowEx14
	for (int i=1, j=10; i<=10; i++,j--) {
		System.out.printf("%d \t %d%n",i,j);
		
	}
	
	//FlowEx15
	System.out.println("i \t 2*1 \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3 ");
	System.out.println("-----------------------------------------------");
	for (int i =1; i<=10; i++) {
		System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n",i,2*i,2*i-1,i*i,11-i,i%3,i/3);	
	}
	//FlowEx16
	for (int i=1;i<=5;i++) {
		for (int j=1;j<=10;j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	
	//FlowEx17
	int num = 0;
	System.out.print("*을 출력할 수를 입력하세요.>");
	Scanner scanner = new Scanner(System.in);
	int tmp = scanner.nextInt();
	num = tmp;
	
	for(int i=0; i<num; i++) {
		for (int j=0; j<=i; j++) {
			System.out.print("*");
		}System.out.println();
		
	}scanner.close();
	
	//FlowEx18
	for(int i=2; i<=9;i++) {
		for(int j =1; j<=9;j++) {
			System.out.printf("%d x %d = %d%n", i,j,i*j);
		}
	}

	}

}
