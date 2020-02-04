package 입출력기능;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Me {
	private static JTextField name;
	private static JTextField shoes;
	private static JTextField age;

	public static void main(String[] args) {
		JFrame f = new JFrame(); // new - 복사한다는뜻
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(500, 500); // .(점연산자)=>접근연산자(~에)(안으로 들어갔다는뜻)
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel.setBounds(42, 85, 80, 47);
		f.getContentPane().add(lblNewLabel);

		JLabel label_2 = new JLabel("나이");
		label_2.setFont(new Font("굴림", Font.PLAIN, 40));
		label_2.setBounds(42, 156, 80, 47);
		f.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("신발");
		label_3.setFont(new Font("굴림", Font.PLAIN, 40));
		label_3.setBounds(42, 233, 80, 47);
		f.getContentPane().add(label_3);

		name = new JTextField();
		name.setBackground(Color.WHITE);
		name.setFont(new Font("굴림", Font.PLAIN, 40));
		name.setBounds(134, 90, 203, 36);
		f.getContentPane().add(name);
		name.setColumns(10);

		shoes = new JTextField();
		shoes.setFont(new Font("굴림", Font.PLAIN, 40));
		shoes.setColumns(10);
		shoes.setBackground(Color.WHITE);
		shoes.setBounds(134, 244, 203, 36);
		f.getContentPane().add(shoes);

		JButton btnNewButton = new JButton("출력"); // 출력버튼
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = name.getText(); // 텍스트를가져올수있는기능
				if(n.equals("") || n.equals("다시입력")) { //공백이거나 or 다시입력 일때 이름출력은 되지않음
					name.setText("다시입력");//텍스트를집어넣는기능
				}else {
					System.out.println("이름 출력: " + n + "님"); //이름이 있을때만 출력할것
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 40));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(349, 90, 123, 42);
		f.getContentPane().add(btnNewButton);

		JButton button = new JButton("출력"); // 나이출력버튼
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = age.getText();
				//내년 나이를 구해서,나이 출력 아래서 넣어보세요.
				int a2=Integer.parseInt(a); //분석해서 int형으로 바꾸는 기능
				int nextYear=a2+1;
				System.out.println("나이 출력: " + a + "세");
				System.out.println("내년 나이: " + nextYear + "세");
			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 40));
		button.setBackground(Color.RED);
		button.setBounds(349, 158, 123, 42);
		f.getContentPane().add(button);

		JButton button_1 = new JButton("출력");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = shoes.getText();
				System.out.println("신발 사이즈 출력: " + s+ "mm");
			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 40));
		button_1.setBackground(Color.RED);
		button_1.setBounds(349, 244, 123, 42);
		f.getContentPane().add(button_1);

		JButton button_2 = new JButton("모두 출력");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("모두 출력");
				System.out.println("------");
				String s = shoes.getText();
				String a = age.getText();
				String n = name.getText(); 
				int a2=Integer.parseInt(a); 
				System.out.println("이름 출력: " + n + "님");
				System.out.println("나이 출력: " + a + "세");
				System.out.println("신발 사이즈 출력: " + s+ "mm");
				
				
			}
		});
		button_2.setFont(new Font("굴림", Font.PLAIN, 40));
		button_2.setBackground(Color.RED);
		button_2.setBounds(123, 328, 246, 55);
		f.getContentPane().add(button_2);

		age = new JTextField();
		age.setFont(new Font("굴림", Font.PLAIN, 40));
		age.setColumns(10);
		age.setBackground(Color.WHITE);
		age.setBounds(134, 158, 203, 36);
		f.getContentPane().add(age);

		f.setVisible(true); // 보여지게한다는것,꼭 아래에 있어야함
	}
}
