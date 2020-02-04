package 배열;

public class 배열연습5 {

	public static void main(String[] args) {
		//친구이름
		String[] names= {"홍길동","조나영","박길동","정길동","송길동"};
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+" "); //위치값을쓸땐 무조건 대괄호[] //" " 은 공백추가 
			
		}
		System.out.println();
		//우리가족 5명의 나이를 넣어보세요.전체출력
		int[] family= {50,40,30,20,10};
		for (int i = 0; i < family.length; i++) { //[length-1] =>배열의 마지막값
			System.out.print(family[i]+" ");
			
		}
		System.out.println();
		//친구들의 발 사이즈를 넣어보세요.전체출력
		int[] size= {155,255,250,230};
		for (int i = 0; i < size.length; i++) {
			System.out.print(size[i]+" ");
			
		}
		System.out.println();
		//친구들의 성별을 넣어보세요.
		char[] a= {'남','여','남','남','남'};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			
		}
		}
	}


