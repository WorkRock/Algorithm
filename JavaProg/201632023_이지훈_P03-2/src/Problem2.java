import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		
		for(int i = 0; i < 3; i++) { // 사용자에게 입력받음
			System.out.print("점수 입력 : ");
			int n = scan.nextInt();
			arr[i] = n;
		}
		
		for(int i = 0; i < 3; i++) { // 내림차순 정렬
			for(int j = i+1; j < 3; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < 3; i++) { // 적절한 안내문과 함께 출력
			System.out.println(i+1 + "등 : " + arr[i]);
		}
	}

}
