package 배열;

public class 배열간단출력 {

	public static void main(String[] args) {
		int[] age= {10,20,30};
		for (int i = 0; i < age.length; i++) { //i는 index의 앞자리(의미는 없음)
			System.out.print(age[i]+" ");
		}
		System.out.println();
		for (int x : age) { //foreach 
			System.out.print(x +" ");
		}
		
		System.out.println();
		//double형으로 입력했을때
		double[] eyes= {0.7,0.5,0.9};
		for (double d : eyes) {
			System.out.print(d+" ");
		}
		System.out.println();
		for (int i = 0; i < eyes.length; i++) { //인덱스이므로 굳이 double을 쓸필요없음
			System.out.println(eyes[i]);
		}
		
		
		
		
	}

}
