package 일기장;

import java.io.FileWriter;
import java.io.IOException;

public class 파일에저장2 {

	public static void main(String[] args) throws Exception { // Exception 사용하면 무조건 에러처리됨 
		//파일을 인식 + 파일에 저장 
		FileWriter file = new FileWriter("20200121.txt");
		file.write("hi.."+"\n"); // \n은 새줄을 넣는것 
		file.write("hello.."+"\n"); //file.하고 밑에 뜨는건 오버로딩,다형성 됬다는뜻
		file.close(); //다썻다는뜻 

	} //메인의끝

} //클래스끝
