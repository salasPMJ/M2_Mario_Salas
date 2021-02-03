package services;
import clases.AppWeb;
import interfaces.AppWebService;

public class AppWebServiceImpl implements AppWebService {

	@Override
	public AppWeb createApp(String nameFrameworkBack, String nameFrameworkFront, String lenguajeProgramacion, boolean persistencia, float complejidad, long lineasCodigo,
			int casosTest) {
		
		AppWeb appWeb = new AppWeb(nameFrameworkBack, nameFrameworkFront, lenguajeProgramacion, persistencia, complejidad, lineasCodigo, casosTest);
		
		return appWeb;
	}

}
