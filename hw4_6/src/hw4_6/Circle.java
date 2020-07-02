package hw4_6;
//***************************
// ���ϸ�: Circle
// �ۼ���:  201632023 ������
// �ۼ���: 2020.04.17.
// ����: ���� ������ ���ϱ� �� Ŭ����
//***************************


public class Circle implements Figure { // �������̽� ����
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
	public String toString() { // ��½� ����ϴ� toString
		return "�� ������ =" + radius + " ���� = " +getArea();
	}

	@Override
	public double getArea() { // �������� �����ϴ� getArea
		return radius * radius * 3.14;
	}
}
