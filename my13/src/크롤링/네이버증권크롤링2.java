package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버증권크롤링2 { // 자동완성 후 꼭 jsoup으로 해야함

	public static void main(String[] args) throws Exception { // throws excption할때 꼭 2번째꺼로 설정할것
		String site = "https://finance.naver.com/item/main.nhn?code=";// 모나리자
		String[]name= {"모나리자", "삼성전자","sk하이닉스","삼성바이오로직스","셀트리온"};
		String[]company = { "012690", "005930", "000660", "207940", "068270" }; // 모나리자, 삼성전자,sk하이닉스,삼성바이오로직스,셀트리온 순

		
		//배열 반복하는 for문 
		for (int i = 0; i < company.length; i++) {
			Connection con = Jsoup.connect(site + company[i]); // 위에있는 site와 연결 //con-연결한 정보를 넘겨줌
			Document doc = con.get();// 연결한 정보를 가져옴 //doc-쇼핑몰 사이트 정보가 다들어있음
			System.out.println("회사명: "+name[i]);
			System.out.print("오늘가: "); //오늘가 왜안나오는지 물어보기
			System.out.println(doc.select("p.no_today").text()); // doc에서 선택함 //.text-텍스트만 가져와라
			System.out.println(doc.select("td.first").text());
			System.out.println("--------------------");
		} // for문끝

	} // 메인끝

} // 클래스끝
