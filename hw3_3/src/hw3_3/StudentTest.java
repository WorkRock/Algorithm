//***************************
// ���ϸ�: hw3_3
// �ۼ���: 201632023 ������	
// �ۼ���: 2020.04.08.
// ����: ���� ���� �˰����� �̿��� �̸��� �������� ����
//***************************
package hw3_3;

import java.util.Scanner;

public class StudentTest {
	private static int N;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner�� ����ϱ� ���� ����
		System.out.println("hw3_3 : 201632023 ������");
		System.out.print("�л� �� �Է� : ");
		N = scan.nextInt(); // �������� N�� �л� ���� �Է� ����
		StudentInfo[]student = new StudentInfo[N]; // StudentInfo��ü �迭 ����
		
		System.out.println("\n" + N + "���� �л� ������ �Է��ϼ���: ");
		for(int i = 0; i < N; i++) { // �ݺ����� �̿��� �� ��ü���� ���� �Է�
			student[i] = new StudentInfo();
			student[i].setName(scan.next());
			student[i].setId(scan.nextInt());
			student[i].setScore(scan.nextFloat());
		}
		sortStudent(student); // sortStudent �޼ҵ带 �ҷ��� ������ ������������ ����
		System.out.println("\n���� �������� ���� ��� = ");
		for(int i = 0; i < N ; i++)
			System.out.printf(student[i].getName() + " " + student[i].getId() + " " +"%.1f" + "\n", student[i].getScore());
		
	}
	
	
	private static void sortStudent(StudentInfo[] student) { // StudentInfoŸ���� �迭�� �޴� sortStudent �޼ҵ�
		StudentInfo temp; // �ٲܰ��� ������ StudentInfo�� ���� temp
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N-i-1; j++) {
				if(student[j].getScore() < student[j+1].getScore()) { // BubbleSort �˰����� �̿��� ����
					temp = student[j];
					student[j] = student[j+1];
					student[j+1] = temp;
				}
			}
		}		
	}
	
}
