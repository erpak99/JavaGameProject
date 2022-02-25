package gameProjectHW.Abstract;

import java.rmi.RemoteException;

import gameProjectHW.Entities.Player;

public interface IPlayerCheckService {
	boolean checkIfRealPerson(Player player) throws RemoteException;
}
