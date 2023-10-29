package question1;

public class Rice extends Item {
	
	double  qtylnKilos;

	public Rice(double qtylnKilos) {
		super();
		this.qtylnKilos = qtylnKilos;
	}

	public String displayltem() {
		return "Rice";
		
	}

	@Override
	public double getCost() {
		
		return 1000;
	}

	@Override
	public double getQuantity() {
		// TODO Auto-generated method stub
		return qtylnKilos;
	}
}
