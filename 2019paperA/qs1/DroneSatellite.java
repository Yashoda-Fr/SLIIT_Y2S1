package qs1;

public class DroneSatellite implements ISatellite{
	String name;

	public DroneSatellite(String name) {
		
		this.name = name;
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		System.out.println(name +"drone satellite activate");
		
	}

	@Override
	public void deactivate() {
		// TODO Auto-generated method stub
		System.out.println(name +"drone satellite deactivate");
	}

}
