package sec03.exam01_name_implement_class;

public interface RemoteControleExample {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//rc : 변수
		RemoteControl rc;
		rc = new Audio(); //인터페이스 변수 = TV 구현객체;
		rc = new Television();	//인터페이스 변수 = Audio 구현객체;
	
		RemoteControl rc1 =new Television();
	}
	
}
