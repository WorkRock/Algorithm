//***************************
// 파일명: MyHashtableTest
// 작성자: 201632023 이지훈
// 작성일: 20.05.13.
// 내용: 해쉬테이블 구현과 연산
//***************************
package hw7_1;

import java.util.Scanner;

public class MyHashtableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_1 : 201632023 이지훈");
		Scanner scan = new Scanner(System.in);
		System.out.print("해시테이블 크기 입력 : ");
		int size = scan.nextInt();
		
		MyHashtable studentTable = new MyHashtable(size);
		int menu = 0;
		do {
			System.out.print("\n1:삽입  2:검색  3:삭제  4:테이블출력  5:종료 ---> ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("삽입할 학번(정수값)을 입력하세요 : ");
				int id = scan.nextInt();
				if(studentTable.put(id))
					System.out.println(id+ " 삽입 성공");
				else
					System.out.println(id+ " 삽입 실패");
				break;
			
			case 2:
				System.out.print("검색할 학번(정수값)을 입력하세요 : ");
				id = scan.nextInt();
				if(studentTable.contains(id))
					System.out.println(id+ " 학생을 찾았습니다.");
				else
					System.out.println(id+ " 학생을 찾을 수 없습니다.");
				break;
			
			case 3:
				System.out.print("삭제할 학번(정수값)을 입력하세요 : ");
				id = scan.nextInt();
				if(studentTable.remove(id))
					System.out.println(id+ " 삭제 성공");
				else
					System.out.println(id+ " 삭제 실패");
				break;
				
			case 4:
				studentTable.print();
				break;
			
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			
			default:
				System.out.println("메뉴 번호가 잘못되었습니다. 다시 입력하세요.");
			}
			
		}while(menu != 5); // do while문과 switch문을 이용해 사용자가 5를 입력할때까지 반복
		scan.close();
	}

}
