package 순차문;

import java.util.Scanner;

public class 콘솔연습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력>> "); // 기본입력은 전부 string임
		int age = sc.nextInt(); // nextInt-int값으로 바꿔주는 기능
		int nextAge = age + 1; // 코드볼때 오른쪽부터 볼것
		System.out.println("내년 나이는>> " + nextAge + "세");

		System.out.print("키를 입력>> ");
		double height = sc.nextDouble();
		System.out.println("당신의 키는 " + height);

		System.out.print("저녁을 먹었는지 입력(true/false)>>");
		boolean food = sc.nextBoolean();
		System.out.println("당신의 저녁 여부는 " + food);

		// 자동 코드정리 ctrl+쉬프트+F - 한번쯤은 꼭 코드 정리하기
		System.out.print("올해의 목표는>> ");
		sc.nextLine(); //엔터처리
		String life = sc.nextLine(); // 한줄다!
		System.out.println("올해의 목표는" + life);

	}

}
