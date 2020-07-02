//***************************
// 파일명: MyHashtable
// 작성자: 201632023 이지훈
// 작성일: 20.05.13.
// 내용: 해쉬테이블 구현과 연산 - chaining, 성적 추가
//***************************
package hw7_2;

public class MyHashtable {
	private Node[] table; // Node형 배열 table
	private int m; // 크기를 저장해줄 m
	
	public MyHashtable(int size){ // 생성자
		table = new Node[size];
		m = size;
		for (int i = 0; i < size; i++)
            table[i] = null;
	}
	
	public boolean put(int id, int score) { // 삽입. 학번과 성적을 매개변수로 받음
		int index = id % m; // 해쉬함수 연산
		if(index > m-1)
			index -= m;
		Node newNode = new Node(id, score);
		if(table[index] == null) { // 비어있는 상태면 그대로 연결해줌
			table[index] = newNode;
			return true;
		}
		else {
			Node temp = table[index];
			if(search(id) >= 0) { // 학번이 존재할시
				while(temp.right != null && temp.data != id)
					temp = temp.right; // 학번위치로 이동
				if(temp.getData() == id) {
					temp.setScore(score); // 성적값 변경해줌
					return true;
				}
			}
			// 존재하지 않으면 가장 앞쪽에 삽입해줌
			newNode.right = temp;
			table[index] = newNode;
			return true;
		}
	}
	
	public int get(int id) { // 찾는 학번의 성적값을 반환해주는 get 메소드.
		int index = id % m;
		if(table[index] == null) // 비어있으면 -1 리턴
			return -1;
		else {
			Node temp = table[index];
			 while (temp != null && temp.getData() != id) // temp가 null이 아니며 data값이 id와 같지 않을 때 
	                temp = temp.right; // 계속 우측으로 이동
	            if (temp == null) // null이면 없는것이니 -1리턴
	                return -1;
	            else
	                return temp.score; // 있으면 점수 리턴
		}
			
	}
	
	private int search(int id) { // 탐색. 학번을 매개변수로 받음
		Node newNode = new Node(id);
		int index = id % m;
		if(table[index] == null)
			return -1;
		else {
			Node temp = table[index];
			while(temp.data != newNode.data) { // 찾으려는 학번값과 같아질때까지 계속 오른쪽으로 이동
				if(temp.right != null)
					temp = temp.right;
				else
					return -1; // 없으면 -1 리턴
			}
			return index; // 찾으려는 값이 존재하면 그 값의 인덱스 리턴
		}
	}
	
	public boolean contains(int id) { // search를 이용해 포함하고 있는지를 boolean형으로 리턴
		int index = search(id);
		return (index >= 0);
	}
	
	public boolean remove(int id) { // 제거. 학번을 매개변수로 받음
		int index = id % m;
		Node newNode = table[index];
		Node temp = table[index].right; // 다다음값을 저장함
		
		if(id == newNode.getData()) { // 처음값과 같을시
			table[index] = newNode.right; // newNode의 다음값을 가리키도록 한 후
			newNode.right = null; // newNode의 연결은 끊어준다
			return true;
		}
		else { 
			while(temp != null) { // temp가 null값이 될때까지 반복
				if(id == temp.getData()) {
					if(temp.right == null) { // temp가 마지막값인 경우
						newNode.right = null;
						return true;
						}
					else { // 마지막값이 아닌 경우
						newNode.right = temp.right;
						temp.right = null;
						return true;
					}
				}
				else { // 데이터가 일치하지 않을 경우 한칸씩 전진
					newNode = temp;
					temp = temp.right;
				}
			}
			return false;
		}
	}
	
	public void print() { // 적절한 안내문과 함께 출력
		System.out.println("해시테이블 내용");
		for(int i = 0; i < m; i++) {
			if(table[i] == null)
				System.out.println("[" + i + "]");
			else {
				System.out.print("[" + i + "] ");
				Node newNode = table[i];
				while(newNode != null) {
					System.out.print("학번 : " + newNode.getData()+" , 성적 : " + newNode.getScore() + " | ");
					newNode = newNode.right;
				}
				System.out.println();
			}
		}
	}
	
	private class Node{
		private int data; // 데이터값
		private int score; // 성적을 저장해줄 score값
		private Node right; // 오른쪽자식링크
		
		// 아래에는 노드 사용시 필요 메소드들 선언
		public Node(int data) {
			this.setData(data);
			this.setScore(0);
			setRight(null);
		}
		
		public Node(int data, int score) {
			this.setData(data);
			this.setScore(score);
			setRight(null);
		}
		
		public int getData() {
			return data;
		}
		
		public void setData(int data) {
			this.data = data;
		}
		
		public void setRight(Node right) {
			this.right = right;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}
	}
}