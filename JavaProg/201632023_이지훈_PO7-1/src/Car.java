interface Vehicle{ // 인터페이스 Vehicle
		abstract void accelPedal();
		abstract void breakPedal();
	}

public abstract class Car implements Vehicle {
	
	String name;
	int speed;
	
	@Override
	public void accelPedal() { // 속도를 올릴때 사용하는 메소드
		System.out.println(getClass().getName() + " " + name + "의 속도를 올립니다.");
		speedUp();
	}

	@Override
	public void breakPedal() { // 속도를 줄일때 사용하는 메소드
		System.out.println(getClass().getName() + " " + name + "의 속도를 내립니다.");
		speedDn();
	}	
	
	public Car() {
		this.name = "성공회자동차";
	}
	
	public Car(String name){ // 이름만 입력받았을 때의 생성자
		this.name = name;
	}
	
	public Car(String name, int speed){ // 이름과 속도를 입력받았을때의 생성자
		this.name = name;
		this.speed = speed;
	}
	
	public void showSpeed() { // getClass().getName()을 이용해 클래스 이름을 출력하고 저장된 이름과 속도를 출력하는 출력문
		System.out.println(getClass().getName() + " " + name + "의 속도는 " + speed +"입니다.");
	}
	
	abstract public void speedUp();
	
	abstract public void speedDn();
	
}

class Sedan extends Car{ // Car 클래스를 상속받음
	
	public Sedan() {
		super("성공회자동차");
	}
	
	public Sedan(String name, int speed) {
		super(name, speed);
	}
	
	public Sedan(String name) {
		super(name);
	}

	@Override
	public void speedUp() { // car클래스의 추상메소드 스피드업. 세단에서는 10증가. 10감소.
		speed += 10;
	}

	@Override
	public void speedDn() {
		speed -= 10;
	}
	
}

class Truck extends Car{

	public Truck() {
		super("성공회자동차");
	}
	
	public Truck(String name, int speed) {
		super(name, speed);
	}
	
	public Truck(String name) {
		super(name);
	}

	@Override
	public void speedUp() { // car클래스의 추상메소드 스피드업. 트럭에서는 5증가. 5감소.
		speed += 5;
	}

	@Override
	public void speedDn() {	
		speed -= 5;
	}
	
}

class SUV extends Car{

	public SUV() {
		super("성공회자동차");
	}
	
	public SUV(String name, int speed) {
		super(name, speed);
	}
	
	public SUV(String name) {
		super(name);
	}

	@Override
	public void speedUp() { // car클래스의 추상메소드 스피드업. SUV에서는 7증가. 7감소.
		speed += 7;
	}

	@Override
	public void speedDn() {
		speed -= 7;
	}
	
}
