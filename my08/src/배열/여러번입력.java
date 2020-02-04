package 배열;

import java.util.Scanner;

public class 여러번입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int data = 0; // 쓰레기값이 들어가있는 상태
		// 변수에 처음값 =>초기값=>초기화
		int[] data2=new int[5]; 
		for (int i = 0; i < 5; i++) {
			System.out.print("성적을 입력>> ");
			data2[i] = sc.nextInt(); // int형으로 바꿈
		}
		//System.out.println(data2); //주소값나옴
		for (int i = 0; i < data2.length; i++) {
			System.out.print(data2[i]+" ");
		}
		int sum=0; //합계를 구함 
		for (int i = 0; i < data2.length; i++) {
			sum = sum+data2[i]; //누적시켜서 더할때 쓰는식, 자주사용
		}
		System.out.println();
		System.out.println("총합은"+sum+"점");
		System.out.println("평균은"+sum/data2.length+"점");
	}

}
