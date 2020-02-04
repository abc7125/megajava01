package 배열심화;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼500개만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000,1000);
		FlowLayout flow = new FlowLayout(); //FlowLayout-붙이는 순서대로 뒤에 붙여주는 class
		f.setLayout(flow);
		
		for (int i = 0; i <500; i++) { //source-써라운드with-for문 클릭 
			JButton b1 = new JButton("자리"+i); //버튼 
		f.add(b1); 
		} 
		f.setVisible(true);
	}

}
