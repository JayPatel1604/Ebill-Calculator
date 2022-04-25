package ebill;

public class ElectricityBill {

	private String consumerNumber;
	private String consumerName;
	private String consumerAddress;
	private int unitConsumed;
	private double billAmount;

	public void calculateBillAmount() {
		billAmount = 0.0;
		int tempUnits = unitConsumed;

		if (tempUnits <= 100) {
			billAmount = tempUnits * 0.0;
		} else if (tempUnits > 100 && tempUnits <= 300) { 
			billAmount = 100 * 0.0 + (tempUnits - 100) * 1.5;
		} else if (tempUnits > 300 && tempUnits <= 600) { 
			billAmount = 100 * 0.0 + 200 * 1.5 + (tempUnits - 300) * 3.50;
		} else if (tempUnits > 600 && tempUnits <= 1000) { 
			billAmount = 100 * 0.0 + 200 * 1.5 + 300 * 3.50 + (tempUnits - 600) * 5.50;
		} else if (tempUnits > 1000) {
			billAmount = 100 * 0.0 + 200 * 1.5 + 300 * 3.50 + 400 * 5.5 + (tempUnits - 1000) * 7.50;
		}

	}


	public String getConsumerNumber() {
		return consumerNumber;
	}

	public void setConsumerNumber(String consumerNumber) {
		this.consumerNumber = consumerNumber;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public String getConsumerAddress() {
		return consumerAddress;
	}

	public void setConsumerAddress(String consumerAddress) {
		this.consumerAddress = consumerAddress;
	}

	public int getUnitConsumed() {
		return unitConsumed;
	}

	public void setUnitConsumed(int unitConsumed) {
		this.unitConsumed = unitConsumed;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

}
