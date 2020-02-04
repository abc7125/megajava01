package 배열;

public class 배열연습1 {

	public static void main(String[] args) {
		int[] num = new int[10]; // 10개 복사함,(num변수에 집어넣음)
		// int[]:int로 만들어진 배열타입
		// num : 배열의 주소가 들어있음, 참조형
		// new:복사
		// new int : int변수를 복사해라
		// new int[10] : int변수를 10개 복사해라

		System.out.println(num); // 주소확인 , 잘쓸일은 없음
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[9]);
		//배열은 변수에 초기값을 넣어준다.
		//int배열은 모두 다0으로 초기화를 해준다.
		
		num[0]=5; //첫번째값에 5을 집어넣음 , 첫번째 인덱스는 반드시0으로시작함. 
		System.out.println(num[0]);
		//5번째 위치값을 10으로넣어서 출력
		num[4]=10;
		System.out.println(num[5]);
		//10번째 위치값을 20으로 넣어서 출력
		num[9]=20;
		System.out.println(num[9]);

	}

}
