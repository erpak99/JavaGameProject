package gameProjectHW.Abstract;

import gameProjectHW.Entities.Campaign;

public interface ICampaignService {
	void save(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
