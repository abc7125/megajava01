package 응용문제;

public class 과목 {
//배열깊은복사점수변경
	public static void main(String[] args) {
		int[] math= {100,88,96}; //1학기 수학점수
		int[] math2=math.clone(); //2학기 수학점수
		
		math2[0]=99;
		System.out.print("1학기 수학 점수: "); //깊은복사는 원본의 데이터가 손상되지않고 복사됨
		for (int a : math) {
			System.out.print(a+" ");
		}
		System.out.println(); //줄하나 그음 
		
		System.out.print("2학기 수학 점수: ");
		for (int b : math2) {
			System.out.print(b+" ");
			
	}

}
}