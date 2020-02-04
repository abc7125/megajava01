package 조건문;

import java.util.Random;

public class 아무거나2 {

	public static void main(String[] args) {
		//아무거나 내게 하는 class-랜덤(Random)
		Random r = new Random(); 
		int computer=r.nextInt(3); //-21억~21억 //nextInt-int형으로 아무거나 냄 ,String은 없음 
		//0부터 2까지를 발생시킨다는 뜻 
		System.out.println("computer: "+computer);
		//0이면, computer는 가위를 냄.
		/*if(computer==0) {
			System.out.println("가위");
			//1이면, computer는 바위를 냄 
		}else if(computer==1) {
			System.out.println("바위");
			//2이면, computer는 보를 냄 
		}else {
			System.out.println("보");*/
		switch(computer) {
		case 0:
			System.out.println("computer는 가위를 냄");
			break;
		case 1:
			System.out.println("computer는 바위를 냄");
			break;
		case 2:
			System.out.println("computer는 보를 냄");
			break;
		
		}
		
	} //main끝

} //클래스끝
