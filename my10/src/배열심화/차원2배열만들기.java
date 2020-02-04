package 배열심화;

public class 차원2배열만들기 { //_,$만 클래스이름 앞에 올수있음 

	public static void main(String[] args) {
		//2차원 배열(행, 열을 지정해주어야 한다.)
		//   0 1 2 3 4
		//-------------
		//0: 0 0 0 0 0
		//1: 0 0 0 0 0
		//2: 0 0 0 0 0
		int[][] seat=new int[3][5]; //행,열을 꼭 지정해줘야함. 
		System.out.println("배열의 크기: "+seat.length); //행만 찍힘
		System.out.println("0번행의 크기: "+seat[0].length);
		System.out.println("1번행의 크기: "+seat[1].length);
		System.out.println("2번행의 크기: "+seat[2].length);
		
		for (int i = 0; i < seat.length; i++) { //행만큼(3) 
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j]+" "); //seat[i][j] i는 행 j는열 
			}
			System.out.println();
		}
	}

}
