



public class persona {
	private String nombre;
	private double sueldobase;
	private double porcentaje;
	

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public persona(String nombre, double sueldobase) {
		this.nombre = nombre;
		this.sueldobase  = sueldobase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double damesueldobase() {
		return sueldobase;
	}

	public void setSueldobase(double sueldobase) {
		this.sueldobase = sueldobase;
		
	}

	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", sueldobase=" + sueldobase + "]";
	}

	
	
	public void subeSueldo() {
		
		 double aumento = (sueldobase*porcentaje)/100;
		
		sueldobase += aumento;
		
	}
	
	
	
	

}
