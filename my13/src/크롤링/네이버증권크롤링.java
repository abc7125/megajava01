package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버증권크롤링 {  //자동완성 후 꼭 jsoup으로 해야함

	public static void main(String[] args) throws Exception { //throws excption할때 꼭 2번째꺼로 설정할것
		String site="https://finance.naver.com/item/main.nhn?code=012690";
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
		String no_today=(doc.select("p.no_today").text()); //doc에서 선택함 //.text-텍스트만 가져와라 
		System.out.println(doc.select("td.first").text());
	}

}
