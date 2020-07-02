//***************************
// 파일명: hw4_4
// 작성자: 201632023 이지훈	
// 작성일: 2020.04.12.
// 내용: 정렬 알고리즘 구현을 준비하기 위해 인터페이스와 클래스 정의를 복습 - 원과 삼각형의 갯수 입력 및 면적 계산
//***************************
package hw4_4;

public class Triangle implements Figure { // Figure 인터페이스 구현

	private double base; // field 밑변, 높이
	private double height;
	
	@Override
	public double getArea() {  // Figure 인터페이스 상속
		double area = this.base * this.height / 2;
		return area; // 면적을 구하고 리턴하는 방식
	}
	
	@Override
	public String toString() { // 출력할 적절한 안내문
		return "삼각형 밑변 =" + this.base + " 높이 =" + this.height + " 면적 =" + String.format("%.3f", getArea());
	}
	
	public void setBase(double base) { // 사용자에게 밑변을 입력받는 setBase
		this.base = base;
	}
	
	public void setHeight(double height) { // 사용자에게 높이를 입력받는 setHeight
		this.height = height;
	}
	
	public double getBase() { // 저장된 밑변값을 출력하는 getBase
		return base;
	}

	public double getHeight() { // 저장된 높이값을 출력하는 getHeight
		return height;
	}

	

	
}
