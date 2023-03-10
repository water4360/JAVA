package kr.ac.kopo.day04;

import java.util.Scanner;

/*
 * 보유중인 책의 권수를 입력 : 3
 * 3 books 라고 출력(복수형태)
 * 
 * 보유중인 책의 권수를 입력 : 1
 * 1 book 라고 출력(단수형태)
 * 
 * 보유중인 책권수 입력 : 0
 * 보유중인 책 없음 이라고 출력. 세번째 선택지.
 */


public class IfMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("보유중인 책 권수 : ");
		int book = sc.nextInt();
		
		//선택지 나열시 min -> max로 가든지 max -> min으로 가야함.
		

		if(book == 0) {
			System.out.println("보유중인 책 없음");
		} else {

			if(book == 1) {
			System.out.println(book + " 권");
			} else {
				System.out.println(book + " 권들" ); //이때 이게 1이 아니면 만으로 해석하면 안됨! 주의.
			}
		}
	}
}
