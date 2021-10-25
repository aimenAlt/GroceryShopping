package cartItem;

public class CartItem implements CartItemInterface{
	private int serialNum = 0;
	private int quantity = 0;
	
	public CartItem(int serialNum, int quantity) {
		this.serialNum = serialNum;
		this.quantity = quantity;
	}
	@Override
	public int changeQuantity(int newQuant) {
		this.quantity = newQuant;
		return this.quantity;
	}
	@Override
	public int getQuantity() {
		return this.quantity;
	}
	@Override
	public int getSerialNum() {
		return this.serialNum;
	}

	
}
