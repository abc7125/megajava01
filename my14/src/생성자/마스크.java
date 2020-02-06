package 생성자;

public class 마스크 {
	String color;
	int price;

//입력값을 한꺼번에 넣고싶을때
//생성자를 이용!
//생성자의 특징
//1.클래스이름과 동일 2.반환 타입의 유무를 쓰지않음 =>무조건 void!! 
//new를 할때마다 자동으로 호출됨(사용됨)
//마스크사용2보면서 공부하기 
	public 마스크(String c, int p) { // 꼭 초기화 해야함
		color = c;
		price = p;

	}

	@Override
	public String toString() {
		return "마스크 [color=" + color + ", price=" + price + "]";
	}
	
}
