package groceriesAvailable;

import java.util.List;

import groceryItem.GroceryItemInterface;

public interface GroceriesAvailableInterface {

	List<GroceryItemInterface> getAllGroceries();
	boolean removeItem(int serialNum);
	boolean addItem(int serialNum);
	int changeItemQuantity(int serialNum);
	GroceryItemInterface getItemData(int serialNum);
	
	
}
