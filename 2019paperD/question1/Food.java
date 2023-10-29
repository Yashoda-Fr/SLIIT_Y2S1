package question1;

public class Food implements IAccountable {

	
	
	Item[] Array;
	
	
	public Food (Item[] items)
	{
		this.Array=items;
	}
	

	@Override
	public void calculateCost() {
		
		double totcost=0;
		double total;
		
		for(Item I:Array)
		{
			 total=(I.getCost()*I.getQuantity());
			System.out.println(I.displayltem()+"=>"+I.getCost()+"*"+I.getQuantity()+"="+total);
			totcost=totcost+total;
			
		}
		System.out.println("the total is ="+totcost);
	}
		
	

}
