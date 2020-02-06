package 일기장;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에저장3 {

	public static void main(String[] args) throws Exception { // Exception 사용하면 무조건 에러처리됨 
		//파일을 인식 + 파일에 저장 
		String name=JOptionPane.showInputDialog("이름입력");
		String company=JOptionPane.showInputDialog("소속입력");
		String day=JOptionPane.showInputDialog("날짜 입력");
		FileWriter file = new FileWriter(day+".txt");
		file.write(name+"\n"); // \n은 새줄을 넣는것 
		file.write(company+"\n"); //file.하고 밑에 뜨는건 오버로딩,다형성 됬다는뜻
		file.close(); //다썻다는뜻 
		
	} //메인의끝

} //클래스끝
