package kr.ac.kopo.day03;

public class OperationMain02 {

	public static void main(String[] args) {
		
		System.out.println("---조건 연산자---");
		
		int a = 0, b = 0;
		
//		boolean result = ++a > 1 && ++b >= 0;
//		System.out.printf("a = %d b = %d\n", a, b);
		//a의 논리가 f이므로 b는 선위증가조차 하지않음. a = 1, b = 0
		
		boolean result = ++b >= 0 && ++a > 1;
		System.out.printf("a = %d b = %d\n", a, b);
		//b의 논리가 t이므로 a까지 진행. a = 1, b = 1
		
		//점심먹고 연산자 쫌 더 하고 스캐너 랜덤 조건문까지 

	}

}
