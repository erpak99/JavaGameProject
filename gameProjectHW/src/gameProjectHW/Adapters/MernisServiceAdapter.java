package gameProjectHW.Adapters;

import java.rmi.RemoteException;

import gameProjectHW.Abstract.IPlayerCheckService;
import gameProjectHW.Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayerCheckService {
	KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();

	@Override
	public boolean checkIfRealPerson(Player player) throws RemoteException {
		return proxy.TCKimlikNoDogrula(player.getNationalityId(), player.getFirstName(),
				player.getLastName(),player.getBirthYear());
	}

}
