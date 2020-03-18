package exvar;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); //ctrl+shift+o
		
		System.out.println("점수를 입력하세요. (점수는 정수만 가능합니다.)");
		
		//stem.out.println("나의 성적은 "+jumsu+" 입니다.");

		int jumsu=in.nextInt();
		//조건문: if(조건) 조건은 참과 거짓을 명확하게 구분한다.
		//1. 60점 이상이면 합격 글자 출력, 미만이면 불합격 글자 출력
		//90이상 최우수  60-89 우수 60미만 보통
		
		if(jumsu >=90) {
			System.out.println("최우수");
		}else if(jumsu >=60) {
			System.out.println("우수");
		}else {
			System.out.println("보통");
		} 
		
		//90수 80우 70미 60양 60미만 가
		if(jumsu>=90) {
			System.out.println("수");
		}else if(jumsu>=80) {
			System.out.println("우");
		}else if(jumsu>=70) {
			System.out.println("미");
		}else if(jumsu>=60) {
			System.out.println("양");
		}else {
			System.out.println("가");
		}
		
		
		
	}

}
