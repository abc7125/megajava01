package 일기장;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tjoeun304-11\\Desktop\\main.jpg"));
		lblNewLabel.setBounds(27, 10, 445, 191);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1.setBounds(85, 211, 80, 31);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_2.setBounds(76, 252, 105, 47);
		f.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(177, 215, 191, 31);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(177, 264, 191, 31);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=t1.getText(); //getText-입력한값 가져오기 //setText-값 넣기 
				String pw=t2.getText();
				if(id.equals("root") && pw.equals("1234")) { //기본형이 아닌 부품인경우(String)에는 equal를 써야함. 
					//id가 root일때, 비번이 1234일때 맞는 로그인
					//일기쓰러감 =>diary()필요 (다이어리 메소드가 필요함)
					일기쓰기 today = new 일기쓰기();
					today.diary(); 
					//diary()메소드를 쓰고싶으면,
					//이 메소드를 쓸수있는 주소를 가진 변수만 있으면 된다. 
				}else {
					//경고메세지
					JOptionPane.showMessageDialog(null,"id,pw입력이 잘못되었습니다."); //메세지창 띄움
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\tjoeun304-11\\Desktop\\check.png"));
		btnNewButton.setBounds(38, 319, 127, 118);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton(""); //리셋버튼
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//id,pw를 공백으로 초기화
				t1.setText("");
				t2.setText("");
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\tjoeun304-11\\Desktop\\reset.png"));
		button.setBounds(200, 293, 255, 158);
		f.getContentPane().add(button);
		f.setTitle("나의 일기장");
		f.setSize(500, 500);
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}
}
