package hw4_6;
//***************************
// 파일명: Circle
// 작성자:  201632023 이지훈
// 작성일: 2020.04.17.
// 내용: 원과 반지름 구하기 원 클래스
//***************************


public class Circle implements Figure { // 인터페이스 구현
	private double radius;

	public Circle() {
	}

	public double getRadius() { // getter & setter
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() { // 출력시 사용하는 toString
		return "원 반지름 =" + radius + " 면적 = " +getArea();
	}

	@Override
	public double getArea() { // 면적값을 리턴하는 getArea
		return radius * radius * 3.14;
	}
}
