package services;

import clases.AppIoT;
import enumeraciones.EProtocols;
import interfaces.AppIotService;

public class AppIotServiceImpl implements AppIotService {

	@Override
	public AppIoT createApp(boolean hasGraphicalInterface, boolean hasWifiAccess, EProtocols protocolo,
			String lenguajeProgramacion, boolean persistencia, float complejidad, long lineasCodigo, int casosTest) {
		
		AppIoT appIoT = new AppIoT(hasGraphicalInterface, hasWifiAccess, protocolo, lenguajeProgramacion, persistencia, complejidad, lineasCodigo, casosTest);
		
						
		return appIoT;
	}

}
