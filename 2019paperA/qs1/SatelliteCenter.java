package qs1;

public class SatelliteCenter {
	int option;
	ISatellite [] ISatellite;
	IGeoLocation[] iGeoLocations;
	
	public SatelliteCenter(int option, qs1.ISatellite[] iSatellite, IGeoLocation[] iGeoLocations) {
		super();
		this.option = option;
		ISatellite = iSatellite;
		this.iGeoLocations = iGeoLocations;
	}
	
	public void startService() {
		if(option == 0)
		{
			ISatellite[0].activate();
		}
		else if(option == 1)
		{
			ISatellite[1].activate();
		}
	}

	public void stopService() {
		if(option == 0)
		{
			ISatellite[0].deactivate();
		}
		else if(option == 1)
		{
			ISatellite[1].deactivate();
		}
	}
	public void locationService() {
		if(option == 0)
		{
			iGeoLocations[0].displayLocation();	}
		else if(option == 1)
		{
			iGeoLocations[1].displayLocation();
		}
		
	}
}
