package 제어;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 기본입력2 {

	public static void main(String[] args) throws IOException {
		//두개를 입력받아서
		String s1=JOptionPane.showInputDialog("올해는?");
		String s2=JOptionPane.showInputDialog("목표는?");
		
	    //두개를 결합시켜
		String s3=s1+s2;
		
		//그 결합 결과를 출력
		//System.out.println(s3);
		
		//JOptionPane.showMessageDialog(null,s3); //메세지를보임
		
		
		FileWriter file = new FileWriter("win.txt");
        file.write(s3);
        file.close(); //파일닫음,출력은안되고 파일로만들어져있음!
	}

}
