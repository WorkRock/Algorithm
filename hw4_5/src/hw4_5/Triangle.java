//***************************
// 파일명: Triangle
// 작성자:  201632023 이지훈
// 작성일: 2020.04.15.
// 내용: 원과 반지름 구하기 삼각형 클래스
//***************************
package hw4_5;

public class Triangle implements Figure { // 인터페이스 구현

	private double width, height;

	public Triangle() {
	}

	public double getWidth() { // getter & setter
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() { // 출력시 사용하는 toString
		return "삼각형 밑변 =" + this.width + " 높이 =" + this.height + " 면적 =" + String.format("%.3f", getArea());
	}

	@Override
	public double getArea() { // 면적값을 리턴하는 getArea
		return width * height / 2.0;
	}

}
