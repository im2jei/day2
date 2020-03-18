package exvar;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자한개를 입력받아 2의 배수면서 5의 배수인 숫자인지 판별
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int a =in.nextInt();
		
		 if (a % 2 == 0 && a % 5 == 0) {
			System.out.println("2와 5의 배수입니다.");
		 } else if (a % 2 == 0) {
			System.out.println("2의 배수입니다.");
		}else if (a % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}else {
			System.out.println("2,5의 배수가 아닙니다.");
		}
		
		}
}
		

