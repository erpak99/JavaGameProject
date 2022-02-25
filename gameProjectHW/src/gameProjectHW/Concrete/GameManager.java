package gameProjectHW.Concrete;

import gameProjectHW.Abstract.IGameService;
import gameProjectHW.Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void save(Game game) {
		System.out.println("Game is saved: " + game.getGameName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Game is updated: " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game is deleteed: " + game.getGameName());		
	}

}
