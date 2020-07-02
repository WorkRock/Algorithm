//***************************
// 파일명: hw3_3
// 작성자: 201632023 이지훈	
// 작성일: 2020.04.08.
// 내용: 버블 정렬 알고리즘을 이용한 이름의 오름차순 정렬
//***************************
package hw3_3;

import java.util.Scanner;

public class StudentTest {
	private static int N;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner를 사용하기 위한 선언
		System.out.println("hw3_3 : 201632023 이지훈");
		System.out.print("학생 수 입력 : ");
		N = scan.nextInt(); // 전역변수 N에 학생 수를 입력 받음
		StudentInfo[]student = new StudentInfo[N]; // StudentInfo객체 배열 선언
		
		System.out.println("\n" + N + "명의 학생 정보를 입력하세요: ");
		for(int i = 0; i < N; i++) { // 반복문을 이용해 각 객체마다 정보 입력
			student[i] = new StudentInfo();
			student[i].setName(scan.next());
			student[i].setId(scan.nextInt());
			student[i].setScore(scan.nextFloat());
		}
		sortStudent(student); // sortStudent 메소드를 불러와 성적을 내림차순으로 졍렬
		System.out.println("\n성적 내림차순 정렬 결과 = ");
		for(int i = 0; i < N ; i++)
			System.out.printf(student[i].getName() + " " + student[i].getId() + " " +"%.1f" + "\n", student[i].getScore());
		
	}
	
	
	private static void sortStudent(StudentInfo[] student) { // StudentInfo타입의 배열을 받는 sortStudent 메소드
		StudentInfo temp; // 바꿀값을 저장할 StudentInfo형 변수 temp
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N-i-1; j++) {
				if(student[j].getScore() < student[j+1].getScore()) { // BubbleSort 알고리즘을 이용한 정렬
					temp = student[j];
					student[j] = student[j+1];
					student[j+1] = temp;
				}
			}
		}		
	}
	
}
