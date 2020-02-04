package 계산기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Cal {
	private static JTextField t1;
	private static JTextField t2;
	/**
	 * @wbp.nonvisual location=531,289
	 */
	private static final JTextField textField = new JTextField();
	private static JTextField result;

	public static void main(String[] args) {
		textField.setColumns(10);
		JFrame f=new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 0));
		f.setSize(350,350);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tjoeun304-11\\Desktop\\cal.png"));
		lblNewLabel.setBounds(91, 24, 134, 61);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1:");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(27, 115, 103, 34);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("숫자2:");
		label.setFont(new Font("굴림", Font.BOLD, 20));
		label.setBounds(27, 159, 103, 35);
		f.getContentPane().add(label);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 20));
		t1.setBounds(91, 115, 168, 34);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBounds(91, 160, 168, 34);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1.t1과 t2입력값을 가지고 온다.
				String t11=t1.getText();
				String t22=t2.getText();
				//2.t1과 t2의 타입을 계산해주기 위해서 int로 변환
				int t111=Integer.parseInt(t11);
				int t222=Integer.parseInt(t22); //컴퓨터는 모두  string으로 입력받으므로 int형으로 쓰고싶을때 int형으로 바꿔야함 
				
				//3. 두수를 더한다
				int t=t111+t222;
				//4.더한 결과는 result에 넣어준다 //String s=String.valueOf(t)로도 가능
				// 결과값:300
				result.setText("결과값: "+t);
			}
		});
		btnNewButton.setBounds(12, 220, 69, 34);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("빼기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//입력값 가져오기
				String t33=t1.getText();
				String t44=t2.getText();
				//int로변환
				int t333=Integer.parseInt(t33);
				int t444=Integer.parseInt(t44);
				//두수를뺀다
				int tt=t333-t444;
				result.setText("결과값: "+tt);
				
			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 10));
		button.setBounds(89, 220, 69, 34);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("곱하기");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//입력값 가져오기
				String t55=t1.getText();
				String t66=t2.getText();
				//double형으로 변환
				double t555=Double.parseDouble(t55);
				double t666=Double.parseDouble(t66);
				//두수를 곱한다
				double ttt=t555*t666;
				result.setText("결과값: "+ttt);
				
			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 10));
		button_1.setBounds(170, 220, 69, 34);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("나누기");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t77=t1.getText();
				String t78=t2.getText();
				//int형으로 변환
				int t777=Integer.parseInt(t77);//111
				int t888=Integer.parseInt(t78);///222
				//두수를 나눈다
				int tttt=t777 / t888;
				result.setText("결과값 :"+tttt);
				
			}
		});
		button_2.setFont(new Font("굴림", Font.PLAIN, 10));
		button_2.setBounds(253, 220, 69, 34);
		f.getContentPane().add(button_2);
		
		JLabel lblNewLabel_2 = new JLabel("결과화면:");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(41, 271, 89, 30);
		f.getContentPane().add(lblNewLabel_2);
		
		result = new JTextField();
		result.setFont(new Font("굴림", Font.PLAIN, 20));
		result.setColumns(10);
		result.setBounds(129, 267, 168, 34);
		f.getContentPane().add(result);
		
		
		
		f.setVisible(true);

	}

}
