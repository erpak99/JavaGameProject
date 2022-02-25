package gameProjectHW.Entities;

public class Campaign {
	private int campaignId;
	private String campaignName;
	private int discountAmount;
	
	public Campaign() {
		
	}
	
	public Campaign(int campaignId, String campaignName, int discountAmount) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.discountAmount = discountAmount;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}
	
	
}
