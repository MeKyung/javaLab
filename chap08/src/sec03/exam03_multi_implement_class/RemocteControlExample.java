package sec03.exam03_multi_implement_class;

public class RemocteControlExample {

	public static void main(String[] args) {
		// tv ������ ���߱�����ü�� �����Ͽ� �����Ѵ�.
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;   // RemoteControl �������̽� Ÿ�Կ� �����Ѵ�.
		Searchable searchable = tv;  // Searchable �������̽� Ÿ�Կ� ����
		

	}

}
