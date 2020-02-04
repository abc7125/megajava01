package 조건문;

import java.util.Date;
import java.util.Scanner;

public class 시간커피체크 {

	public static void main(String[] args) {
		//콘솔에서 입력받는 class
		//시각알려주는 class
		Scanner sc = new Scanner(System.in);
		Date date=new Date();
		
		System.out.print("커피값은? ");
		int pay=sc.nextInt();
		
		System.out.print("주문수는? ");
		int count=sc.nextInt();
		
		
		int hour = date.getHours(); //현재시각을 보여줌 
		
		if(hour< 10) {
			System.out.println(pay*count);
		}else {
			System.out.println(pay*count-5000);
		}

	}

}
