package 일기장;

import java.io.File;

public class 파일에저장 {

	public static void main(String[] args) {
		//20200121.txt
		File file = new File("c:/my/readme.txt"); //파일 인식시켜줌 //c드라이브-my폴더안-readme.txt /는 아래라는뜻
		boolean ex=file.exists(); //파일존재하는지 체크
		System.out.println("존재여부: "+ex);
		System.out.println("폴더여부: "+file.isDirectory()); //directory -폴더
		System.out.println("파일여부: "+file.isFile());
		System.out.println("위치확인: "+file.getPath()); //getpath-위치를 알려줌
		
		System.out.println();
		File file2 = new File("c:/windows"); //변수는 똑같이 쓰면안됨.
		String[] list =file2.list(); //list 타입이 String이므로 똑같이 String타입으로 만들어줌, list-파일 목록을 알수있음 
		//배열은 항상 for문을 생각해야함. 배열은 인덱스를 갖고있다(꼭 0번부터 시작)
		int folderCount=0; //for문 밖에 선언
		int fileCount=0;
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			File file3=new File("c:/windows/"+list[i]); //절대경로 꼭 붙여줘야함 , 그래야 인식함
			if(file3.isFile()) { //파일이니?
				//list[0]=mib.bin 
				fileCount++;
				}else { //파일 아닌경우
				folderCount++;
			}
		} //for문의 끝
		System.out.println("폴더의 개수: "+folderCount+"개");
		System.out.println("파일의 개수: "+fileCount+"개");
		

	} //메인의끝

} //클래스끝
