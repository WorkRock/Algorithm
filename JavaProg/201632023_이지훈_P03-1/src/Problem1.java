
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]A = {{1,0,2}, {-1,3,1}};
		int[][]B = {{3,1}, {2,1}, {1,0}};
		int[][]AB = new int[2][2];
		int sum;
		
		for(int i = 0; i < 2; i++) { // ����� �� ����
			for(int j = 0; j < 2; j++) {
				sum = 0;
				for(int k = 0; k < 3; k++) {
					sum += A[i][k]*B[k][j];
				}
				AB[i][j]=sum;
			}
		}
		
		for(int i = 0; i < 2; i++) { // ������ �ȳ����� �Բ� ���
			for(int j = 0; j < 2; j++) {
				System.out.print(AB[i][j] + " ");
			}
			System.out.println();
		}
	}

}
