package clases;
import java.util.Arrays;

public class AppMobile extends AppSoftware {
	
	private boolean tecnologiaHibrida;
	private String[] permisos;
	
	//CONSTRUCTOR

	public AppMobile(boolean tecnologiaHibrida, String[] permisos, String lenguajeProgramacion, boolean persistencia, float complejidad, long lineasCodigo,
			int casosTest) {
		
		super(lenguajeProgramacion, persistencia, complejidad, lineasCodigo, casosTest);
		
		this.tecnologiaHibrida = tecnologiaHibrida;		
		this.permisos = permisos;
		
	}
	
	//MÉTODOS

	@Override
	public void imprimirStack() {
		
		if(tecnologiaHibrida == true) {
			System.out.println("El lenguaje de programación utilizado es " + this.getLenguajeProgramacion() 
			+ " , utiliza tecnología híbrida");
		}
		else {
			System.out.println("El lenguaje de programación utilizado es " + this.getLenguajeProgramacion() 
			+ " , utiliza tecnología nativa");
		}		
		
	}
	
	//GETTERS AND SETTERS

	public boolean isTecnologiaHibrida() {
		return tecnologiaHibrida;
	}

	public void setTecnologiaHibrida(boolean tecnologiaHibrida) {
		this.tecnologiaHibrida = tecnologiaHibrida;
	}

	public String[] getPermisos() {
		return permisos;
	}

	public void setPermisos(String[] permisos) {
		this.permisos = permisos;
	}
	
	//METODO TOSTRING()

	@Override
	public String toString() {
		return "AppMobile [tecnologiaHibrida=" + tecnologiaHibrida + ", permisos=" + Arrays.toString(permisos)
				+ ", getLenguajeProgramacion()=" + getLenguajeProgramacion() + ", isPersistencia()=" + isPersistencia()
				+ ", getComplejidad()=" + getComplejidad() + ", getLineasCodigo()=" + getLineasCodigo()
				+ ", getCasosTest()=" + getCasosTest() + "]";
	}
		

}
