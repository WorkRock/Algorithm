//***************************
// 파일명: DirectedGraphTest
// 작성자: 201632023 이지훈
// 작성일: 20.06.11.
// 프로그램 설명: 인접리스트를 이용한 방향 그래프 구현을 이해한다.
//***************************
package hw10_1;

import java.util.Scanner;

public class DirectedGraphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw10_1 : 201632023 이지훈");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정점 수 입력 : "); // 알맞은 안내문과 함께 정점수를 입력 받음
		int n = scan.nextInt();
		DirectedGraph graph = new DirectedGraph(n); // 정점 수가 n인 방향 그래프 G=(V, E)를 생성(graph)
		
		System.out.print("간선 수 입력 : ");
		int e = scan.nextInt();
		
		System.out.println("\n" + e + "개의 간선 입력(각 간선은 정점 번호 2개를 whitespace로 구분하여 입력): ");
		for(int i = 0; i < e; i++) {
			System.out.print("간선" + i +" 입력 : ");
			int v1 = scan.nextInt();
			int v2 = scan.nextInt(); // 사용자에게 연결할 정점 두개 입력받음
			graph.addEdge(v1, v2); // 그 후 연결
		}
		graph.printAdjacencyList(); // 그래프의 모든 정점의 인접 리스트를 모두 출력
	}

}
