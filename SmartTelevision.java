package sec03.exam03_multi_implement_class;


//�����������̽� ���� Ŭ����
public class SmartTelevision implements RemoteControl,Searchable{

	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

}
