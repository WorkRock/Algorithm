//***************************
// ���ϸ�: Triangle
// �ۼ���:  201632023 ������
// �ۼ���: 2020.04.15.
// ����: ���� ������ ���ϱ� �ﰢ�� Ŭ����
//***************************
package hw4_5;

public class Triangle implements Figure { // �������̽� ����

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
	public String toString() { // ��½� ����ϴ� toString
		return "�ﰢ�� �غ� =" + this.width + " ���� =" + this.height + " ���� =" + String.format("%.3f", getArea());
	}

	@Override
	public double getArea() { // �������� �����ϴ� getArea
		return width * height / 2.0;
	}

}
