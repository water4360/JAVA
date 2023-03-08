package kr.ac.kopo.day01;

public class PrintMain {

	/*
	 * 출력 메소드
	 * System.out.출력메소드()
	 * print()   : 개행문자 불포함.
	 * println() : 개행문자 포함. i.e) enter
	 * printf()  : JDK1.5부터. 홀.. 생각보다 늦게 나왔네. f=formatting
	 * 
	 * 
	 * 공백문자들
	 * ' '
	 * \n이 Newline Character라는 뜻이었네~
	 * \t는 tab이구.
	 */

	public static void main(String[] args) {

		System.out.println(10);
		System.out.println(12.34);
		System.out.println(3.); //3.0
		System.out.println('\'');
		System.out.println('\\');
		
		System.out.print('A');
		System.out.print('\n');
		System.out.print("A\n");
		System.out.println('A');
		
		
		//10 12.34 홍길동
		//이렇게 한줄에 다 찍고 싶어.
		System.out.print(10);
		System.out.print(' ');
		System.out.print(12.34);
		System.out.print(' ');
		System.out.println("홍길동");
		
		System.out.println("간단하게 하면?");
		System.out.println(10+" "+12.34+" "+"홍길동");
		
		System.out.println("printf로 하면?");
		System.out.printf("%d %.2f %s", 10, 12.34, "홍길동\n");
		
		//주의할 것
		System.out.println('A'+'B'); //AB? nono, 131 = 65+66
		System.out.println("A"+"B"); //이렇게 해야 AB!
		System.out.println(10+' '); //10 ? nono, 42 = 10+32
		System.out.println(10+" "); //이렇게 해야 10 !
		
		System.out.println('\u0041'); //유니코드A (65를 16진수로ㅋㅋ)
		
	}

}
