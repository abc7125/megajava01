package 클래스복습;
//같은 위치에 복사할경우에는 import가 없음, 위치가 어디인지 알기때문! 
public class 마스크사용 {

	public static void main(String[] args) {
		//마스크를 사용하고 싶으면,
		//마스크 틀을 복사해서 사용하면됨.
		//new!!
		마스크 m1 = new 마스크();
		m1.color="흰색";
		m1.price=1000;
		마스크 m2 = new 마스크();
		m2.color="검정색";
		m2.price=2000;
		
		System.out.println(m1);
		System.out.println(m2);

	}

}
