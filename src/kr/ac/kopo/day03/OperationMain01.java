package kr.ac.kopo.day03;

public class OperationMain01 {

	public static void main(String[] args) {
		
		String str = "Hello";
		String str1 = new String("Hello");
		System.out.println(str1);
		// 정석대로 하자면.
		//str1 = stack에 저장, new = heap에 저장
		System.out.println("---연산시 형일치---");
		System.out.println(10/3);
		System.out.println(10.0/3);
		System.out.println(10/3.0);
		System.out.println(10/3.);
		System.out.println(10/(double)3);
		
		
		
		System.out.println("---복합대입연산자---");
		int num = 123;
		
//		num = num + 1;
//		num = num + 50;
		num += 50; //복합대입연산자, 배정연산자 += -= /= %=
		num += 1;
		++num;
		System.out.println("num : " + num);
		
		System.out.println("---연속된 증감연산자---");
		int a = 10;
//		System.out.println(a + 20);
//		System.out.println(a); 		//10
//		System.out.println(a+=20);
//		System.out.println(a); 		//30
//		System.out.println(a++);
//		System.out.println(a); 		//31
		
		System.out.println(++a); //11
		System.out.println(a++); //여전히 11
		System.out.println(a);   //12
		
		System.out.println("---관계 연산자---");
		System.out.println(3 >= 5);
		System.out.println(5 >= 3);
		
	}
	
}
