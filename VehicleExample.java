package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus(); //구현 객체(Bus) 자동형 변환
	
		vehicle.run();
		//vehicle.checkFare(); 참조영역의 축소로 사용불가
		
		Bus bus = (Bus)vehicle; //강제형변환
		bus.run();
		bus.checkFare(); //참조영역의 확대로 사용가능
	}

}
