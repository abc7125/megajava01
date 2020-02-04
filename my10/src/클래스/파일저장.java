package 클래스;

import java.io.FileWriter;
import java.io.IOException;

public class 파일저장 {

	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("test.txt"); //()안에는 저장할 파일 이름 쓰면됨 
		f.write("hello"); //my10을 클릭하고 F5를 눌러야 파일이 나타남.
		f.close();

	}

}
