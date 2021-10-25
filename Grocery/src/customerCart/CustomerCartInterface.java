package customerCart;

import java.util.HashMap;
import java.util.List;

import cartItem.CartItem;
import cartItem.CartItemInterface;

public interface CustomerCartInterface {
	
	HashMap<Integer, CartItem> getCartItems();
	int updateItemQuantity(int serialNum, int newQuant);
	boolean removeItem(int serialNum);
	boolean addItem(int serialNum);
	
	
	
}
