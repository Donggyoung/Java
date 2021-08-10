package day01;

public class SystemOut {

	// main이라 적고 ctrl + space 누르면 main 생성된다
	public static void main(String[] args) {
		
		System.out.println("안녕하세요"); // 줄바꿈
		System.out.println("반갑습니다");
		
		// sysout치고 ctrl + space 누르면 개행 포함 print문 생성
		System.out.println("123");
		// 개행이 없는 print문
		System.out.print("개행 포함 x 출력문\n");
		
		int year = 2021;
		int month = 8;
		int day = 10;
		
		// 형식 지정 출력문 printf
		// \n 줄바꿈, \t 탭 띄어쓰기
		// %d 정수 입력 받음, %s 문자열 입력 받음, %f 실수 입력 받음
		System.out.printf("오늘은 %d년 %d월 %d일 입니다\n", year, month, day);
		System.out.printf("원주율은 %f\n", 3.14);
		System.out.printf("제 이름은 %s 입니다\n", "가나다");
		
		// 전체선택 ctrl + a
		// 주석 단축키 ctrl + /
		// 되돌리기 ctrl + z
		// 코드 번호 바꾸고 싶으면 커서 주고 alt 방향 키
		// 이름을 한번에 수정 alt + shift + r
	}
}
