package 반복문;

public class 반복문5 {

	public static void main(String[] args) {
		int sum = 0; //더할때는 일단 0으로 초기화 
		for (int i = 1; i <= 10000; i++) {
			sum +=i; //sum = sum+i;
		}
		System.out.println(sum);

	}

}
