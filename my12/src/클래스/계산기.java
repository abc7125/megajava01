package 클래스;

public class 계산기 {

	// 하나의 이름으로 여러가지 처리를 할수있는 메소드를 여러개 만들수있는기능
	//=>(오버로딩 혹은 다형성)
	// 입력값 x 반환값x
	// 입력값의 타입, 개수, 순서로 구분
	public void add() {
		System.out.println("더하기를 수행함");
	}

	public int add(int x, int y) { //int형은 꼭 반환해줄것(return 꼭 써야함) 
		return x + y;
	}

	public double add(double x, int y) { // 하나라도 더블이면 무조건 double
		return x + y;
	}

	public String add(String x, String y) {
		return x + y;
	}

	// add(100," 감자")(틀린식)타입이 맞더라도 순서도 중요함!!
	public String add(String x, int y) {
		return x + y;
	}
	







} //클래스의끝
