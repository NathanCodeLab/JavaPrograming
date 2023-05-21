package gstCalculator;

public abstract class RawCustomer implements Bank {

	float cgst = cGst;
	float sgst = sGst;
	float gst = Gst;
	static float stdProfit=0.25f;

	public static void main(String[] args) {

	}

	@Override
	public int totalPurchase() {

		int rawPlastic = 12000;
		int rawIron = 55000;
		int rawSS = 40000;

		int total = rawPlastic + rawIron + rawSS;
		
		return total;
	}

	@Override
	public int credit() {

		int totalCost = totalPurchase();
		int paid = paid();
		int balance = totalCost - paid;

		return balance;
	}

	@Override
	public int balance() {

		int balance = credit();

		return balance;
	}

	@Override
	public float gstCal() {

		int paid = paid();

		float cg = cgst * paid;
		float sg = sgst * paid;
		float g = gst * paid;

		float totalGST = cg + sg + g;

		return totalGST;
	}

	public int paid() {

		int paid = 50000;

		return paid;
	}
	public abstract float profitandLoss();

}
