//***************************
// ���ϸ�: hw3_1
// �ۼ���: 201632023 ������	
// �ۼ���: 2020.03.04.
// ����: �л� ���� �Է��� �̿��� Ŭ���� ���ǿ� ��ü �迭 ��� ����
//***************************
package hw3_1;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner�� ����ϱ� ���� ����
		System.out.println("hw3_1 : 201632023 ������");
		System.out.print("�л� �� �Է� : ");
		int n = scan.nextInt(); // ���� n�� �л� ���� �Է� ����
		StudentInfo[]student = new StudentInfo[n]; // StudentInfo��ü �迭 ����
		
		for(int i = 0; i < n; i++) { // �ݺ����� �̿��� �� ��ü���� ���� �Է�
			student[i] = new StudentInfo();
			student[i].setName(scan.next());
			student[i].setId(scan.nextInt());
			student[i].setScore(scan.nextFloat());
		}
		
		float average = averScore(student); // averScore�� �ҷ��ͼ� ��հ� ���
		System.out.printf("���� ��� : %.2f\n",average);
		int bestStudentCode = bestStudent(student); // bestStudent�� �ҷ��ͼ� ���� ������ ���� �л��� �ִ� �迭�� ��ġ�� ����
		System.out.println("���� �л� ���� : " + student[bestStudentCode].getName());
	}
	
	private static float averScore(StudentInfo[] arr) { // ��հ��� ����ϴ� �޼ҵ�
		float average = 0;
		for(int i = 0; i < arr.length; i++) {
			average += arr[i].getScore(); // getScore�� �̿��� average�� ��� ��ü�� �������� ������
		}
		return average/arr.length; // �� �� ���Ͻÿ� ���̸�ŭ �������� ������
	}
	
	private static int bestStudent(StudentInfo[] arr) { // ���� �л��� ã�Ƴ��� �޼ҵ�
		int x = 0; // ��� �迭�� 0���� �����̹Ƿ� 0�� ����
		for(int i = 1; i < arr.length; i++) { // x��  0�̹Ƿ� 1���� �����ص� �����ϴٰ� �Ǵ�
			if(arr[x].getScore() < arr[i].getScore()) // arr[x]�� arr[i]���� ũ�� ������ ����. �������� ������ �ᱹ�� �� ó�� ���� �������� ����ǰԵ�
				x = i;
			else
				continue;
		}
		return x; // �� �� x ����
	}
}
class StudentInfo{ // �л� ������ ������ Ŭ���� ����
	private String name; // �̸��� ������ String�� ����
	private int id; // �л��� �й��� ������ int�� ����
	private float score; // �л��� ������ ������ float�� ����
	
	public void setName(String name) { // �̸��� �������� setName �Լ�
		this.name = name; // �� ��ü�� �̸��� �Ű����� name���� ��ü�Ǵ� ����
	}
	
	public void setId(int id) { // �й��� �������� setName �Լ�
		this.id = id; // �� ��ü�� �й��� �Ű����� id�� ��ü�Ǵ� ����
	}
	
	public void setScore(float score) { // ������ �������� setName �Լ�
		this.score = score; // �� ��ü�� ������ �Ű����� score�� ��ü�Ǵ� ����
	}
	
	public String getName() { // ���� ����Ǿ� �ִ� �̸��� ��ȯ�ϴ� �Լ�
		return this.name;
	}
	
	/* ����� ������� �ʾƼ� ������ �ξ����� ����⸸ ����. �ϴ��� �ּ�ó��.
	public int getId() {
		return this.id;
	}
	*/
	
	public float getScore() { // ���� ����Ǿ� �ִ� ������ ��ȯ�ϴ� �Լ�
		return this.score;
	}
}

