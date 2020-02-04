package 변수;

public class 데이터2 {

	public static void main(String[] args) {
		//컴퓨터가 인식하는 데이터는 무엇인가?
		//기본 데이터
        //숫자(정수,실수), 1글자(문자), 맞는지 여부 (논리)
		int year; //변수선언 => ram에 저장공간이 만들어진다.
		year=2020; //변수대입=> 변수에 값을 넣는다!
		int age=100; // =(등호):저장공간(변수)에 값을 넣는것. 
		double eye=0.7;
		//int eye2=4.5; //오류 
		
		char sn='1'; //문자 1글자(무조건1글자)
		boolean coffee=true; //false(거짓)
		
		System.out.println("내 나이는 "+age+"세");
		System.out.println("내 시력은 "+eye);
		System.out.println(""+sn);
		System.out.println("오늘은 커피를마셨습니다=>"+coffee);
		
		//모든연산은 cpu가 한다.
		System.out.println(age+1);
		int nextAge=age+1;
		System.out.println("내 내년 나이는 "+nextAge);

}
}