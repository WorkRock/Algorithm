//***************************
// 파일명: hw3_1
// 작성자: 201632023 이지훈	
// 작성일: 2020.03.04.
// 내용: 학생 성정 입력을 이용한 클래스 정의와 객체 배열 사용 복습
//***************************
package hw3_1;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner를 사용하기 위한 선언
		System.out.println("hw3_1 : 201632023 이지훈");
		System.out.print("학생 수 입력 : ");
		int n = scan.nextInt(); // 정수 n에 학생 수를 입력 받음
		StudentInfo[]student = new StudentInfo[n]; // StudentInfo객체 배열 선언
		
		for(int i = 0; i < n; i++) { // 반복문을 이용해 각 객체마다 정보 입력
			student[i] = new StudentInfo();
			student[i].setName(scan.next());
			student[i].setId(scan.nextInt());
			student[i].setScore(scan.nextFloat());
		}
		
		float average = averScore(student); // averScore를 불러와서 평균값 계산
		System.out.printf("성적 평균 : %.2f\n",average);
		int bestStudentCode = bestStudent(student); // bestStudent를 불러와서 가장 성적이 높은 학생이 있는 배열의 위치값 저장
		System.out.println("수석 학생 성명 : " + student[bestStudentCode].getName());
	}
	
	private static float averScore(StudentInfo[] arr) { // 평균값을 계산하는 메소드
		float average = 0;
		for(int i = 0; i < arr.length; i++) {
			average += arr[i].getScore(); // getScore를 이용해 average에 모든 객체의 점수값을 더해줌
		}
		return average/arr.length; // 그 후 리턴시에 길이만큼 나눈값을 리턴함
	}
	
	private static int bestStudent(StudentInfo[] arr) { // 수석 학생을 찾아내는 메소드
		int x = 0; // 모든 배열은 0부터 시작이므로 0을 저장
		for(int i = 1; i < arr.length; i++) { // x가  0이므로 1부터 시작해도 무관하다고 판단
			if(arr[x].getScore() < arr[i].getScore()) // arr[x]가 arr[i]보다 크면 변동이 없음. 같은값이 나오면 결국에 맨 처음 나온 같은값이 저장되게됨
				x = i;
			else
				continue;
		}
		return x; // 그 후 x 리턴
	}
}
class StudentInfo{ // 학생 정보를 저장할 클래스 정의
	private String name; // 이름을 저장할 String형 변수
	private int id; // 학생의 학번을 저장할 int형 변수
	private float score; // 학생의 점수를 저장할 float형 변수
	
	public void setName(String name) { // 이름을 대입해줄 setName 함수
		this.name = name; // 이 객체의 이름이 매개변수 name으로 대체되는 서식
	}
	
	public void setId(int id) { // 학번을 대입해줄 setName 함수
		this.id = id; // 이 객체의 학번이 매개변수 id로 대체되는 서식
	}
	
	public void setScore(float score) { // 성적을 대입해줄 setName 함수
		this.score = score; // 이 객체의 성적이 매개변수 score로 대체되는 서식
	}
	
	public String getName() { // 현재 저장되어 있는 이름을 반환하는 함수
		return this.name;
	}
	
	/* 현재는 사용하지 않아서 제외해 두었으나 만들기만 했음. 일단은 주석처리.
	public int getId() {
		return this.id;
	}
	*/
	
	public float getScore() { // 현재 저장되어 있는 성적을 반환하는 함수
		return this.score;
	}
}

