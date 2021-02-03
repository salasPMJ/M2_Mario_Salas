package clases;

public class AppWeb extends AppSoftware {
	
	private String nameFrameworkBack;
	private String nameFrameworkFront;	
	
	
	//CONSTRUCTOR
	

	public AppWeb(String nameFrameworkBack, String nameFrameworkFront, String lenguajeProgramacion, boolean persistencia, float complejidad, long lineasCodigo,
			int casosTest) {
		super(lenguajeProgramacion, persistencia, complejidad, lineasCodigo, casosTest );
		this.nameFrameworkBack = nameFrameworkBack;
		this.nameFrameworkFront = nameFrameworkFront;
	}

	
	//MÉTODOS
	

	@Override
	public void imprimirStack() {
		
		String texto = "";
		texto.concat("El lenguaje de programación utilizado es " + this.getLenguajeProgramacion() 
		+ " el framework de backend es " + this.nameFrameworkBack 
		+  " el framework de frontend es " + this.nameFrameworkFront);
		
		System.out.println(texto);
		
		
		/*
		System.out.println("El lenguaje de programación utilizado es " + this.getLenguajeProgramacion() 
		+ " el framework de backend es " + this.nameFrameworkBack 
		+  " el framework de frontend es " + this.nameFrameworkFront);
		*/
		
		
	}
	
	
	//GETTERS AND SETTERS
	

	public String getNameFrameworkBack() {
		return nameFrameworkBack;
	}


	public void setNameFrameworkBack(String nameFrameworkBack) {
		this.nameFrameworkBack = nameFrameworkBack;
	}


	public String getNameFrameworkFront() {
		return nameFrameworkFront;
	}


	public void setNameFrameworkFront(String nameFrameworkFront) {
		this.nameFrameworkFront = nameFrameworkFront;
	}
	
	
	//MÉTODO TOSTRING


	@Override
	public String toString() {
		return "AppWeb [nameFrameworkBack=" + nameFrameworkBack + ", nameFrameworkFront=" + nameFrameworkFront
				+ ", getLenguajeProgramacion()=" + getLenguajeProgramacion() + ", isPersistencia()=" + isPersistencia()
				+ ", getComplejidad()=" + getComplejidad() + ", getLineasCodigo()=" + getLineasCodigo()
				+ ", getCasosTest()=" + getCasosTest() + "]";
	}
	
	
	
}
