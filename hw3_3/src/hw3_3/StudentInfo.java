//***************************
// ���ϸ�: hw3_3
// �ۼ���: 201632023 ������	
// �ۼ���: 2020.04.08.
// ����: ���� ���� �˰����� �̿��� �̸��� �������� ����
//***************************
package hw3_3;

public class StudentInfo {
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
	
	
	public int getId() { // ���� ����Ǿ� �ִ� �й��� ��ȯ�ϴ� �Լ�
		return this.id;
	}
	
	
	public float getScore() { // ���� ����Ǿ� �ִ� ������ ��ȯ�ϴ� �Լ�
		return this.score;
	}
}
