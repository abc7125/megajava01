package 크롤링;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버증권크롤링3 { // 자동완성 후 꼭 jsoup으로 해야함 

	public static void main(String[] args) throws Exception { // throws excption할때 꼭 2번째꺼로 설정할것
		String site = "https://finance.naver.com/item/main.nhn?code=";// 모나리자
		String[]name= {"모나리자", "삼성전자","sk하이닉스","삼성바이오로직스","셀트리온"};
		String[]company = { "012690", "005930", "000660", "207940", "068270" }; // 모나리자, 삼성전자,sk하이닉스,삼성바이오로직스,셀트리온 순

		
		//배열 반복하는 for문 
		for (int i = 0; i < company.length; i++) {
			Connection con = Jsoup.connect(site + company[i]); // 위에있는 site와 연결 //con-연결한 정보를 넘겨줌
			Document doc = con.get();// 연결한 정보를 가져옴 //doc-쇼핑몰 사이트 정보가 다들어있음
			String date =doc.select("em.date").text(); //텍스트로 가져와서 날짜 출력 
			//장마감을 짤라보자!
			String date2=date.substring(0,10); //0~9번까지의 인덱스
			System.out.println(date2);
			System.out.println("회사명: "+name[i]);
			String today=doc.select("span.blind").get(12).text(); //가져올때 get , text() 텍스트만 가져올것 
			System.out.println("오늘가: "+today); 
			
			String yesterday=doc.select("span.blind").get(15).text(); //get(15)-16번째에위치  
			System.out.println("어제가: "+yesterday); 
			
			String high=doc.select("span.blind").get(16).text(); 
			System.out.println("고가: "+high); 
			System.out.println("--------------------");
			
			FileWriter f = new FileWriter(date2+"-"+name[i]+".txt");
			f.write("날짜:"+date2+"\n");
			f.write("이름:"+name[i]+"\n");
			f.write("오늘:"+today+"\n");
			f.write("어제:"+yesterday+"\n");
			f.write("고가:"+high+"\n");
			f.close(); //다 썻다는 뜻.
		} // for문끝

	} // 메인끝

} // 클래스끝
