package sec05.exam04_casting;

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
