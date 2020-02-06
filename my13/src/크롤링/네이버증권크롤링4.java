package 크롤링;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 네이버증권크롤링4 {
	private static JTextField t1;

	public static void main(String[] args) {
		String site = "https://finance.naver.com/item/main.nhn?code=";
		JFrame f =new JFrame();
		f.getContentPane().setBackground(new Color(255, 182, 193));
		f.setSize(350,350);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("모나미");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("005360"); //버튼을 눌렀을때 텍스트가 나타남
			}
		});
		
		t1 = new JTextField();
		t1.setBounds(80, 125, 167, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JTextArea t2 = new JTextArea();
		t2.setBounds(80, 179, 167, 122);
		f.getContentPane().add(t2);
		btnNewButton.setFont(new Font("돋움체", Font.PLAIN, 13));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(105, 10, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("삼성전자");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("005930");
			}
		});
		button.setFont(new Font("돋움체", Font.PLAIN, 13));
		button.setBackground(Color.ORANGE);
		button.setBounds(105, 43, 97, 23);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("셀트리온");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("068270"); 
			}
		});
		button_1.setFont(new Font("돋움체", Font.PLAIN, 13));
		button_1.setBackground(Color.ORANGE);
		button_1.setBounds(105, 76, 97, 23);
		f.getContentPane().add(button_1);
		
		JLabel lblNewLabel = new JLabel("CODE:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(130, 109, 57, 15);
		f.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("크롤링시작");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1.코드값을 가지고 온다.
				String code=t1.getText();
				//2.그 코드값으로 크롤링한다.
				try {
					Connection con = Jsoup.connect(site + code); // 위에있는 site와 연결 //con-연결한 정보를 넘겨줌
					Document doc = con.get();// 연결한 정보를 가져옴 //doc-쇼핑몰 사이트 정보가 다들어있음
					String date =doc.select("em.date").text(); //텍스트로 가져와서 날짜 출력 
					//장마감을 짤라보자!
					String date2=date.substring(0,10); //0~9번까지의 인덱스
				String today=doc.select("span.blind").get(12).text(); //가져올때 get , text() 텍스트만 가져올것 
					String yesterday=doc.select("span.blind").get(15).text(); //get(15)-16번째에위치  
					String high=doc.select("span.blind").get(16).text(); 
					t2.setText(""); //공백 추가
					t2.append("날짜: "+date2+"\n"); //append-순서대로 붙는 역할 
					t2.append("오늘: "+today+"\n");
					t2.append("어제: "+yesterday+"\n"); 
					t2.append("최고: "+high+"\n");  
				} catch (Exception e2) { //에러가 났을때
					System.out.println("에러발생!! 에러발생!!");
				}
				//3.가져온 크롤링값을 화면에 넣는다. 
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 13));
		btnNewButton_1.setBackground(SystemColor.inactiveCaption);
		btnNewButton_1.setBounds(105, 146, 126, 23);
		f.getContentPane().add(btnNewButton_1);
		
		
		
		
		
		f.setVisible(true);

	}
}
