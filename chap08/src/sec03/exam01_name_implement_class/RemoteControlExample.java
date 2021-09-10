package sec03.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로컬변수 rc는 RemoteControl 인터페이스 타입이다.
		RemoteControl rc = new Television();   // 인터페이스 변수 = 구현객체;  자동형변환
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);  // 상속받은 디폴트메소트
		rc.turnOff();
		System.out.println("----------------");
		
		rc = new Audio();   // 인터페이스 타입 = Audio 구현 객체, 자동형변환
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(false);
		rc.turnOff();

	}

}
