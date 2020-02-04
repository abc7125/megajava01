package 문제;

import java.util.Scanner;

public class 사원 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 직급은? >> ");
		String data=sc.next(); //사원 
		
		switch(data) {
		case "사원": //String 이므로 " " 써야함!!
			System.out.println("1000만원 보너스");
			break; //감싸고 있는걸 끝낸다는뜻
		case "과장":
			System.out.println("2000만원 보너스");
			break;
		case "사장":
			System.out.println("3000만원 보너스");
			break;
		case "회장":
			System.out.println("4000만원 보너스");
			break;
		default:
			//위 조건이 전부 아닐때 처리내용, 생략가능
			System.out.println("직급을 잘못 입력했습니다.");
		}
	}

}
