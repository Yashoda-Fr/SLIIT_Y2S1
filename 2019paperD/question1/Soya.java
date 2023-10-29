package question1;

public class Soya extends Item {
	
	double  qtylnKilos;

	public Soya(double qtylnKilos) {
		super();
		this.qtylnKilos = qtylnKilos;
	}

	public String displayltem() {
		return "Soya";
		
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 850;
	}

	@Override
	public double getQuantity() {
		// TODO Auto-generated method stub
		return qtylnKilos;
	}

}
