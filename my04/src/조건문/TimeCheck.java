package 조건문;

import java.util.Date;

public class TimeCheck {

	public static void main(String[] args) {
		// 실행할 때 현재 시각을 구해서
		// 얼마나 집에 갈 시간이 남았는지 체크
		Date date = new Date(); //날짜에 대한 정보를 가짐
		int hour =date.getHours(); //현재 시간을 알려줌 //줄그어진이유는 옛날부품이기때문(*지금이클립스는최신버전임)
		
		if(hour < 22) {
			//ctrl+알트+화살표아래: 한줄 복사 
			//컨트롤 + 딜리트 : 한줄삭제
		System.out.println("집에 갈 시간이 많이 남았어요.");
		
		}else {
			//알트+화살표 방향:이동
			System.out.println("집에 갈 시간이 조금 남았어요.");
		}
		}
	}


