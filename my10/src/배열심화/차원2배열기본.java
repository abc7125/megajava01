package 배열심화;

public class 차원2배열기본 {

	public static void main(String[] args) {
		int[][] seat=new int[2][3]; //2행 3열의 배열이라는 의미. 
		//----------
		//   0 1 2
		//  --------
		//0:  0 0 0
		//1:  0 0 0
		seat[0][0]=1; //0행 0열
		seat[0][1]=1;
		seat[1][1]=1;
		seat[1][2]=1; //1이 예매했다는 뜻. 
		
		//극장 예매 상황을 프린트 해주세요.
		//밖의 for:행만큼 반복
		for (int i = 0; i < seat.length; i++) {
			//안의 for:한 행에서의 열만큼 반복
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j]+" "); //2차원 배열은 항상 행과 열을 가지고있음.
			}
			System.out.println();
		}
		
		
		

	}

}
