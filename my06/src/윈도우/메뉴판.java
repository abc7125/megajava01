package 윈도우;

import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 메뉴판 {
	// 도너츠의 개수
	static  int count = 10;

	public static void main(String[] args) {
		// 큰 프레임을 만들어아함
		JFrame f = new JFrame();

		// 프레임의 크기를 결정해야함
		f.setSize(470, 322); // 가로,세로

		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\tjoeun304-11\\Desktop\\do.png"));
		f.getContentPane().add(label, BorderLayout.CENTER);

		JButton btnNewButton = new JButton("-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(null, "도너츠 빼기");
				if (count !=0) { //0이 아닐때 
					count--;
					System.out.println("도너츠의 개수는 "+count+"개");
					f.setTitle("도너츠의 개수: "+count+"개"); //창 제목
				} else {
					f.setTitle("더이상 뺄 수 없음");
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		btnNewButton.setBackground(Color.GREEN);
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);

		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "도너츠 더하기");
				count++;
				System.out.println("도너츠의 개수는 "+count+"개");
				f.setTitle("도너츠의 개수: "+count+"개"); 
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);

		// 프레임을 보여지게 설정해야함
		f.setVisible(true);
	}

}
