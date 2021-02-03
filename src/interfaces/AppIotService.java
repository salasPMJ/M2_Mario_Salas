package interfaces;

import clases.AppIoT;
import enumeraciones.EProtocols;

public interface AppIotService {
	
	AppIoT createApp(boolean hasGraphicalInterface, boolean hasWifiAccess, EProtocols protocolo, String lenguajeProgramacion, boolean persistencia, float complejidad, long lineasCodigo,
			int casosTest);

}
