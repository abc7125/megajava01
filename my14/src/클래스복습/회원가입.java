package 클래스복습;

public class 회원가입 {

	public static void main(String[] args) {
		Member m = new Member();
		m.id = "eunxung";
		m.pw = "1234";
		m.name="park";
		m.age="100";
		m.email="eunxung@naver.com";
		m.post="150";
		m.tel="010-8958-5612";
		m.add="신촌역";
		System.out.println(m);
	}

}
