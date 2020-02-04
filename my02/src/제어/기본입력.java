package 제어;

import javax.swing.JOptionPane;

public class 기본입력 {
	//순차문
	//프로그램의 흐름은?
    //데이터를 입력---> 처리 ---->결과 출력
	//자동주석:컨트롤+/
	public static void main(String[] args) {
		//1.입력)-당신의 소속은? 메가
	String company=JOptionPane.showInputDialog("당신의 소속은"); //외울필요없음,접근연산자 //showinput~ 대화를입력해서보여달라는뜻,input-입력,dialog-대화
	
	//2)처리-(메가+스터디)해서 임의의 변수에 저장
    
	String result=company+"스터디";
    
  //3.출력-2번의 변수 내용을 모니터에 출력 
	System.out.println("당신은"+result+"소속이군요."); //결합연산자 

	}

}
