//***************************
// 파일명: MyBinarySearchTreeTest
// 작성자: 201632023 이지훈
// 작성일: 20.05.01.
// 내용: 이진탐색트리 구현
//***************************
package hw6_1;

import java.util.Scanner;

public class MyBinarySearchTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw6_1 : 201632023 이지훈");
		
		MyBinarySearchTree tree = new MyBinarySearchTree(); // 객체 생성
		
		Scanner scan = new Scanner(System.in);
		
		int sel;
		while(true) { // 무한반복문
			System.out.println("\n수행하실 업무의 번호를 입력해 주세요. \n1.삽입  2.검색  3.삭제  4.전체조회  5.프로그램 종료");
			sel = scan.nextInt();
			switch(sel) { // 사용자가 입력한 번호에 따라 임무 수행
				case 1:
					System.out.println("삽입을 진행합니다.");
					System.out.print("삽입할 닉네임 입력 : ");
					System.out.println("삽입 결과 : " + tree.add(scan.next()));
					break;
				case 2:
					System.out.println("검색을 진행합니다.");
					System.out.print("검색할 닉네임 입력 : ");
					System.out.println("검색 결과 : " + tree.contain(scan.next()));
					break;
				case 3:
					System.out.println("삭제를 진행합니다.");
					System.out.print("삭제할 닉네임 입력 : ");
					System.out.println("삭제 결과 : " + tree.remove(scan.next()));
					break;
				case 4:
					System.out.println("전체 조회를 진행합니다.");
					tree.print();
					break;
				case 5:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
			}
		}
	}

}
