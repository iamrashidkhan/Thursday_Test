import java.util.stream.Stream;

class FruitBasket
{
	String fruitName;
	int weightInKgs;
	int PricePerKgs;
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public int getWeightInKgs() {
		return weightInKgs;
	}
	public void setWeightInKgs(int weightInKgs) {
		this.weightInKgs = weightInKgs;
	}
	public int getPricePerKgs() {
		return PricePerKgs;
	}
	public void setPricePerKgs(int pricePerKgs) {
		PricePerKgs = pricePerKgs;
	}
}

class FruitBasketUtility
{
	String fruitName;
	int weightInKgs;
	int PricePerKgs;
	private FruitBasket Obj;
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public int getWeightInKgs() {
		return weightInKgs;
	}
	public void setWeightInKgs(int weightInKgs) {
		this.weightInKgs = weightInKgs;
	}
	public int getPricePerKgs() {
		return PricePerKgs;
	}
	public void setPricePerKgs(int pricePerKgs) {
		PricePerKgs = pricePerKgs;
	}
	
	public void addToBasket(FruitBasket tbObj)
	{
		this.Obj=tbObj;
		
	}
	
	public int calculateBill(Stream<FruitBasket> fruitBasketStream)
	{
		return PricePerKgs;
	}
}

public class Customers {

	public static void main(String[] args) {
		FruitBasket fb=new FruitBasket();
		fb.setFruitName("Pomogranate");
		System.out.println("fruit name is :"+fb.getFruitName());
		
		fb.setPricePerKgs(300);
		System.out.println("price of fruit per kg is:"+fb.getPricePerKgs());
		
		fb.setWeightInKgs(6);
		System.out.println("weight of fruit in kg is :"+fb.getWeightInKgs());
		
		
		FruitBasketUtility fbu=new FruitBasketUtility();
		fbu.setFruitName("Mango");
		System.out.println("fruit name is:"+fbu.getFruitName());
		
		fbu.setPricePerKgs(70);
		System.out.println("Price of fruit per kg is:"+fbu.getPricePerKgs());
		
		fbu.setWeightInKgs(3);
		System.out.println("weight of fruit in kg is:"+fbu.getWeightInKgs());

	}

}
