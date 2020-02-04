package 배열;

import java.util.Random;

public class 로또6글자만들기2 {

	public static void main(String[] args) {
		//로또 번호 6숫자 만들기
		int[] lotto=new int[6];
		
		//아무거나 발생하게 부품(class)가 필요-Random
		Random r = new Random();
		/*int data=r.nextInt(46);//0~45까지 시작
		System.out.println(data);*/
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=r.nextInt(46); //6개에 46개보다 작은수 출력하기
			
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		}
	}


