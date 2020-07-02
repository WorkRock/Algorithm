//***************************
// 파일명: MyHashtable
// 작성자: 201632023 이지훈
// 작성일: 20.05.13.
// 내용: 해쉬테이블 구현과 연산
//***************************
package hw7_1;

public class MyHashtable {
	private int[] table; // 값을 저장할 정수형 배열
	private int m; // 테이블의 크기
	private static final int EMPTY = -1; // 비어있는 값을 저장하는 EMPTY
	private static final int DELETED = -2; // 삭제된 값을 저장하는 DELETED
	
	public MyHashtable(int size){ // 생성자
		table = new int[size];
		m = size;
		for(int i = 0; i < size; i++) { // -1을 배열에 다 넣어줌으로써 전부다 비어있는 상태로 만듬
			table[i] = EMPTY;
		}
	}
	
	public boolean put(int id) { // 삽입. 학번을 매개변수로 받음
		int i = 0;
		while(i != m) { // 하나씩 증가하는 i가 테이블 크기만큼 돌면 종료 - 값을 넣을 수 없는 상태
			int index = (id % m) + i;
			if(index > m-1)
				index -= m; // 해쉬함수가 테이블의 마지막 인덱스보다 커지면 크기만큼 빼줌
			if(table[index] == EMPTY || table[index] == DELETED) { // 비어있거나 삭제된 상태일시
				table[index] = id; // 값을 넣어줌
				return true;
			}
			else {
				if(search(id) >= 0) // 이미 값이 존재할시 false
					return false;
				else
					i++; // 해쉬함수 인덱스 위치에 값이 이미 있을시 한칸 옮겨줌
				
			}
		}
		return false; // 오버플로우상태
	}
	
	private int search(int id) { // 탐색. 학번을 매개변수로 받음
		int i = 0;
		while(i != m) {
			int index = (id % m) + i;
			if(index > m-1)
				index -= m;
			if(table[index] == id) // 찾으려는 값이 존재하면 그 값의 인덱스 리턴
				return index;
			else 
				i++;
		}
		return -1; // 없으면 -1 리턴
	}
	
	public boolean contains(int id) { // search를 이용해 포함하고 있는지를 boolean형으로 리턴
		int index = search(id);
		return (index >= 0);
	}
	
	public boolean remove(int id) { // 제거. 학번을 매개변수로 받음
		int i = 0;
		while(i != m) {
			int index = (id % m) + i;
			if(index > m-1)
				index -= m;
			if(table[index] == EMPTY) // 인덱스값을 대입하였는데 비어있는 상태이면 값이 없는것이므로 false
				return false;
			else{ // DELETED이거나 어떠한 값이 저장되어 있는 경우
				if(table[index] == id) { // 같은 값이면 삭제해줌
					table[index] = DELETED;
					return true;
				}
				else // DELETED이거나 다른 값이면 한 칸증가
					i++;
			}
		}
		return false;
	}
	
	public void print() { // 알맞은 안내문과 함께 출력
		System.out.println("해시테이블 내용");
		for(int i = 0; i < m; i++) {
			if(table[i] == EMPTY)
				System.out.println("[" + i + "]");
			else if(table[i] == DELETED)
				System.out.println("[" + i + "] DELETED");
			else
				System.out.println("[" + i + "] " + table[i]);
		}
	}
}
