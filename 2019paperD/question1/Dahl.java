package question1;

public class Dahl extends Item {
	
	double  qtylnKilos;

	public Dahl(double qtylnKilos) {
		super();
		this.qtylnKilos = qtylnKilos;
	}

	public String displayltem() {
		return "Dahl";
		
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 750;
	}

	@Override
	public double getQuantity() {
		// TODO Auto-generated method stub
		return qtylnKilos;
	}

}
