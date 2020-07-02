//***************************
// 파일명: MyBinarySearchTree
// 작성자: 201632023 이지훈
// 작성일: 20.05.01.
// 내용: 이진탐색트리 구현
//***************************
package hw6_1;

public class MyBinarySearchTree {
	private Node root; // 트리의 루트
	private int idNum; // 저장된 아이디 수
	
	public void print() { // 중순위 순회를 이용한 출력
		inOrder(root);
	}
	
	public int size() { // 트리에 저장된 아이디 수 리턴
		return idNum;
	}
	
	public boolean contain(String id) { // 트리에 아이디가 존재하는지 여부 조사
		Node current = root;
		while(current != null) {
			if(current.getData().equals(id)) // 같은값이 있으면 true 리턴
				return true;
			else if(current.getData().compareTo(id) > 0)
				current = current.getLeft(); // id와 비교했을때 루트값의 데이터가 큰경우 왼쪽으로 이동
			else
				current = current.getRight(); // 반대는 오른쪽
		}
		return false; // 없으면 false
	}
	
	public boolean add(String id) { // 트리에 아이디(노드)를 삽입. 이미 존재하는 아이디면 삽입 실패
		Node n1 = new Node(id); 
		if(root == null) { // root값이 null값인 경우 (비어있는 경우)
			root = n1;
			return true; 
		}
		Node current = root;
		Node parent = null;
		while(true) {
			if(id.equals(current.getData()))
				return false; // 만약 같은값이 있다면 false를 리턴해준다
			else {
				parent = current;
				if(id.compareTo(current.getData()) < 0) { // id보다 current의 데이터값이 큰경우 
					current = current.getLeft(); // 왼쪽으로 이동
					if(current == null) { // current의 데이터값이 비어있는 경우 입력받은 데이터 값이 들어있는 새로운 노드를 삽입해줌
						parent.setLeft(n1);
						idNum++;
						return true;
					}
				}
				else { // id보다 current의 데이터값이 작은 경우 
					current = current.getRight(); // 오른쪽으로 이동
					if(current == null) { // current의 데이터값이 비어있는 경우 입력받은 데이터 값이 들어있는 새로운 노드를 삽입해줌
						parent.setRight(n1);
						idNum++;
						return true;
					}
				}
			}
		}
	}
	
	public boolean remove(String id) {
		Node current = root;
		Node parent = root;
		while (current != null && current.getData().equals(id) != true) { // 삭제할 노드를 찾을 때 까지 무한 반복
			parent = current;
			if (current.getData().compareTo(id) > 0) { // 데이터값이 id보다 큰 값일 경우
				current = current.getLeft(); // id는 데이터값보다 작으므로 더 작은값이 저장된 왼쪽으로 이동
			} else {
				current = current.getRight(); // 반대의 이유로 오른쪽으로 이동
			}
		}
		if (current == null) { // 삭제할 노드가 존재하지 않을때
			return false;
		}
		else {
			if (current == root && current.getLeft() == null) { // 삭제할 노드가 루트이고 루트노드가 왼쪽 자식을 가지지 않는 경우
				root = root.getRight(); // 왼쪽은 비어있으므로 오른쪽 주소로 root를 변경해줌
			} 

			else if (current != root && current.getLeft() == null) { // 삭제할 노드가 루트가 아니고  왼쪽 자식을 가지지 않는 경우
				if (current == parent.getLeft()) { // 부모 노드의 왼쪽에 위치할 때
					parent.setLeft(current.getRight());
				} else { // 반대의 경우
					parent.setRight(current.getRight());
				}
			} 

			else { // 양쪽으로 자식이 있는 경우
				Node rightMostNode = current;
				while (rightMostNode.getRight() != null) { // 가장 오른쪽으로 이동
					rightMostNode = rightMostNode.getRight();
				}	
				current.setData(rightMostNode.getData()); // 삭제할 노드의 데이터 값을 가장 오른쪽의 데이터 값으로 바꿔줌
				rightMostNode = null;
			}
		}
		return true;
	}
	
	private void inOrder(Node root) { // 중순위 순회
		if(root != null) {
			inOrder(root.getLeft()); // 재귀해서 왼쪽을 불러줌 - 가장 왼쪽으로 이동
			System.out.println(" " + root.getData()); // 그 후 차례대로 중앙값 까지 뽑아줌
			inOrder(root.getRight()); // 그 후에 오른쪽값 차례대로 뽑아줌
		}
		else
			return;
	}
	
	// 트리의 노드 구조
	private class Node{
		private String data; // 데이터값
		private Node left; // 왼쪽자식링크
		private Node right; // 오른쪽자식링크
		
		// 아래에는 노드 사용시 필요 메소드들 선언
		public Node(String data) {
			this.setData(data);
			setLeft(null);
			setRight(null);
		}
		
		public String getData() {
			return data;
		}
		
		public void setData(String data) {
			this.data = data;
		}
		
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
	}
}
