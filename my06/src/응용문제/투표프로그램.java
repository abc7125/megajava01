package 응용문제;

import java.util.Scanner;

public class 투표프로그램 {

	public static void main(String[] args) {
		System.out.println("5번 투표 기회가 있음.");
		System.out.println("--------------");
		System.out.println("1)아이유 2)유재석 3)공유");
		System.out.println("--------------");
		Scanner sc = new Scanner(System.in); //콘솔창 입력 
		int iu=0;
		int you=0;
		int gong=0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("당신의 선택은? ");
			int choice=sc.nextInt();
			//choice의 값에 따라서 다르게 처리해야함
			//조건문(if,switch) 사용
			switch(choice) {
			case 1:
				iu++;
				break;
			case 2:
				you++;
				break;
			case 3:
				gong++;
				break;
			default: //모든조건을 만족하지 않을때
				System.out.println("1,2,3만 투표가능합니다.");
				gong++;
				break;
			}
		} //for문의 끝
		System.out.println("--------------");
		System.out.println("아이유: "+iu+"표");
		System.out.println("유재석: "+you+"표");
		System.out.println("공유: "+gong+"표");

	}

}