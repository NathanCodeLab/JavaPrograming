package gstCalculator;

public interface Bank {
	
	
	float cGst = 0.18f;
	float sGst = 0.18f;
	float Gst = 0.12f;
	
	
	
	public int totalPurchase();
	public int credit();
	public int balance();
	public float gstCal();
	

}
