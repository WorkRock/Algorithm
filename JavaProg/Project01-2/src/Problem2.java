import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b, c;
		System.out.print("���� �� �� �Է� : ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		int mid;
		
		if(a > b) {
			if(b > c)
				mid = b;
			else if(a < c)
				mid = a;
			else
				mid = c;
		}
		else {
			if(a > c)
				mid = a;
			else if(b < c)
				mid = b;
			else
				mid = c;
		}
		System.out.println("�߰��� : " + mid);
	}

}
