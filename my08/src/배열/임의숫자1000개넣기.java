package 배열;

import java.util.Random;

public class 임의숫자1000개넣기 {

	public static void main(String[] args) {
		//로또 번호 6숫자 만들기
		int[] lotto=new int[1000];
		
		//아무거나 발생하게 부품(class)가 필요-Random
		Random r = new Random();
		/*int data=r.nextInt(46);//0~45까지 시작
		System.out.println(data);*/
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=r.nextInt(100); //1000에다 넣을숫자를 100보다 작게 출력하기
			
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
		}
	}


