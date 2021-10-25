package datePackage;

public class DateClass {
	
	private int month = 0;
	private int day = 0;
	private int year = 0;
	
	DateClass(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public String toString() {
		String returningString = this.month + "/" + this.day + "/" + this.year;
		return returningString;
	}
}
