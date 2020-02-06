package 클래스복습;

public class 마스크 {
	//멤버변수
	String color; // 색깔
	int price; // 가격

	//멤버메소드
	public void make() { // public치고 자동완성하기
		System.out.println("마스크를 만들다.");
	}
	//소스 -generate toString() 클릭 
	//toString역할 - 마스크로 복사한 변수를 프린트할때 자동실행(호출)
	//멤버변수값을 한번에 간단히 출력하고 싶을때 사용함
	@Override
	public String toString() { //toString에 m1,m2값이 들어감 
		return color+","+price;
	}
	
	
	
}
