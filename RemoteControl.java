package sec03.exam03_multi_implement_class;

public interface RemoteControl {

	// �������̽��� �������
	// ���
	public static final int MAX_VOLUME =10;
	int MIN_VOLUME =10;
	
	
	// �߻� �޼ҵ�
	abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// ����Ʈ �޼ҵ�
	default void  setMute(boolean mute) {
		if(mute) {
		System.out.println("���� ó���մϴ�.");
	} else {
		System.out.println("���� �����մϴ�.");
	}
	}
	
	// ���� �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	
}