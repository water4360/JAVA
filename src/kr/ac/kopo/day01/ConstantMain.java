package kr.ac.kopo.day01;

public class ConstantMain {

	public static void main(String[] args) {

		int firstNum  = 10;
		int secondNum = 123;

		//변수는 중간에 값이 변경되면 출력결과 역시 변경될 수 있음.
		firstNum = 200;
		
		//상수변수로 만들어주는 키워드 final
		final int LAST_NUM = 10;
//		LAST_NUM = 100;
		
		
//		System.out.println(10 + 10);
		System.out.println(firstNum + secondNum);
		System.out.println(LAST_NUM);
	}

}
