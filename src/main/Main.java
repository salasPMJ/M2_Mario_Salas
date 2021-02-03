package main;

import clases.AppIoT;
import clases.AppMobile;
import clases.AppWeb;
import enumeraciones.EProtocols;
import services.AppIotServiceImpl;
import services.AppMobileServiceImpl;
import services.AppWebServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		
		
		//CREAMOS UN OBJETO DE AppIoT
		
		AppIotServiceImpl appIoT = new AppIotServiceImpl();
		
		AppIoT aplicationIoT = appIoT.createApp(true, true, EProtocols.MQTT, "java", true, 30, 100, 10);	
		
		System.out.println(aplicationIoT);
		
		//CREAMOS UN OBJETO DE AppMobile
		
		String[] permisos = {"Teléfono","Almacenamiento/Memoria","Mensajes de texto/SMS","Calendario","Cámara","Contactos","Ubicación","Micrófono","Sensores Corporales"};
		
		AppMobileServiceImpl appMobile = new AppMobileServiceImpl();
		
		//[Android,Kotlin,iOS->swift->Xamarin[Microsoft-C#],Flutter,PhoneGap,Ionic4[Angular/Vue],ReactNative[facebook],Titanium
		//boolean tecnologiaHibrida, String[] permisos, String lenguajeProgramacion, boolean persistencia, float complejidad, long lineasCodigo,
		//int casosTest
		
		AppMobile aplicationMobile = appMobile.createApp(true, permisos, "Xamarin", true, 50, 150, 15);
		
		System.out.println(aplicationMobile);
		
		//CREAMOS UN OBJETO AppWeb
		
		AppWebServiceImpl appWeb = new AppWebServiceImpl();
		
		//Framework Backend =>  .NET core[Microsoft], Laravel[Php], Express[Node], Spring[Java], Spring Boot[Java], DJango[Python]
		//Framework Frontend => Vue[JS], Angular[Google], React[Facebook], Ember
		//String nameFrameworkBack, String nameFrameworkFront, String lenguajeProgramacion, boolean persistencia, float complejidad, long lineasCodigo,
		//int casosTest
		AppWeb aplicationWeb = appWeb.createApp("Spring Boot", "React","Java", true, 60, 300, 100);
		
		
		System.out.println(aplicationWeb);		
		
		
	}

}
