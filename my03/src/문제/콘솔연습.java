package 문제;

import java.util.Scanner;

public class 콘솔연습 { //이름바꾸는거 -F2

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나에 대한 정보");
		System.out.println("---------");
		System.out.print("이름 입력>> ");
		String name =sc.next();
		System.out.print("나이 입력>> ");
		String age=sc.next();
		System.out.print("취미 입력>> ");
		String game=sc.next();
		System.out.println("---------");
		
		System.out.println("나의 이름은 "+name);
		System.out.println("나의 나이는 "+age+"세");
		System.out.println("나의 취미는 "+game+"입니다.!");

	}

}
