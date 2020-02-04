package 클래스;

public class Bank {
String name;
String accout; //계좌이름
int money;

public void 예금하다() {
	System.out.println("예금하다");
}
public void 출금하다() {
	System.out.println("출금하다");
	
	
	
	
	
}
//소스 - generate toString() 클릭
@Override
public String toString() {
	return "Bank [name=" + name + ", accout=" + accout + ", money=" + money + "]";
}
}
