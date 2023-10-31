package qs1;

public class SatelliteLocation implements IGeoLocation {
	String location;

	public SatelliteLocation(String location) {
		
		this.location = location;
	}

	@Override
	public void displayLocation() {
		// TODO Auto-generated method stub
		System.out.println("Satellite Location is ="+this.location);
		
	}

}
