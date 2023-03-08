package kr.ac.kopo.day01;

public class PrintMain02 {

	/*
	 * printf : 변환문자를 이용하여 상수 출력
	 * %c 	   : 문자
	 * %d	   : 10진수 정수
	 * %f	   : 실수(기본적으로 소숫점 여섯번째 자리까지 출력)
	 * %s	   : 문자열
	 * %b	   : 논리값 true/false
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.printf("%d %f %s\n", 10, 12.34, "홍길동");
		System.out.printf("%d %.2f %s\n", 10, 12.34, "홍길동");
		System.out.printf("%d %.1f %s\n", 10, 12.34, "홍길동");
		System.out.printf("%d %.1f %s\n", 10, 12.35, "홍길동");
		
		// 무조건 절사가 필요한 경우는 어떻게 해야 할까?
		//+-0.05로 무조건 내림/올림이 가능!
		System.out.printf("%.1f\n", 14.52-0.05); //14.47->14.5
		System.out.printf("%.1f\n", 14.58-0.05); //14.53->14.5
		
		//%d 앞의 숫자는 자릿수. 숫자 단위가 다를 때 자릿수 확보.
		//+면 오른쪽정렬, -면 왼쪽정렬
		//-는 주로 문자열 정렬시 사용.
		System.out.printf("[%5d] %.1f %s\n", 10, 12.35, "홍길동");
		System.out.printf("[%5d] %.1f %s\n", 1000, 12.35, "홍길동");
		System.out.printf("[%-5d] %.1f %s\n", 10, 12.35, "홍길동");
		System.out.printf("[%-5d] %.1f %s\n", 1000, 12.35, "홍길동");
		System.out.printf("[%-5d] %.1f [%-5s]", 1000, 12.35, "홍길동");
		System.out.println();
		
		//05라면 0으로 채워서 5자리수 확보한다는 뜻.  
		System.out.printf("[%05d] %.1f [%-5s]\n", 123, 12.35, "홍길동");
		//-05라면 12300으로 나올까? 말도 안됨~
		//출력이 원본을 잘못 표현할 수는 없어서 에러가 남.
		System.out.printf("[%-5d] %.1f [%-5s]\n", 123, 12.35, "홍길동");
		//5d면 12345로 나올까? 노~
		//출력이 원본을 잘못 표현할 수는 없으므로 무시됨!
		System.out.printf("[%5d] %.1f [%-5s]\n", 12345678, 12.35, "홍길동");
		
		
		//논리값
		System.out.println(true);
		System.out.println(false);
		System.out.println(5>3);
		
		System.out.printf("4 > 2 : %b\n", 4 > 2);
		
		
	}

}
