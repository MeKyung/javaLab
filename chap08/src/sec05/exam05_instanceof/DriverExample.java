package sec05.exam05_instanceof;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus(); // Vehicle �������̽��� ������ü
		Taxi taxi = new Taxi();  // Vehicle �������̽��� ������ü
		
		// �������̽� Ÿ�Կ� ������ü���� �����Ͽ� �������� �����Ѵ�.
		driver.drive(bus);  // �ڵ��� ��ȯ, Vehicle vehicle = bus;
		driver.drive(taxi);

	}

}
