package customerCart;

import java.util.List;

import cartItem.CartItemInterface;

public interface CustomerCartInterface {
	
	List<CartItemInterface> getCartItems();
	int updateItemQuantity(int serialNum, int newQuant);
	boolean removeItem(int serialNum);
	boolean addItem(int serialNum);
	
	
	
}
