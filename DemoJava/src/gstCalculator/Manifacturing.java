package gstCalculator;

public class Manifacturing extends RawCustomer {

	float stdProfit=super.stdProfit;
	
	
	
	
	@Override
	public float profitandLoss() {
		int totalPurchase=50000;
		float profit= totalPurchase*stdProfit;
		
		return profit;
	}
	
	public void gstCalc() {

		float gstCal = gstCal();
		System.out.println(gstCal);
	}

	
	public static void main(String[] args) {
		Manifacturing g=new Manifacturing();
		g.gstCalc();
		int balance = g.balance();
		System.out.println(balance);
	}
	

}
