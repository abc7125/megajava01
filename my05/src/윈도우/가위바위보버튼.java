package 윈도우;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 가위바위보버튼 {

	public static void main(String[] args) {
		JFrame f = new JFrame(); //창만들기
		f.getContentPane().setBackground(Color.GREEN);
		
		JButton btnNewButton = new JButton("가위");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//버튼을 클릭했을때 처리 내용이 나옴 
				JOptionPane.showMessageDialog(null,"가위를 누르셨군요"); //메세지창
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("바위");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"바위를 누르셨군요");
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		f.getContentPane().add(btnNewButton_1, BorderLayout.CENTER);
		
		JButton btnNewButton_2 = new JButton("보");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"보를 누르셨군요");
			}
		});
		btnNewButton_2.setBackground(Color.BLUE);
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		f.setSize(300, 300); //가로,세로의 길이사이즈
		
		
		
		f.setVisible(true); //보이게 할거니, 안보이게할거니?

	}

}
