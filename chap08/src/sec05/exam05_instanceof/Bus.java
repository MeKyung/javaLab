package sec05.exam05_instanceof;

public class Bus implements Vehicle {

	// �ݵ�� �߻�޼ҵ带 ������ �Ѵ�.
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	
	public void checkFare() {
		System.out.println("��������� üũ�մϴ�.");
	}

}
