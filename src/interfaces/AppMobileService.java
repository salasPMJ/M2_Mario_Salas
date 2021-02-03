package interfaces;

import clases.AppMobile;

public interface AppMobileService {
	
	AppMobile createApp(boolean tecnologiaHibrida, String[] permisos, String lenguajeProgramacion, boolean persistencia, float complejidad, long lineasCodigo,
			int casosTest);

}
