package sec04.exam01_abstract_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		// Television ���� ��ü
		rc = new Television();
		rc.turnOn();  // Television ��ü�� turnOn() �����޼ҵ尡 ����Ǵ� ���̴�.
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();  // Audio ��ü�� turnOn() �����޼ҵ尡 ����Ǵ� ���̴�.
		rc.turnOff();
		

	}

}
