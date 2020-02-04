package 반복문;

public class 반복문4 {

	public static void main(String[] args) {
		String sum =""; //string 사용하고싶을땐 공백 넣기 //넣을게 없으니까 ""으로 넣기
		for (int i = 1; i <= 10000; i++) {
			sum = sum+"축하";
		}
		System.out.println(sum);

	}

}
