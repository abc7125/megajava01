package 생성자;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의윈도우 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 윈도우"); //생성자 
	
		f.setSize(300, 300);
		
		//메소드 이름은 동일하게 사용할수있다.
		//오버로딩(하나의 이름으로 다양한 형태를 만들수있다:다형성)
		JButton b = new JButton("나는 눌러요"); //버튼
		f.add(b); //버튼 b를 넣음 
		
		
		
		
		f.setVisible(true);

	}

}
