package 조건문;

public class 성적처리2 {

	public static void main(String[] args) {
		// 점수가 88점 이라고 해봅시다.
		int jumsu = 88;
		if (jumsu >= 90) { // 조건에 들어오는 연산자는 항상 비교연산자
			System.out.println("A학점");
		} else if (jumsu >= 80) { // 조건쓸땐 항상 if를씀 //if옆에서는 소괄호가 오게하고, 조건을 꼭 써주어야한다. //else if 자바에서는 이렇게 떨어뜨려서 써야함
			System.out.println("B학점");
		} else if (jumsu >= 70) {
			System.out.println("C학점 ");
		}else {
			System.out.println("F학점");
		}

	} // main끝

} // 클래스끝
