package qs1;

public class SatelliteDemo {

	public static void main(String[] args) {
	
		ISatellite navigationalISatellite =new NavigationSatellite("Ravana-01 ");
		IGeoLocation locationtracker1 = new SatelliteLocation("Sri lanka");
		ISatellite droneSatellite = new DroneSatellite("Ravana -02 ");
		IGeoLocation locationtracker2 = new SatelliteLocation("Russia");
		
		ISatellite[] satelliteArray = new ISatellite[]{navigationalISatellite,droneSatellite};
		IGeoLocation[] trackerArray = new IGeoLocation[] {locationtracker1,locationtracker2};
		
		
		SatelliteCenter satelliteCenter = new SatelliteCenter(0, satelliteArray, trackerArray);
		satelliteCenter.startService();
		satelliteCenter.stopService();
		satelliteCenter.locationService();
		
		System.out.println("");
		
		SatelliteCenter remotecontroller2 = new SatelliteCenter(1, satelliteArray, trackerArray);
		remotecontroller2.startService();
		remotecontroller2.stopService();
		remotecontroller2.locationService();
	}

}
