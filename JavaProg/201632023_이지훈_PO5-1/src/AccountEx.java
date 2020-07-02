import java.util.Scanner;

public class AccountEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Account[] a1 = new Account[3];
		String name;
		int money;
		for(int i = 0; i < 3; i++) {
			System.out.println("이름과 금액을 입력해 주세요");
			System.out.print("이름 : ");
			name = scan.next();
			System.out.print("입금 : ");
			money = scan.nextInt();
			a1[i] = new Account(name,money);
			System.out.println(a1[i].getName() + " 고객님의 계좌가 개설되었습니다.");
			System.out.println(a1[i].getName() + " 고객님의 잔액 : " + a1[i].getBalance() +"원\n");
		}
		int s;
		int x;
		while(true) { // 무한루프문
			System.out.println("어떤분의 계좌에서 업무를 진행하시겠습니까?");
			for(int i = 0; i < a1.length; i++)
				System.out.print(i+1 + "번." + a1[i].getName() + " 고객님  ");
			x = scan.nextInt();
			System.out.println("이 후 수행하실 업무의 번호를 입력하십시오.");
			System.out.println("1.입금  2.출금  3.기부  4.계좌 조회  0.프로그램 종료"); // 알맞은 번호에 따라서 임무 수행
			s = scan.nextInt();
			x-= 1;
			switch(s) { // switch문을 이용해 사용자가 원하는 임무를 수행
				case 1:
					System.out.println("계좌 입금을 수행합니다");
					System.out.print("입금하실 금액을 입력하십시오 : ");
					money = scan.nextInt();
					a1[x].deposit(money);;
					System.out.println(a1[x].getName() + " 고객님의 계좌로 " + money +"원이 입금되었습니다.");
					break;
				case 2:
					System.out.println("계좌 출금을 수행합니다");
					System.out.print("출금하실 금액을 입력하십시오 : ");
					money = scan.nextInt();
					if(a1[x].withdraw(money) == true)
						System.out.println(a1[x].getName() + " 고객님의 계좌에서 " + money +"원이 출금되었습니다.");
					else
						System.out.println(a1[x].getName() + " 고객님의 잔액이 부족하여 출금할 수 없습니다");
					break;
				case 3:
					System.out.println("기부를 수행합니다");
					System.out.print("기부하실 금액을 입력하십시오 : ");
					money = scan.nextInt();
					if(a1[x].withdraw(money) == true) {
						System.out.println(a1[x].getName() + " 고객님의 계좌에서 " + money +"원이 기부되었습니다.");
						System.out.println("총 기부액 : " + a1[x].totalDonate(money));
						}
					else
						System.out.println(a1[x].getName() + " 고객님의 잔액이 부족하여 출금할 수 없습니다");
					continue;
				case 4:
					System.out.println("계좌 조회를 수행합니다");
					System.out.println(a1[x].getName()+" 고객님의 잔액 : "+a1[x].showInfo());
					break;
				case 0:
					System.out.println("프로그램 종료 및 계좌 상태");
					for(int i = 0; i < a1.length; i++)
						System.out.println(a1[i].getName()+" 고객님의 잔액 : "+a1[i].showInfo());
					System.exit(0);
				
			}
		}
	}

}
