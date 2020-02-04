package 배열심화;

public class 배열복사 {

	public static void main(String[] args) {
		//x는 1,2,3이 들어있는 주소가 들어있음. 
		int[] x= {1,2,3};
		//y에 x의 주소가 복사됨
		//주소가 들어있는 변수:참조형 변수
		//복사할때 원본이 복사되지 않아서, 하나의 데이터를 두변수가 공유하고 있는 모양!
		//이 복사를 '얕은복사'라고 함. =>원본이 훼손되는 복사 
		//배열의 복사는 '깊은 복사'를 해야한다.
		//깊은 복사는 원본의 데이터를 복사!!
		int[] y=x;
		
		System.out.println(x); //주소값이 출력
		System.out.println(y);
		
		System.out.print("x: ");
		for (int a : x) {
			System.out.print(a+" ");
		}
		System.out.println(); //줄하나 그음 
		
		System.out.print("y: ");
		for (int b : y) {
			System.out.print(b+" ");
		}
		
		System.out.println("\n--------"); // \n은 엔터라는뜻
		
		x[2]=5;
		
		System.out.print("x: ");
		for (int a : x) {
			System.out.print(a+" ");
		}
		System.out.println(); //줄하나 그음 
		
		System.out.print("y: ");
		for (int b : y) {
			System.out.print(b+" ");
		}
		
		System.out.println("\n--------"); // \n은 엔터라는뜻
		
		
		
		
		
		}
	}


