package exvar;

import java.util.Scanner;

public class t10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner me = new Scanner(System.in);
		System.out.println("가위바위보");
		
		int m=me.nextInt();
		
		if (m==1) {
			System.out.println("가위");
		} else if (m==2) {
			System.out.println("바위");
		} else if (m==3) {
			System.out.println("보");
		}
		
		int com=me.nextInt();
		
		if (com==1) {
			System.out.println("가위");
		} else if (com==2) {
			System.out.println("바위");
		} else if (com==3) {
			System.out.println("보");
		}
		
		int game=m-com;
		
		if (m==com) {
			System.out.println("무승부");
		} else if (game==1) {
			System.out.println("Win");
		} else if (game==-1) {
			System.out.println("Lose");
		}

	}

}
