//***************************
// ���ϸ�: hw4_4
// �ۼ���: 201632023 ������	
// �ۼ���: 2020.04.12.
// ����: ���� �˰��� ������ �غ��ϱ� ���� �������̽��� Ŭ���� ���Ǹ� ���� - ���� �ﰢ���� ���� �Է� �� ���� ���
//***************************
package hw4_4;

public class Circle implements Figure{ // Figure �������̽� ����
	private double radius; // field ������
	
	@Override
	public double getArea() { // Figure �������̽� ���
		// TODO Auto-generated method stub
		double area = this.radius * this.radius * 3.14;
		return area; // ������ ���ϰ� �����ϴ� ���
	}
	
	@Override
	public String toString() { // ����� ������ �ȳ���
		return "�������� =" + this.radius + " ���� =" + getArea();
	}

	public void setRadius(double radius) { //  ����ڿ��� �������� �Է¹޴� setRadius
		this.radius = radius;
	}
	
	public double getRadius() { // ����� ���������� ����ϴ� getRadius
		return radius;
	}
	
}
