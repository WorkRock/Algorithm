import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("초를 입력하세요 : ");
		int a = scan.nextInt();
		int x = a % 3600;
		int hour = a / 3600;
		int minute = x / 60;
		int second = x % 60;
		
		
		System.out.println(a + "초: " + hour + "시간 " +  minute + "분 " + second + "초");
	}

}
