package sec03.exam01_name_implement_class;

// Television ���� Ŭ����
public class Audio implements RemoteControl {
	//�ʵ�
	private int volume;
	//������
	
	//�޼ҵ�
	@Override
	public void turnOn() {
		System.out.println("Aduio�� �մϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println("Aduio�� ���ϴ�.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {	
		 this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Aduio ����"+volume);

	}

}
