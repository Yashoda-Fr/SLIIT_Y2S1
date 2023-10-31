package qs1;

public class NavigationSatellite implements ISatellite {
	String name;

	public NavigationSatellite(String name) {
		
		this.name = name;
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		System.out.println(name +"navigational satellite activate");
		
	}

	@Override
	public void deactivate() {
		// TODO Auto-generated method stub
		System.out.println(name +"navigational satellite deactivate");
		
	}

}
