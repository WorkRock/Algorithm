//***************************
// 파일명: Dynamic_Programming_Test
// 작성자: 201632023 이지훈
// 작성일: 20. 05. 27.
// 내용: 동적 프로그래밍을 이해
//***************************
package hw8_1;

import java.util.Scanner;

public class Dynamic_Programming_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw8_1 : 201632023 이지훈");
		Scanner scan = new Scanner(System.in);
		System.out.print("행의 크기 입력 : ");
		int n = scan.nextInt(); // 사용자에게 행의 크기를 입력받음
		System.out.println(n + " X " + n +" 크기의 행렬 원소 입력 : ");
		int[][] m = new int[n][n];
		int[][] c = new int[n+1][n+1]; // 최대경로값이 저장되는 행렬 c                      
		
		for(int i=0;i<n;i++){ // 사용자에게 행렬의 값을 입력받음
			for(int j=0; j<n; j++){
				m[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("최대 점수: "+matrixPath(n, m, c));
		System.out.print("최대 점수 경로 : ");
		matrixPathRoute(0,0,n,m);

	}

	private static int matrixPath(int n, int[][] m, int[][] c){ // 최대 경로값을 뽑아내는 메소드
		for(int i = 0; i <= n; i++) // c의 0,0~ n,0까지 모두 0으로 채움
			c[i][0] = 0;
		for(int j = 1; j <= n; j++) // c의 0,0~ 0,n까지 모두 0으로 채움
			c[0][j] = 0;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				c[i][j] = m[i-1][j-1] + Math.max(c[i-1][j],c[i][j-1]); // 오른쪽과 아래값중 더 큰것을 더해서 넣어줌
			}
		}
		return c[n][n];
	} 

	private static void matrixPathRoute(int i, int j, int n, int[][] m) { // 행렬의 경로를 뽑아내는 재귀메소드
		System.out.print("(" + (i+1) + ", " + (j+1) + ") ");
		if(i+1 >= n && j+1 >= n) // 만약 i+1, j+1이 둘다 n과 같거나 크면 메소드 종료
			return;

		else if((i+1) >= n && (j+1) < n) // i+1만 n보다 클경우 j만 한칸 늘려서 재귀
			matrixPathRoute(i,(j+1),n,m);

		else if((i+1) < n && (j+1) >= n) // j+1만 n보다 클경우 i만 한칸 늘려서 재귀
			matrixPathRoute((i+1),j,n,m);

		if((i+1) < n && (j+1) < n) { // i+1도 n보다 작고 j+1도 n보다 작은 경우
			int a = Math.max(m[i+1][j], m[i][j+1]); // 오른쪽과 아래의 값중 큰 값을 하나의 변수 a에 저장해줌

			if(a == m[i+1][j]) // 그 후 오른쪽으로 값이 더 크면 오른쪽으로 한칸이동해서 재귀
				matrixPathRoute(i+1,j,n,m);
			else // 아래 값이 크면 아래로 한칸 이동해서 재귀			
				matrixPathRoute(i,j+1,n,m);
		}
	}
}
