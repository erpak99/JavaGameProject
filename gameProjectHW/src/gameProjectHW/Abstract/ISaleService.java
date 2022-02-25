package gameProjectHW.Abstract;

import gameProjectHW.Entities.Campaign;
import gameProjectHW.Entities.Game;
import gameProjectHW.Entities.Player;

public interface ISaleService {
	void sale(Player player, Game game, Campaign campaign);
}
