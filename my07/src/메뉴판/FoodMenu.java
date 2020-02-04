package 메뉴판;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FoodMenu {
	static int 짜장 = 0; // 주문수 카운트
	//선언!의 위치가 변수를 사용할수있는범위
	//클래스 전체영역에서 쓸수있는 변수 : 전역변수
	static int 우동 = 0; // 주문수 카운트
	static int 짬뽕 = 0; // 주문수 카운트
	static int count = 0; // 주문수 카운트
	static int sum = 0; // 전체금액 계산
	private static JTextField t2;
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame(); 
		//JFrame은 지역변수 (지역안에서만 쓸수있음, 전역변수가 더 넓은범위)
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("지불할 총 금액");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("굴림체", Font.BOLD, 20));
		lblNewLabel.setBounds(47, 374, 210, 35);
		f.getContentPane().add(lblNewLabel);

		t2 = new JTextField();
		t2.setForeground(Color.RED);
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setBounds(208, 374, 223, 30);
		f.getContentPane().add(t2);
		t2.setColumns(10);

	
		JLabel j = new JLabel(""); //위로 올라가야하는 코드 
		JButton btnNewButton = new JButton("짜장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count++;
				t1.setText(count + "개");
				sum = count * 5000;
				t2.setText(sum + "원");
				짜장++;
				j.setText(짜장+"개");
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 21));
		btnNewButton.setBounds(26, 25, 97, 34);
		f.getContentPane().add(btnNewButton);

		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("jaja.gif"));
		img.setBounds(84, 133, 347, 192);
		f.getContentPane().add(img);

		JLabel w = new JLabel("");
		JButton button = new JButton("우동");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				t1.setText(count + "개");
				sum = count * 5000;
				t2.setText(sum + "원");
				// 우동그림을 img라벨에 icon으로 집어 넣어야함
				ImageIcon icon = new ImageIcon("nood.png");
				img.setIcon(icon);
				우동++;
				j.setText(우동+"개");
			}
		});
		button.setBackground(Color.ORANGE);
		button.setFont(new Font("굴림", Font.BOLD, 21));
		button.setBounds(130, 25, 97, 34);
		f.getContentPane().add(button);
		
		JLabel ja = new JLabel("");
		JButton button_1 = new JButton("짬뽕");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; // 증감연산자
				t1.setText(count + "개");
				sum = count * 5000;
				t2.setText(sum + "원");
				짬뽕++;
				j.setText(짬뽕+"개");
			}
		});
		button_1.setBackground(Color.YELLOW);
		button_1.setFont(new Font("굴림", Font.BOLD, 21));
		button_1.setBounds(236, 25, 97, 34);
		f.getContentPane().add(button_1);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setForeground(Color.BLUE);
		t1.setBounds(345, 26, 116, 33);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		 
		j.setBounds(47, 69, 57, 15);
		f.getContentPane().add(j);
		
		
		w.setBounds(140, 69, 57, 15);
		f.getContentPane().add(w);
		
		
		ja.setBounds(261, 69, 57, 15);
		f.getContentPane().add(ja);


		f.setVisible(true);
	}
}
