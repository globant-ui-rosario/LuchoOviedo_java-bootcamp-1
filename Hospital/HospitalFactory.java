package Hospital;

public class HospitalFactory {

	public HospitalBuilding getHospital(String type) {

		if ("Public".equals(type)) {

			return new PublicHospital();

		} else if ("Private".equals(type)) {

			return new PrivateHospital();

		} else {
			
			return null;
		
		}
	}

}
