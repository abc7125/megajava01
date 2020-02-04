package 배열문제;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		//배열정리문제1번
		int[] num= {10,20,30,40,50};
		//int result=num[0]+num[1];
		//System.out.println(result);
		System.out.println(num[0]+num[4]);
		
		//두번째문제
		Scanner sc = new Scanner(System.in);
		String[] name=new String[3];
		for (int i = 0; i < name.length; i++) {
			System.out.print("과목 입력: ");
			name[i]=sc.next();
		}
		System.out.println("**"+name[0]+"보다는"+name[1]+"**");
		//세번째문제
		System.out.println(); //공백추가
		int[] num2=new int[5];
		for (int i = 0; i < num2.length; i++) {
			System.out.print("숫자 입력>> ");
			num2[i]=sc.nextInt();
		}
		for (int x : num2) {
			System.out.print(x+" ");
		}

}
}