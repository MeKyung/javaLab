package sec04.exam03_static_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl.changeBattery();  // ���� �޼ҵ带 ����Ѵ�.
		
		// rc ������ �͸�����ü�� �����Ѵ�.
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
			}
			@Override
			public void turnOff() {
			}
			@Override
			public void setVolume(int volume) {
			}
		};
		
		rc.setMute(true);  // �͸�����ü�� ������ ��, ����Ʈ �޼ҽ��� ����Ѵ�.
		
		
		
	}

}
