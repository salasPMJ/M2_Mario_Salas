package clases;

public abstract class AppSoftware {
	
	private String lenguajeProgramacion;
	private boolean persistencia;
	private float complejidad;
	private long lineasCodigo;
	private int casosTest;	
	
	
	//CONSTRUCTOR
	
	
	public AppSoftware(String lenguajeProgramacion, boolean persistencia, float complejidad, long lineasCodigo,
			int casosTest) {
		super();
		this.lenguajeProgramacion = lenguajeProgramacion;
		this.persistencia = persistencia;
		this.complejidad = complejidad;
		this.lineasCodigo = lineasCodigo;
		this.casosTest = casosTest;
	}
	
	
	//MÉTODOS


	public double calcularCalidad() {
		
		int base = 100;
		double result = 0;
		
		if(this.complejidad >= 11 && this.complejidad <= 20) 
		{
			result = base - 10;
		}		
		if (this.complejidad >= 21 && this.complejidad <= 50) {
			
			result = base - 30;
			
		}
		if (this.complejidad >= 50) {
			
			result = base - 50;
			
		}
		if(this.lineasCodigo > 50000 && this.casosTest < 3000) {
			
			result = base - 20;
			
		}		
		
		return result;
	}
	
	
	public abstract void imprimirStack();
	

	//METODOS GETERS AND SETTERS
	

	public String getLenguajeProgramacion() {
		return lenguajeProgramacion;
	}


	public void setLenguajeProgramacion(String lenguajeProgramacion) {
		this.lenguajeProgramacion = lenguajeProgramacion;
	}


	public boolean isPersistencia() {
		return persistencia;
	}


	public void setPersistencia(boolean persistencia) {
		this.persistencia = persistencia;
	}


	public float getComplejidad() {
		return complejidad;
	}


	public void setComplejidad(float complejidad) {
		this.complejidad = complejidad;
	}


	public long getLineasCodigo() {
		return lineasCodigo;
	}


	public void setLineasCodigo(long lineasCodigo) {
		this.lineasCodigo = lineasCodigo;
	}


	public int getCasosTest() {
		return casosTest;
	}


	public void setCasosTest(int casosTest) {
		this.casosTest = casosTest;
	}
	
	
	//METODO TOSTRING


	@Override
	public String toString() {
		return "AppSoftware [lenguajeProgramacion=" + lenguajeProgramacion + ", persistencia=" + persistencia
				+ ", complejidad=" + complejidad + ", lineasCodigo=" + lineasCodigo + ", casosTest=" + casosTest + "]";
	}
	
	
	
	
	
	
	

}
