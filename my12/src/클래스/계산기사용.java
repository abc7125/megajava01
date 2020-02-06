package 클래스;

public class 계산기사용 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		int result=cal.add(200,100); //변수에 저장해놓으면 프린트,계산을 할수있음!
		System.out.println(cal.add(200, 100)); //바로 프린트 하고싶으면 이렇게써도됨.
		//System.out.println(cal.add()); -틀린식, void타입의 메소드를 호출한경우에는 반환값이 없으므로 변수에 값을 넣을수도없고 프린트 할수도 없음.
		double result2=cal.add(2.1, 2);
		System.out.println(cal.add(2.1, 2));
		
		//이미지 붙여넣기 할땐 my12에 붙여넣기
		//윈도우 - -속성 - 일반 - 워크 스페이스 - 리프레시 유싱 클릭
	}

}
