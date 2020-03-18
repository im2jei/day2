package exvar;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//두개의 수를 입력받아 평균을 구하시오 *소수점까지 표
		
		int a =0;
		int b=0;
		
		System.out.println("a=");
		a=in.nextInt();
		System.out.println("b=");
		b=in.nextInt();
		
		double average = (double) (a+b)/2;
				System.out.println(average);
		
		

	}

}
