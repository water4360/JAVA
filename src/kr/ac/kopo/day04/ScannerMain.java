package kr.ac.kopo.day04;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("ch : " + ch);
		
		System.out.print("문자열을 입력해주세요 : ");
//		String str = sc.next();
		String str = sc.nextLine();
		System.out.println("str : " + str);

		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		System.out.println("num : " + num);
		
		
		System.out.print("실수를 입력해주세요 : ");
		double num2 = sc.nextDouble();
		System.out.println("num2 : " + num2);
		
		
		
		
	}

}
