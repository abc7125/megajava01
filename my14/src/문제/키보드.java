package 문제;

//실습, 코드꼭 분석해볼것
public class 키보드 {
	int price;
	String com; //회사
	int count; //개수
	
	public 키보드(int p,int c) {
		price=p;
		count=c;
	}
	public 키보드(int p,String co, int c) {
		price=p;
		com=co;
		count=c;
	}
	@Override
	public String toString() {
		return "키보드 [price=" + price + ", com=" + com + ", count=" + count + "]";
	}
}
