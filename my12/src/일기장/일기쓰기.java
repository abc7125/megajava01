package 일기장;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 일기쓰기 {
	private static JTextField t1;
	private static JTextField t2;

	public void diary () { //메인이 없음. 메인이 없어야 부를수있음 , 메인이없으면 디자인에 들어갈수없음 
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 182, 193));
		f.getContentPane().setForeground(Color.WHITE);
		f.setTitle("일기 쓰기 창");
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 25));
		t1.setBounds(224, 56, 211, 30);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 25));
		t2.setColumns(10);
		t2.setBounds(224, 98, 211, 30);
		f.getContentPane().add(t2);

		JTextArea t3 = new JTextArea();
		t3.setFont(new Font("굴림체", Font.BOLD, 25));
		t3.setRows(5);
		t3.setLineWrap(true);
		t3.setColumns(20);
		t3.setBounds(224, 157, 211, 148);
		f.getContentPane().add(t3);

		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("바탕체", Font.BOLD, 20));
		lblNewLabel.setBounds(35, 56, 151, 35);
		f.getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("오늘의 제목");
		label.setFont(new Font("바탕체", Font.BOLD, 20));
		label.setBounds(35, 98, 151, 35);
		f.getContentPane().add(label);

		JLabel label_1 = new JLabel("오늘의 내용");
		label_1.setFont(new Font("바탕체", Font.BOLD, 20));
		label_1.setBounds(35, 172, 151, 35);
		f.getContentPane().add(label_1);

		JButton btnNewButton = new JButton("파일에 일기 저장"); // 파일에일기저장하는버튼
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1.입력한 값 가져오기
				String day = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				// 2.파일에 저장하기
				try { // try~catch : 에러가 생기면 잡는다는뜻
					FileWriter f = new FileWriter(day + ".txt");
					f.write(title + "\n"); // 제목
					f.write(content + "\n"); // 내용
					f.close();
					JOptionPane.showMessageDialog(null, "저장 완료!! 내일 또 만나요!");
				} catch (IOException e1) {
					System.out.println("파일 저장 중 에러가 생김.");
				}
				// 3.확인메세지 뿌리기
			}
		});
		btnNewButton.setBounds(190, 383, 245, 43);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\tjoeun304-11\\Desktop\\heart.png"));
		lblNewLabel_1.setBounds(12, 217, 200, 148);
		f.getContentPane().add(lblNewLabel_1);

		f.setVisible(true);
	}
}
