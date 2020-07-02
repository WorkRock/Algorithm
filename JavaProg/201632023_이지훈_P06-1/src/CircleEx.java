
class Circle { // 부모 클래스 Circle
	private int radius;
	
	public Circle(int radius) { // 생성자
		this.radius = radius;
	}
	
	public void showCircle(){ // 출력을 위한 메소드
		System.out.print("반지름이 " + radius + "인 ");
	}
}

class ColoredCircle extends Circle{ // 자식 클래스 ColoredCircle
	private String color;
	public ColoredCircle(int radius, String color) { // 생성자 - 부모클래스 상속
		super(radius);
		this.color = color;
	}
	
	public void showColoredCircle() { // 출력을 위한 메소드
		showCircle();
		System.out.print(color + " 원이다.");
	}
}

public class CircleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a = new Circle(5); // Circle클래스 객체 생성
		ColoredCircle b = new ColoredCircle(10, "빨간색"); // ColoredCircle객체 생성
		
		a.showCircle();
		System.out.print("원이다.\n");
		b.showCircle(); // 자식 클래스에서 부모 클래스의 메소드를 불러올 수 있다.
		System.out.print("원이다.\n");
		b.showColoredCircle();
	}

}
