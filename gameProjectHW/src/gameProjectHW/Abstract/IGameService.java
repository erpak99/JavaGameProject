package gameProjectHW.Abstract;

import gameProjectHW.Entities.Game;

public interface IGameService {
	public void save(Game game);
	public void update(Game game);
	public void delete(Game game);
}
