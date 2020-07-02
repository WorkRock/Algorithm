//***************************
// ���ϸ�: hw4_4
// �ۼ���: 201632023 ������	
// �ۼ���: 2020.04.12.
// ����: ���� �˰��� ������ �غ��ϱ� ���� �������̽��� Ŭ���� ���Ǹ� ���� - ���� �ﰢ���� ���� �Է� �� ���� ���
//***************************
package hw4_4;

public class Triangle implements Figure { // Figure �������̽� ����

	private double base; // field �غ�, ����
	private double height;
	
	@Override
	public double getArea() {  // Figure �������̽� ���
		double area = this.base * this.height / 2;
		return area; // ������ ���ϰ� �����ϴ� ���
	}
	
	@Override
	public String toString() { // ����� ������ �ȳ���
		return "�ﰢ�� �غ� =" + this.base + " ���� =" + this.height + " ���� =" + String.format("%.3f", getArea());
	}
	
	public void setBase(double base) { // ����ڿ��� �غ��� �Է¹޴� setBase
		this.base = base;
	}
	
	public void setHeight(double height) { // ����ڿ��� ���̸� �Է¹޴� setHeight
		this.height = height;
	}
	
	public double getBase() { // ����� �غ����� ����ϴ� getBase
		return base;
	}

	public double getHeight() { // ����� ���̰��� ����ϴ� getHeight
		return height;
	}

	

	
}
