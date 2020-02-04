package 반복문;

public class 반복문3 {

	public static void main(String[] args) {
		/*for문 -1부터 10까지 프린트
		 *
		for(int i =1; i<=10; i++) {
			System.out.println(i);*/
		
		for(int i=1; i<11; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println(); //라인만 넣는다는 의미
		//while문으로 10~1까지 감소하는것을 찍으시오
		//while문
		//반복문:초기값, 조건문,증감식
				int i=10;
				while(i > 0){
					System.out.print(i+" ");
					i--; //i =i-1;
		}
			

	}
}

