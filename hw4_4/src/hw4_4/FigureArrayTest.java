//***************************
// ���ϸ�: hw4_4
// �ۼ���: 201632023 ������	
// �ۼ���: 2020.04.12.
// ����: ���� �˰��� ������ �غ��ϱ� ���� �������̽��� Ŭ���� ���Ǹ� ���� - ���� �ﰢ���� ���� �Է� �� ���� ���
//***************************
package hw4_4;

import java.util.Scanner;

public class FigureArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // Scanner�� �̿��ϱ� ���� ����
		System.out.println("hw4_4 ; 201632023 ������");
		
		System.out.print("�� ���� �Է� : "); // ������ �ȳ��� ���� ����ڿ��� �� ���� �Է¹ޱ�
		int n1 = scan.nextInt();
		System.out.print("�ﰢ�� ���� �Է� : "); // ������ �ȳ��� ���� ����ڿ��� �ﰢ�� ���� �Է¹ޱ�
		int n2 = scan.nextInt();
		int count = n1 + n2; // ���� �ﰢ���� ��ģ ������ ������ ���� count
		
		Figure[] figureArray = new Figure[count]; // �������̽��� ������ �迭 figureArray����
		
		System.out.println(n1 + "���� �� ����(������)�� �Է��ϼ��� : ");
		for(int i = 0; i < n1; i++) { // n1�� ��ŭ CircleŬ�����ε� figureArray�� ������ص� �������� �Է¹���
			figureArray[i] = new Circle();
			((Circle) figureArray[i]).setRadius(scan.nextDouble());
		}
		
		System.out.println(n2 + "���� �ﰢ�� ����(�غ��� ����)�� �Է��ϼ��� : ");
		for(int i = n1; i < count; i++) { // n2�� ��ŭ TriangleŬ�����ε� figureArray�� ������ص� �غ�, ���̸� �Է¹���
			figureArray[i] = new Triangle();
			((Triangle) figureArray[i]).setBase(scan.nextDouble());
			((Triangle) figureArray[i]).setHeight(scan.nextDouble());
		}
		
		System.out.println(count + "���� ���� ������ ���� : ");
		for(int i = 0; i < count; i++) {
			System.out.println((figureArray[i]).toString()); // toString�� �̿��� ���
		}
		
	}

}
