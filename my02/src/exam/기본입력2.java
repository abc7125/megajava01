package exam;

import javax.swing.JOptionPane;

public class 기본입력2 {

	public static void main(String[] args) {
		//두개를 입력받아서
		String test =JOptionPane.showInputDialog("문자를 입력하시오.");
		String test2=JOptionPane.showInputDialog("두번째 문자를 입력하세요");
		//두개를 결합시켜
		String test3=test+test2;
		//그 결합 결과를 출력
System.out.println("결과 :"+test3);
	}

}
