package exvar;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
	//Ű����� ���� �Ѱ��� �Է¹޾� ���ڰ� 30���� ������ �÷��� 5,30���� ũ�� ����10
				int num=in.nextInt();
				
				if (num >=30) {
					System.out.println(num-10);
				} else {
					System.out.println(num+5);	
				}
				
	}

}
