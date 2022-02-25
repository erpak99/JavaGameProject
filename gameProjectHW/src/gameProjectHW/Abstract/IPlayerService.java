package gameProjectHW.Abstract;

import java.rmi.RemoteException;

import gameProjectHW.Entities.Player;

public interface IPlayerService {
	void save(Player player) throws RemoteException;
	void update(Player player);
	void delete(Player player);
}
