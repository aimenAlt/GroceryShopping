package customerServices;

public interface CustomerServicesInterface {
	
	String getCart();
	boolean addItem(int serialNum);
	boolean removeItem(int serialNum);
	int changeQuantity(int serialNum, int newQuant);
	
}
