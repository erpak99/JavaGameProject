package gameProjectHW.Concrete;

import java.rmi.RemoteException;

import gameProjectHW.Abstract.IPlayerCheckService;
import gameProjectHW.Abstract.IPlayerService;
import gameProjectHW.Entities.Player;

public class PlayerManager implements IPlayerService{
	
	IPlayerCheckService checkService;
	
	public PlayerManager(IPlayerCheckService checkService) {
		this.checkService = checkService;
	}
	@Override
	public void save(Player player) throws RemoteException {
		if(checkService.checkIfRealPerson(player)) {
			System.out.println("Player is saved: " + player.getFirstName() + " " + player.getLastName());
		}
		else
		{
			System.out.println("Invalid player...");
			System.exit(0);
		}
	}
	@Override
	public void update(Player player) {
		System.out.println("Player is updated: " + player.getFirstName() + " " + player.getLastName());
	}
	@Override
	public void delete(Player player) {
		System.out.println("Player number"  + " " + player.getId()+" is deleted: " + player.getFirstName());
	}
}
