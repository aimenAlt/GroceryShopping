package customerCart;

import java.util.HashMap;

import cartItem.CartItem;

public class CustomerCart implements CustomerCartInterface {
	
	private HashMap<Integer, CartItem> cartList;
	
	public CustomerCart() {
		this.cartList = new HashMap<Integer, CartItem>();
	}
	
	@Override
	public HashMap<Integer, CartItem> getCartItems() {
		return this.cartList;
	}
	
	@Override
	public boolean addItem(int serialNum) {
		this.cartList.put(serialNum, new CartItem(serialNum, 1));
		return true;
	}

	@Override
	public int updateItemQuantity(int serialNum, int newQuant) {
		// TODO Auto-generated method stub
		this.cartList.get(serialNum).changeQuantity(newQuant);
		return this.cartList.get(serialNum).getQuantity();
	}

	@Override
	public boolean removeItem(int serialNum) {
		// TODO Auto-generated method stub
		this.cartList.remove(serialNum);
		return true;
	}
		
	
}
