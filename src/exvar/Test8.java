package exvar;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����Ѱ��� �Է¹޾� 2�� ����鼭 5�� ����� �������� �Ǻ�
		Scanner in = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int a =in.nextInt();
		
		 if (a % 2 == 0 && a % 5 == 0) {
			System.out.println("2�� 5�� ����Դϴ�.");
		 } else if (a % 2 == 0) {
			System.out.println("2�� ����Դϴ�.");
		}else if (a % 5 == 0) {
			System.out.println("5�� ����Դϴ�.");
		}else {
			System.out.println("2,5�� ����� �ƴմϴ�.");
		}
		
		}
}
		

