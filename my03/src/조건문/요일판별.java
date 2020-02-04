package 조건문;

import java.util.Scanner; //위치를 알려줄때 import라는 키워드를씀 

public class 요일판별 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요일 입력: 주중1) 주말 2) >> ");
		int data = sc.nextInt();
		if (data == 1) { //==는 비교연산자 
			//비교연산자의 결과는 boolean(true/false)
			System.out.println("열심히 공부합시다!!");
						
		} else {
			System.out.println("열심히 놀아봅시다!!");

		}
	}

}
