package 순차문;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		String data1 = JOptionPane.showInputDialog("첫번째 수를 입력하세요."); // JOptionPane은 많이사용하는코드!
		String data2 = JOptionPane.showInputDialog("두번째 수를 입력하세요.");
		int n1 = Integer.parseInt(data1); // integer-숫자로 바꿔주는역할 , 많이사용하는코드표현
		int n2 = Integer.parseInt(data2);

		// 처리
		int result = n1 + n2;

		// 출력
		System.out.println(n1 + " + " + n2 + " = " + result);
	} // 메인의 끝

} // 클래스의 끝 //항상 주석을 다는 습관을 들이자. 주석없는 코드는 죽음뿐!
//help-이클립스 마켓 이용하기 !!
