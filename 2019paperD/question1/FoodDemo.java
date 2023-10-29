package question1;

public class FoodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item[] items =new Item[]{new Rice(5),new Dahl(3),new Soya(4),new Rice(4),new Soya(4)};
		
		Food food = new Food(items);
		
		food.calculateCost();

	}

}
