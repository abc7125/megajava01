package 조건문;

import java.util.Random;
import java.util.Scanner;

public class 아무거나3 {

	public static void main(String[] args) {
		Random r = new Random(); 
		int computer=r.nextInt(3); 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0)가위, 1)바위, 2)보>> ");
		int me=sc.nextInt(); //나 0~2
		
		switch(me) {
		case 0: //내가 가위를 냈을때 
			//컴퓨터가 무엇을 냈느냐에 따라 달라짐.
			switch(computer) {
			case 0:
				System.out.println("computer는 가위를 냄");
				System.out.println("비김");
				break;
			case 1:
				System.out.println("computer는 가위를 냄");
				System.out.println("컴퓨터가 승");
				break;
			default:
				System.out.println("computer는 가위를 냄");
				System.out.println("내가 승");
				break; //컴퓨터인경우
			}
			break;
		case 1: //내가 바위를 냄 
			switch(computer) {
			case 0:
				System.out.println("computer는 가위를 냄");
				System.out.println("내가 승 ");
			case 1:
				System.out.println("computer는 가위를 냄");
				System.out.println("비김");
			case 2:
				System.out.println("computer는 가위를 냄");
				System.out.println("컴퓨터가 승");
				break;
			}
			break;
		default: //내가 보를 냄.
			switch(computer) {
			case 0:
				System.out.println("computer는 가위를 냄");
				System.out.println("컴퓨터가 승 ");
			case 1:
				System.out.println("computer는 가위를 냄");
				System.out.println("내가 승");
			case 2:
				System.out.println("computer는 가위를 냄");
				System.out.println("비김"); //컴퓨터꺼 , switch문은 엉켜서 사용할수있음
				break;
			}
				break;
				}
			
		
			System.out.println("computer: "+computer);   
	} //main끝

	} // 클래스끝
