package Hospital;

public class Demo {

	public static void main(String[] args) {

		HospitalFactory hospitalFactory = new HospitalFactory();

		HospitalBuilding hospital1 = hospitalFactory.getHospital("Public");
		System.out.println(hospital1.typeHospital());

		HospitalBuilding hospital2 = hospitalFactory.getHospital("Private");
		System.out.println(hospital2.typeHospital());

	}

}
