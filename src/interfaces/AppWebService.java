package interfaces;
import clases.AppWeb;

public interface AppWebService {
	
	AppWeb createApp(String nameFrameworkBack, String nameFrameworkFront, String lenguajeProgramacion, boolean persistencia, float complejidad, long lineasCodigo,
			int casosTest);	
	

}
