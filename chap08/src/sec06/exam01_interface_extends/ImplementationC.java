package sec06.exam01_interface_extends;
// 구현클래스
public class ImplementationC implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("ImplemtationC-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplemtationC-methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("ImplemtationC-methodC() 실행");
	}

}
