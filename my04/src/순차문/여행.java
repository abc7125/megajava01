package 순차문;

import java.util.Scanner;

public class 여행 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<< 여행 정보 >>");
		System.out.println("-----------");
		//여행지
		System.out.print("-여행지: ");
		String trip = sc.next(); //next가 입력받는 역할!
		//경비
		System.out.print("-경비: ");
		int money = sc.nextInt();
		//할인율 
		System.out.print("-할인율: ");
		double pay=sc.nextDouble();
		//실제 경비 
		System.out.print("-실제 경비: ");
		double result=money-money*pay;
		//★자바에서는 연산할때 하나라도 실수가 들어있으면 무조건 실수!! 
		//정수와 정수의 연산의 결과는 무조건 정수!★ 
		System.out.println((int)result+"원"); //(int)result => double형을 int형으로 바꿈
		System.out.println("-----------");
		System.out.println("=> 12월 중순에 갔을때 가격");
	}

}
