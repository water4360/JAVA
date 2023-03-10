package kr.ac.kopo.day03;

/*
 * 두개 정수 입력받음 : 12 5
 * 12는 5의 배수판단 : false 나오도록.
 * 
 * 두개 정수 입력받음 : 12 6
 * 12는 6의 배수판단 : true가 나오도록
 * 
 * 코딩작성시 키포인트는 내가 말하고자 하는 바를 어떻게 표현할 것인가,
 * 즉 배수를 어떻게 표현할 것인가.
 */

public class OperationMain03 {

	public static void main(String[] args) {
		
		int num01 = 15, num02 = 0; //콤마,를 순서연산자라고 부름.
		boolean b = (num02 != 0 && num01 % num02 == 0);
		//만약 0이 주어진다면? 조건문을 쓰지 않아도 논리 연산자를 이용해 해결 가능...!
		//num02 != 0 &&를 추가해봤음.
		
		System.out.printf("%d는 %d의 배수판단 : %b\n", num01, num02, b);
		
	}

}
