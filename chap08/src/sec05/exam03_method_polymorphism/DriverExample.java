package sec05.exam03_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus(); // Vehicle �������̽��� ������ü
		Taxi taxi = new Taxi();  // Vehicle �������̽��� ������ü
		
		// �������̽� Ÿ�Կ� ������ü���� �����Ͽ� �������� �����Ѵ�.
		driver.drive(bus);  // �ڵ��� ��ȯ, Vehicle vehicle = bus;
		driver.drive(taxi);

	}

}
