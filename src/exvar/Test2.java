package exvar;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); //ctrl+shift+o
		
		System.out.println("������ �Է��ϼ���. (������ ������ �����մϴ�.)");
		
		//stem.out.println("���� ������ "+jumsu+" �Դϴ�.");

		int jumsu=in.nextInt();
		//���ǹ�: if(����) ������ ���� ������ ��Ȯ�ϰ� �����Ѵ�.
		//1. 60�� �̻��̸� �հ� ���� ���, �̸��̸� ���հ� ���� ���
		//90�̻� �ֿ��  60-89 ��� 60�̸� ����
		
		if(jumsu >=90) {
			System.out.println("�ֿ��");
		}else if(jumsu >=60) {
			System.out.println("���");
		}else {
			System.out.println("����");
		} 
		
		//90�� 80�� 70�� 60�� 60�̸� ��
		if(jumsu>=90) {
			System.out.println("��");
		}else if(jumsu>=80) {
			System.out.println("��");
		}else if(jumsu>=70) {
			System.out.println("��");
		}else if(jumsu>=60) {
			System.out.println("��");
		}else {
			System.out.println("��");
		}
		
		
		
	}

}
