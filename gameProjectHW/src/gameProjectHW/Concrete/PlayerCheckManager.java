package gameProjectHW.Concrete;

import gameProjectHW.Abstract.IPlayerCheckService;
import gameProjectHW.Entities.Player;

public class PlayerCheckManager implements IPlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) {
		return true;
	}

}
