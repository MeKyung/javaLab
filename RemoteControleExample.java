package sec03.exam01_name_implement_class;

public interface RemoteControleExample {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//rc : ����
		RemoteControl rc;
		rc = new Audio(); //�������̽� ���� = TV ������ü;
		rc = new Television();	//�������̽� ���� = Audio ������ü;
	
		RemoteControl rc1 =new Television();
	}
	
}
