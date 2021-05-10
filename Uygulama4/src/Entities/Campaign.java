package Entities;

public class Campaign {
	
	private int campaingId;
	private String campaingName;
	private double discountRate;
	
	public Campaign(int campaingId, String campaingName,double discountRate) {
		
		this.campaingId = campaingId;
		this.campaingName = campaingName;
		this.discountRate = discountRate;
	}

	public int getCampaingId() {
		return campaingId;
	}

	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

}
