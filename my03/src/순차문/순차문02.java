package 순차문;

import javax.swing.JOptionPane;

public class 순차문02 {

	public static void main(String[] args) {
		String data=JOptionPane.showInputDialog("현재 온도는"); //3도라고 치면 안됨 
		//모든 외부 입력은 타입이 String!
		//String을 그대로 쓸지 숫자로 변환해서 쓸지는 프로그래머가결정!!
		//String-->int 
		int now=Integer.parseInt(data); //parse=분석한다는뜻 //parseInt=data를 분석해서 int형으로 바꿈

		//처리
		int back=now-1;
		
		//출력
		System.out.println("집에 갈때의 온도는 "+back+"도");
	}

}
