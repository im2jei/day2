package exvar;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
	//키보드로 숫자 한개를 입력받아 숫자가 30보다 작으면 플러스 5,30보다 크면 빼기10
				int num=in.nextInt();
				
				if (num >=30) {
					System.out.println(num-10);
				} else {
					System.out.println(num+5);	
				}
				
	}

}
