//***************************
// 파일명: hw4_4
// 작성자: 201632023 이지훈	
// 작성일: 2020.04.12.
// 내용: 정렬 알고리즘 구현을 준비하기 위해 인터페이스와 클래스 정의를 복습 - 원과 삼각형의 갯수 입력 및 면적 계산
//***************************
package hw4_4;

public class Circle implements Figure{ // Figure 인터페이스 구현
	private double radius; // field 반지름
	
	@Override
	public double getArea() { // Figure 인터페이스 상속
		// TODO Auto-generated method stub
		double area = this.radius * this.radius * 3.14;
		return area; // 면적을 구하고 리턴하는 방식
	}
	
	@Override
	public String toString() { // 출력할 적절한 안내문
		return "원반지름 =" + this.radius + " 면적 =" + getArea();
	}

	public void setRadius(double radius) { //  사용자에게 반지름을 입력받는 setRadius
		this.radius = radius;
	}
	
	public double getRadius() { // 저장된 반지름값을 출력하는 getRadius
		return radius;
	}
	
}
