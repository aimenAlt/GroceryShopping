package managerServices;

import datePackage.DateInterface;

public interface ManagerServicesInterface {

	String getGroceries();
	int updateItemQuantity(int serialNum);
	boolean addItem(int serialNum, DateInterface expirationDate, String itemName, int quantAvailable, int price);
	boolean deleteItem(int serialNum);
	boolean checkIfSerialExists(int serialNum);
	
}
