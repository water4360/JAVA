package kr.ac.kopo.day04;

public class OperationMain05 {

	public static void main(String[] args) {

		//비트연산자 연습
		int num = 0xE855AA39;
		
		//x = 16진수(알파벳이 소문자로), X = 대문자로.
		System.out.printf("%8x\n", num);
 		System.out.printf("%x\n", ~num); //~ = bit Not
 		System.out.printf("%08x\n", num & 0xffff0000); //뒷자리 4개만 다 0으로 마스킹.
 		System.out.printf("%08x\n", num | 0x0000ffff); //뒷자리 4개만 다 f로 마스킹.
 		
	}

}
