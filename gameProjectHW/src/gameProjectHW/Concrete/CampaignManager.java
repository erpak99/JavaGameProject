package gameProjectHW.Concrete;

import gameProjectHW.Abstract.ICampaignService;
import gameProjectHW.Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void save(Campaign campaign) {
		System.out.println("Campaign is saved: " + campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign is updated: " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign is deleted: " + campaign.getCampaignName());	
	}

}
