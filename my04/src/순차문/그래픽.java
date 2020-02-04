package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

public class 그래픽 {

	public static void main(String[] args) {
		// 그래픽 부품(class) 사용해서 화면을 띄어봅시다!

		JFrame f = new JFrame(); //프레임 
		f.setSize(800, 800); //프레임 사이즈 
		
		JButton b = new JButton(); //버튼 
		b.setForeground(Color.YELLOW);
		b.setFont(new Font("HY엽서M", Font.BOLD, 62));
		b.setBackground(Color.GREEN);
		b.setText("나를 눌러요..!!!!꾹꾹!!!!");

		f.getContentPane().add(b); //프레임에 b라는 버튼을 올려줘!
		
		f.setVisible(true); //위에있는걸 다 보여주는역할, 항상 맨아래에 있어야함! //프로그램은 항상 순서대로 실행함 
	}

}
