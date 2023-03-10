package kr.ac.kopo.day04;

import java.util.Scanner;

public class IfMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("보유중인 책 권수 : ");
		int book = sc.nextInt();
		
		//선택지 나열시 min -> max로 가든지 max -> min으로 가야함.
		//다중 if문 : 선택지가 대등한 관계일때 다중if를 많이 씀.
		// 다중 if랑 다중 else if 랑 같은거 아닌가??
		//
		
		if(book == 0) {
			System.out.println("보유중인 책 없음");
		} else if(book == 1) {
			System.out.println(book + " 권");
		} else {
			System.out.println(book + " 권들" );
		}
	}
	
	
	
	

}
