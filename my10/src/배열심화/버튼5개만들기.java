package 배열심화;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼5개만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000,1000);
		FlowLayout flow = new FlowLayout(); //FlowLayout-붙이는 순서대로 뒤에 붙여주는 class
		f.setLayout(flow);
		JButton b1 = new JButton("자리1"); //버튼 
		JButton b2 = new JButton("자리2");
		JButton b3 = new JButton("자리3"); //버튼 
		JButton b4 = new JButton("자리4");
		f.add(b1); //붙여주는역할,b1이 먼저붙음. 
		f.add(b2); //붙여주는역할
		f.add(b3); 
		f.add(b4); 
		
		
		
		
		
		
		
		f.setVisible(true); //항상 아래에있어야함

	}

}
