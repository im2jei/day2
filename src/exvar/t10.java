package exvar;

import java.util.Scanner;

public class t10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner me = new Scanner(System.in);
		System.out.println("����������");
		
		int m=me.nextInt();
		
		if (m==1) {
			System.out.println("����");
		} else if (m==2) {
			System.out.println("����");
		} else if (m==3) {
			System.out.println("��");
		}
		
		int com=me.nextInt();
		
		if (com==1) {
			System.out.println("����");
		} else if (com==2) {
			System.out.println("����");
		} else if (com==3) {
			System.out.println("��");
		}
		
		int game=m-com;
		
		if (m==com) {
			System.out.println("���º�");
		} else if (game==1) {
			System.out.println("Win");
		} else if (game==-1) {
			System.out.println("Lose");
		}

	}

}
