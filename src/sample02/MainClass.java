package sample02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 	숫자(상수):
		 		2진수: 0, 1
		 		8진수: 0 ~ 7 8 -> 10  10  -> 12 -> 012
		 		10진수: 0 ~ 9
		 		16진수: 0 ~ 9 A B C D E F (15)
		 		
		 		1010 1100 -> 2진수
		 		8421 8421
		 		A    C   -> 16진수  -> 0xAC
		 		
		 	변수:
		 		빈통(공간)에 데이터를 저장할 수 있는 수
		 		데이터의 종류도 다양하다
		 */
		
		// 숫자
			//정수(byte, short, int, long)
			
			//자료형(byte) 변수(by) -> 1 byte -> 256개 숫자를 표현
			byte by; 
			//대입
			by = 12;
			by = 25;
			by = -128;  // -128 ~ 127
			
			short sh; // -> 2byte
			sh = 134;
			
			int i;  // -> 4byte
			i = 123456;
			
			long l; // -> 8byte
			l = 1234567890123L;
			
			//실수(소수) (float, double)
			float f;  // -> 4byte
			f = 123.456f;
			
			double d;  // -> 8byte
			d = 234.5678901234;
			

		// 문자열
			//문자(char)
			char c;
			c = 'A'; //한문자 넣을때는 작은따옴표
			
			//문자열(string) -> (wrapper)class
			String str ;
			str = "Hello World"; //문자열을 넣을수있음
		
		//  논리 true/false(boolean)
		boolean b;
			
			b = false; // = 0
			b = true; // = 1
			
			
		// 변수명 규칙
			int hh;
			
			System.out.println(by);
			System.out.println(sh);
			

	}

}
