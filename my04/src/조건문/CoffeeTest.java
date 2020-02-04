package 조건문;

public class CoffeeTest { // 클래스는 대문자로 시작함 //자바는 cannel 표기법을 준수함.

	public static void main(String[] args) {
		int price = 5600;
		int count = 5;
		
		int sum=price*count;
		
		//25000원이 넘으면 할인쿠폰 5000원짜리
		
		//아니면 그냥 다냄 
		if(sum >= 25000) {
			sum =sum-5000;
		}else { 
			//자바에서는 else는 비워도됨
			
		}
		System.out.println("당신이 지불할 금액은 "+ sum + "원");
		
		int hour = 21;
		if(hour<22) {
			System.out.println("아직 집에 갈 시간이 남았어요.");
		} else {
			System.out.println("집에갈 시간이 거의 다 되었어요.");
		}
	
	}

}
