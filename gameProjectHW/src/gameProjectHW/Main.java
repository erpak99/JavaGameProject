package gameProjectHW;

import java.rmi.RemoteException;

import gameProjectHW.Adapters.MernisServiceAdapter;
import gameProjectHW.Concrete.CampaignManager;
import gameProjectHW.Concrete.GameManager;
import gameProjectHW.Concrete.PlayerManager;
import gameProjectHW.Concrete.SaleManager;
import gameProjectHW.Entities.Campaign;
import gameProjectHW.Entities.Game;
import gameProjectHW.Entities.Player;

public class Main {

	public static void main(String[] args) throws RemoteException {
		Player player1 = new Player(1,"Ali Anýl","Erpak",1992,41378065734L);
		Game game1 = new Game(1,"GTA SAN ANDREAS",1000);
		Campaign campaign1 = new Campaign(1,"NEW YEAR",20);
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.save(player1);
		
		GameManager gameManager = new GameManager();
		gameManager.update(game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.save(campaign1);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(player1, game1, campaign1);
	}

}
