package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버뮤직크롤링 {  //자동완성 후 꼭 jsoup으로 해야함
//네이버뮤직
	public static void main(String[] args) throws Exception { //throws excption할때 꼭 2번째꺼로 설정할것
		String site="https://music.naver.com/listen/top100.nhn?domain=TOTAL&duration=1d";
		//모나리자 사이트
		//에러처리
		Connection con=Jsoup.connect(site); //위에있는 site와 연결 //con-연결한 정보를 넘겨줌
		System.out.println("사이트 연결 성공.");
		
		Document doc =con.get(); //연결한 정보를 가져옴 //doc-쇼핑몰 사이트 정보가 다들어있음
		System.out.println("2.연결된 사이트에서 문서를 다 가지고 오기 성공");
		System.out.println("3.내용=============================");
		System.out.println(doc);
		
		System.out.println("4.전체문서 중에서 원하는 정보를 추출");
		//pipe연산 (파이프처럼 계속연결함) 
		//ex) cal.add().mul().minus()
		System.out.println(doc.select("a._artist").text()); //가수이름만 출력, 특정한 위치를 가져오면 됨 
	}

}
