package kr.ac.kopo.day04;

import java.util.Scanner;

public class ScannerMain02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num01 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num02 = sc.nextInt();
		
		System.out.printf("%d는 %d의 배수가 %s",
				num01, num02,
				num01 % num02 == 0 ? "맞습니다" : "아닙니다");
		
	}

}
