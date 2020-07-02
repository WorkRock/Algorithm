//***************************
// 파일명: DirectedGraph
// 작성자: 201632023 이지훈
// 작성일: 20.06.11.
// 프로그램 설명: 인접리스트를 이용한 방향 그래프 구현을 이해한다.
//***************************
package hw10_1;


public class DirectedGraph {
	private Node[] list;
	private int n;
	
	private class Node{ // 리스트의 노드 구조를 정의한 클래스
		int vertex;
		Node link;
	}
	
	public DirectedGraph(int n) { // 정점 수가 n인 그래프를 생성
		list = new Node[n];
		this.n = n;
	}
	
	public void addEdge(int v1, int v2) { // 간선 v1, v2를 삽입
		if(v1 > (n-1) || v2 > (n-1) || v1 < 0 || v2 < 0) { // 정점이 범위를 벗어날때
			System.out.println("간선 삽입 오류 - 잘못된 정점 번호입니다. <" + v1 + ", "+ v2 + ">");
			return; // 알맞은 안내문과 함께 메소드 종료
		}
		
		Node newNode = new Node(); // 정점이 범위안에 있을 때
		newNode.vertex = v2; // newNode에 삽입할 값을 넣어주고
		
		newNode.link = list[v1]; // newNode를 연결해줌
		list[v1] = newNode;	
	}
	
	public void printAdjacencyList() { // 구현을 확인하기 위해 인접 리스트를 모두 출력
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.print("간선 " + i + "에 인접한 정점 = ");
			Node newNode = list[i];
			while(newNode != null) { // 연결이 끝날때 까지 계속 반복
				System.out.print(newNode.vertex + " ");
				newNode = newNode.link; // 다음 링크로 이동한다.
			}
		}
	}
}
