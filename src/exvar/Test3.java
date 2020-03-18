package exvar;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if문 예제1
		//숫자 2개를 키보드로 입력받아서 큰 숫자를 출력하는 프로그램
		Scanner in = new Scanner(System.in);
		int a=0;
		int b=0;
		
		System.out.println("a를 입력하세요");
		a=in.nextInt();
		System.out.println("b를 입력하세요");
		b=in.nextInt();
		if (a>b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
		//System.out.println(a + "/" + b);
		

	}

}
