package exvar;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//키보드로 숫자 한개를 입력받아 숫자가 10보다 크면 정상,이하면 비정상 출력
		//두개의 수를 입력받아 평균을 구하시오 *소수점까지 표현
		
		int number=in.nextInt();
		
		if (number >=10) {
			System.out.println("정상");
		} else {
			System.out.println("비정상");
		}
		
	}

}
