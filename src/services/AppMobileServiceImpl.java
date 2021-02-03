package services;

import clases.AppMobile;
import interfaces.AppMobileService;

public class AppMobileServiceImpl implements AppMobileService {

	@Override
	public AppMobile createApp(boolean tecnologiaHibrida, String[] permisos, String lenguajeProgramacion,
			boolean persistencia, float complejidad, long lineasCodigo, int casosTest) {
		
		AppMobile appMobile = new AppMobile(tecnologiaHibrida, permisos, lenguajeProgramacion, persistencia, complejidad, lineasCodigo, casosTest);
			
		return appMobile;
	}

}
