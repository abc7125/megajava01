package 반복문;

public class 반복문1 {

	public static void main(String[] args) {
		//반목문-while문
		// 반복을 해봅시다.!!
		// 어떨때(조건), 몇번 반복?
		// 1번~3번이 꼭 있어야함
		int day = 0; // 시작값(1번) //시작값은 0,1로시작해도 상관없음. ★0부터 시작하는걸 선호함.
		while (day < 6) { // 조건식(2번)
			// 조건이 맞으면 반복처리할 내용!
			System.out.println(day+": 반갑습니다.");
			day = day + 1; // 증감식(3번), 증감식은 많이사용함 , 중요!!★
			// day++;(이것도같은식임) //증감연산자 day--;
		}
	}
}
