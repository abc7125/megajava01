package 조건문;

import java.util.Random;

public class 아무거나 {

	public static void main(String[] args) {
		//아무거나 내게 하는 class-랜덤(Random)
		Random r = new Random(); 
		int data=r.nextInt(3); //-21억~21억 //nextInt-int형으로 아무거나 냄 ,String은 없음 
		//0부터 2까지를 발생시킨다는 뜻 
		System.out.println(data);
		
	} //main끝

} //클래스끝
