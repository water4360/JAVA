package kr.ac.kopo.day04;

import java.util.Scanner;

/*
 * 보유중인 책의 권수를 입력 : 3
 * 3 books 라고 출력(복수형태)
 * 
 * 보유중인 책의 권수를 입력 : 1
 * 1 book 라고 출력(단수형태)
 */

public class IfMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("보유중인 책의 권수를 입력하세요 : ");
		int book = sc.nextInt();
		
		System.out.println(book + (book == 1? "권" : "권들"));
		
		if(book > 1) {
			System.out.println(book + " books");
		} else {
			System.out.println(book + " book");
		}
		
		/*
		if(book == 1) {
			System.out.println(book + " book");
		} else {
			System.out.println(book + " books");
		}
		*/
		
		/*
		System.out.print(book + " book");
		
		if(book != 1) {
			System.out.println("s");
		}
		*/
		
	}
}
