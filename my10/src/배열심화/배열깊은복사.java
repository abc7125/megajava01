package 배열심화;

public class 배열깊은복사 {

	public static void main(String[] args) {
		int[] x= {1,2,3};
		int[] y= x.clone(); //x는 clone를 통해서 깊은복사를 함 
		System.out.println("x: "+x); //주소값 출력 
		System.out.println("y: "+y);
		
		x[2]=5;
		System.out.print("x: "); //깊은복사는 원본의 데이터가 손상되지않고 복사됨
		for (int a : x) {
			System.out.print(a+" ");
		}
		System.out.println(); //줄하나 그음 
		
		System.out.print("y: ");
		for (int b : y) {
			System.out.print(b+" ");
		}

	}

}
