//***************************
// 파일명: hw3_3
// 작성자: 201632023 이지훈	
// 작성일: 2020.04.08.
// 내용: 버블 정렬 알고리즘을 이용한 이름의 오름차순 정렬
//***************************
package hw3_3;

public class StudentInfo {
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
	
	
	public int getId() { // 현재 저장되어 있는 학번을 반환하는 함수
		return this.id;
	}
	
	
	public float getScore() { // 현재 저장되어 있는 성적을 반환하는 함수
		return this.score;
	}
}
