package exvar;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자 한개를 입력받아 홀수인지 짝수인지 판별하는 프로그램
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		
		if (a % 2 == 0 ) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		
		

	}

}
