package 클래스;

public class 내방 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		텔레비젼 t1 = new 텔레비젼(); //텔레비젼을 복사 
		t1.shape="네모";
		t1.size=50;
		t1.changeCh(); //채널
		t1.off();
		System.out.println("t1: "+ t1); //주소값출력
		텔레비젼 t2 = new 텔레비젼();
		t2.shape="동그라미";
		t2.size=100;
		t2.changeCh();
		t2.off(); 
		System.out.println("t2: "+ t2);
	}

}
