package main;

import java.util.ArrayList;
import java.util.Scanner;

import clases.AppIoT;
import clases.AppMobile;
import clases.AppWeb;
import enumeraciones.EProtocols;
import services.AppIotServiceImpl;
import services.AppMobileServiceImpl;
import services.AppWebServiceImpl;

public class MainArrayList {

	static Scanner teclado = new Scanner(System.in);
	static int entrada;
	static ArrayList<AppIoT> aplicacionesIoT = new ArrayList<AppIoT>();
	static ArrayList<AppMobile> aplicacionesMobiles = new ArrayList<AppMobile>();    
	static ArrayList<AppWeb> aplicacionesWeb = new ArrayList<AppWeb>();   
	

	public static void main(String[] args) {
		
		
		

		// INVOCAMOS EL MENU PRINCIPAL
		menu();

		/*
		 * EProtocols[] protocolos = EProtocols.values(); for (EProtocols eProtocols :
		 * protocolos) { if(eProtocols.name().equals("HTTP"))
		 * //.equals(EProtocols.HTTP)) System.out.println(eProtocols); }
		 */

		switch (entrada) {
		case 1:
			datosAppWeb();
			break;
		case 2:
			datosAppIoT();
			break;
		case 3:
			datosAppMobile();
			break;

		default:
			break;
		}

		System.out.println("LA OPCION SELECCIONADA ES " + entrada);

	}

	public static void menu() {

		System.out.println("==========    SELECCIONE TIPO DE APLICACION A CREAR    ==========");
		System.out.println("=                                                               =");
		System.out.println("=             1 - Aplicación Web                                =");
		System.out.println("=             2 - Aplicación IoT                                =");
		System.out.println("=             3 - Aplicación Mobile                             =");
		System.out.println("=                                                               =");
		System.out.println("=================================================================");
		System.out.println("\n");
		// System.out.println("Introduzca el Número de la opción : ");
		// entrada = teclado.nextInt();

		boolean entrar = true;

		while (entrar) {

			System.out.println("INTRODUZCA EL NÚMERO DE LA OPCIÓN : ");
			entrada = teclado.nextInt();

			if (entrada == 1) {
				System.out.println("ELEGISTE APLICACION WEB \n\n");
				entrar = false;

			} else if (entrada == 2) {
				System.out.println("ELEGISTE APLICACION IoT");
				entrar = false;

			} else if (entrada == 3) {
				System.out.println("ELEGISTE APLICACION MOBILE");
				entrar = false;

			} else {
				System.out.println("NO ES UNA OPCION CORRECTA");

			}
		}
	}

	public static void datosAppIoT() {

		// boolean hasGraphicalInterface, boolean hasWifiAccess, EProtocols protocolo,
		// String lenguajeProgramacion, boolean persistencia, float complejidad, long
		// lineasCodigo, int casosTest

		boolean graphicalInterface;
		boolean WifiAccess;
		EProtocols protocolo = EProtocols.HTTP;
		String lenguajeProgramacion;
		boolean persistencia;
		float complejidad;
		long lineasCodigo;
		int casosTest;

		String aux;
		int numProtocolo;
		int numApp = 1;

		System.out.println("==========            DATOS PARA APP I o T            ==========");
		System.out.println("\n\n");

		while (numApp <= 2) {

			System.out.println("INTRODUCE DATOS APLICAION Nº " + numApp);
			System.out.println("\n");

			System.out.println("INTERFAZ GRAFICA SI / NO : ");
			aux = teclado.next();
			graphicalInterface = aux.equalsIgnoreCase("SI") ? true : false;

			System.out.println("ACCESO WIFI SI / NO : ");
			aux = teclado.next();
			WifiAccess = aux.equalsIgnoreCase("SI") ? true : false;

			System.out.println("PROTOCOLOS  : \n");

			System.out.println("****************************\n");

			int cont = 1;
			EProtocols[] protocolos = EProtocols.values();
			for (EProtocols eProtocols : protocolos) {
				System.out.println("      " + cont + " - " + eProtocols);
				cont++;
			}

			System.out.println("****************************\n");

			System.out.println("SELECCIONE EL Nº DEL PROTOCOLO  : \n");

			numProtocolo = teclado.nextInt();

			switch (numProtocolo) {
			case 1:
				protocolo = EProtocols.TCP;
				break;
			case 2:
				protocolo = EProtocols.IP;
				break;
			case 3:
				protocolo = EProtocols.POP;
				break;
			case 4:
				protocolo = EProtocols.SMTP;
				break;
			case 5:
				protocolo = EProtocols.HTTP;
				break;
			case 6:
				protocolo = EProtocols.AMQP;
				break;
			case 7:
				protocolo = EProtocols.MQTT;
				break;
			case 8:
				protocolo = EProtocols.WAMP;
				break;
			case 9:
				protocolo = EProtocols.COAP;
				break;

			default:
				break;
			}

			// for (EProtocols eProtocols : protocolos) {
			// if(eProtocols.name().equalsIgnoreCase(aux)) { //.equals(EProtocols.HTTP))
			// System.out.println(eProtocols);
			// protocolo = eProtocols;
			// }
			// }

			System.out.println("LENGUAJE DE PROGRAMACIÓN : ");
			lenguajeProgramacion = teclado.next();

			System.out.println("PERSISTENCIA SI / NO : ");
			aux = teclado.next();
			persistencia = aux.equalsIgnoreCase("SI") ? true : false;

			System.out.println("COMPLEJIDAD : ");
			complejidad = teclado.nextFloat();

			System.out.println("Nº LINEAS DE CODIGO : ");
			lineasCodigo = teclado.nextLong();

			System.out.println("Nº CASOS DE TEST : ");
			casosTest = teclado.nextInt();

			AppIotServiceImpl appIoT = new AppIotServiceImpl();

			// boolean hasGraphicalInterface, boolean hasWifiAccess, EProtocols protocolo,
			// String lenguajeProgramacion, boolean persistencia, float complejidad, long
			// lineasCodigo, int casosTest) {

			// System.out.println("ojito" + protocolo.toString());

			System.out.println("\n ========     APLICACIÓN CREADA Nº " + numApp + "     ========\n");

			AppIoT aplicationIoT = appIoT.createApp(graphicalInterface, WifiAccess, protocolo, lenguajeProgramacion,
					persistencia, complejidad, lineasCodigo, casosTest);

			System.out.println(aplicationIoT);
			System.out.println("\n");
			
			aplicacionesIoT.add(aplicationIoT);			

			numApp++;		
		

		}
	}

	public static void datosAppMobile() {

		// boolean tecnologiaHibrida, String[] permisos, String lenguajeProgramacion,
		// boolean persistencia, float complejidad, long lineasCodigo, int casosTest

		boolean tecnologiaHibrida;
		String[] permisos;
		String lenguajeProgramacion;
		boolean persistencia;
		float complejidad;
		long lineasCodigo;
		int casosTest;

		String aux;
		int numPermiso;
		int numApp = 1;
		ArrayList<String> auxPermisos = new ArrayList<String>();

		System.out.println("==========            DATOS PARA APP MOBILE            ==========");
		System.out.println("\n\n");

		while (numApp <= 2) {

			System.out.println("INTRODUCE DATOS APLICAION Nº " + numApp);
			System.out.println("\n");

			System.out.println("TECNOLOGIA HIBRIDA SI / NO : ");
			aux = teclado.next();
			tecnologiaHibrida = aux.equalsIgnoreCase("SI") ? true : false;

			auxPermisos.clear();

			

			String[] permisosAll = { "Teléfono", "Almacenamiento/Memoria", "Mensajes de texto/SMS", "Calendario",
					"Cámara", "Contactos", "Ubicación", "Micrófono", "Sensores Corporales" };

//			for (int i = 0; i < permisosAll.length; i++) {
//
//				System.out.println("      " + (i + 1) + " - " + permisosAll[i]);
//
//			}

			

			String respuesta = "si";
			//int indice = 0;
			
			System.out.println("PERMISOS  : \n");

			while (respuesta.equalsIgnoreCase("si")) {
				
				System.out.println("****************************\n");
				
				for (int i = 0; i < permisosAll.length; i++) {

					System.out.println("      " + (i + 1) + " - " + permisosAll[i]);

				}
				
				System.out.println("****************************\n");

				System.out.println("SELECCIONE EL Nº DEL PERMISO  : \n");

				numPermiso = teclado.nextInt();

				auxPermisos.add(permisosAll[numPermiso - 1]);

				System.out.println("DESEA CONTINUAR SI / NO : ");
				respuesta = teclado.next();

			}
			
			permisos = new String[auxPermisos.size()];			
			
			for (int i = 0; i < auxPermisos.size(); i++) {
				
				permisos[i] = auxPermisos.get(i);
				
			}			
			

			System.out.println("LENGUAJE DE PROGRAMACIÓN : ");
			lenguajeProgramacion = teclado.next();

			System.out.println("PERSISTENCIA SI / NO : ");
			aux = teclado.next();
			persistencia = aux.equalsIgnoreCase("SI") ? true : false;

			System.out.println("COMPLEJIDAD : ");
			complejidad = teclado.nextFloat();

			System.out.println("Nº LINEAS DE CODIGO : ");
			lineasCodigo = teclado.nextLong();

			System.out.println("Nº CASOS DE TEST : ");
			casosTest = teclado.nextInt();

			AppMobileServiceImpl appMobile = new AppMobileServiceImpl();

			// boolean hasGraphicalInterface, boolean hasWifiAccess, EProtocols protocolo,
			// String lenguajeProgramacion, boolean persistencia, float complejidad, long
			// lineasCodigo, int casosTest) {

			// System.out.println("ojito" + protocolo.toString());

			System.out.println("\n ========     APLICACIÓN CREADA Nº " + numApp + "     ========\n");

			AppMobile aplicationMobile = appMobile.createApp(tecnologiaHibrida, permisos, lenguajeProgramacion,
					persistencia, complejidad, lineasCodigo, casosTest);

			System.out.println(aplicationMobile);
			System.out.println("\n");
			
			aplicacionesMobiles.add(aplicationMobile);

			numApp++;

		}

	}

	private static void datosAppWeb() {

		// String nameFrameworkBack, String nameFrameworkFront, EProtocols protocolo,
		// String lenguajeProgramacion,
		// boolean persistencia, float complejidad, long lineasCodigo,
		// int casosTest

		String nameFrameworkBack;
		String nameFrameworkFront;
		String lenguajeProgramacion;
		boolean persistencia;
		float complejidad;
		long lineasCodigo;
		int casosTest;
		String aux;
		int numApp = 1;

		System.out.println("==========            DATOS PARA APP WEB            ==========");
		System.out.println("\n\n");

		while (numApp <= 2) {

			System.out.println("INTRODUCE DATOS APLICAION Nº " + numApp);
			System.out.println("\n");
			
			System.out.println("FRAMEWORK DE BACKEND: ");
			nameFrameworkBack = teclado.next();
			
			System.out.println("FRAMEWORK DE FRONTEND: ");
			nameFrameworkFront = teclado.next();
			
			System.out.println("LENGUAJE DE PROGRAMACIÓN : ");
			lenguajeProgramacion = teclado.next();
			
			System.out.println("PERSISTENCIA SI / NO : ");
			aux = teclado.next();
			persistencia = aux.equalsIgnoreCase("SI") ? true : false;
			
			System.out.println("COMPLEJIDAD : ");
			complejidad = teclado.nextFloat();
			
			System.out.println("Nº LINEAS DE CODIGO : ");
			lineasCodigo = teclado.nextLong();
			
			System.out.println("Nº CASOS DE TEST : ");
			casosTest = teclado.nextInt();
			
			AppWebServiceImpl appWeb = new AppWebServiceImpl();
			// String nameFrameworkBack, String nameFrameworkFront, EProtocols protocolo,
			// String lenguajeProgramacion,
			// boolean persistencia, float complejidad, long lineasCodigo,
			// int casosTest
			System.out.println("\n ========     APLICACIÓN CREADA Nº " + numApp + "     ========\n");
			
			AppWeb aplicationWeb = appWeb.createApp(nameFrameworkBack, nameFrameworkFront, lenguajeProgramacion,
					persistencia, complejidad, lineasCodigo, casosTest);
			
			System.out.println(aplicationWeb);
			System.out.println("\n");
			
			aplicacionesWeb.add(aplicationWeb);
			
			numApp++;
		}
	}

}
