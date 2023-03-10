package kr.ac.kopo.day04;

/*
 * 두개 정수 입력받음 : 12 5
 * 12는 5의 배수판단 : "배수가 아닙니다."
 * 
 * 두개 정수 입력받음 : 12 6
 * 12는 6의 배수판단 : "배수입니다."
 * 
 */
public class OperationMain04 {

	public static void main(String[] args) {
		
//		String msg = true ? "배수이다" : "배수 아니다";
//		System.out.println(false ? "배수이다" : "배수가 아니다");
		
		int num01 = 15, num02 = 5; //콤마,를 순서연산자라고 부름.
		boolean b = (num02 != 0 && num01 % num02 == 0);
		//만약 0이 주어진다면? 조건문을 쓰지 않아도 논리 연산자를 이용해 해결 가능...!
		//num02 != 0 &&를 추가해봤음.
		
		String result = b ? "배수입니다" : "배수가 아닙니다";
		
		System.out.printf("%d는 %d의 %s\n", num01, num02, result);
		
	}

}
