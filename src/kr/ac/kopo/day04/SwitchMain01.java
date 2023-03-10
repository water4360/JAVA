package kr.ac.kopo.day04;

import java.util.Scanner;

/*
 * 1 - 3 사이의 정수 입력 :
 * 1입력 => ONE
 * 2입력 => TWO
 * 3입력 => THREE
 * 그외 입력 => ERROR!
 * 
 */

public class SwitchMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 3 사이의 정수 : ");
		int no = sc.nextInt();
		
		
		//no의 값에 따라.
		//책갈피의 역할을 하는 case. 즉 선택된 case부터 끝까지 쭉 달림.
		//멈춰주는 break를 분기문이라고도 부름.
		//=> switch에서만 쓸 수 있으며 if에서 쓰면 에러남.
		//case 뒤에 올 수 있는 애는 문자, 문자열, 정수만. !실수10.4, 논리값 불가!
		//default는 else의 역할과 동일. 단, 순서는 상관이 없긴 하지만 비추천ㅋㅋ
		switch(no) {
		case 1 : 
			System.out.println("ONE");
			break;
		case 2 : 
			System.out.println("TWO");
			break;
		case 3 : 
			System.out.println("THREE");
			break;
		default : 
			System.out.println("ERROR!!");
		}
		
		/*
		if(no == 1) {
			System.out.println("ONE");
		} else if(no == 2) {
			System.out.println("TWO");
		} else if(no == 3) {
			System.out.println("THREE");
		} else {
			System.out.println("ERROR!");
		}
		*/

	}
}
