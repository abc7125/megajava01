package 배열;

public class 배열연습3 {

	public static void main(String[] args) {
		int[] num=new int[10];
		//각 int변수내에 0으로 초기값이 다 들어가있는 상태
		/*num[0]=0;
		num[1]=1;
		num[2]=2;*/
		
		//전체 개수를 구해봅시다.
		System.out.println(num.length); //length-길이라는뜻
		//이클립스에서는 for문을 자동완성 할때
		//바로 위에 있는 배열을 기준으로 만들어준다.
		for (int i = 0; i < num.length; i++) { //값 넣어주는 for
			num[i]=i;
			//num[0]=0
			//num[1]=1
			
		}
		for (int i = 0; i < num.length; i++) { //출력하는 for
			System.out.println(num[i]);
		}
	}

}
