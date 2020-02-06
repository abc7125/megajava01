package 크롤링;


import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버쇼핑크롤링 {

	public static void main(String[] args) throws Exception { //throws excption할때 꼭 2번째꺼로 설정할것
		String site="https://shopping.naver.com/";
		//네트워크 프로그래밍
		//에러처리
		Connection con=Jsoup.connect(site); //위에있는 site와 연결 //con-연결한 정보를 넘겨줌
		System.out.println("사이트 연결 성공.");
		
		Document doc =con.get(); //연결한 정보를 가져옴 //doc-쇼핑몰 사이트 정보가 다들어있음
		System.out.println("2.연결된 사이트에서 문서를 다 가지고 오기 성공");
		System.out.println("3.내용=============================");
		System.out.println(doc);

	}

}
