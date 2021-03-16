
public class Personal {
	
	public Personal (String nombre, String sueldobase) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persona [] Personal = new persona[4];
		Personal [0] = new Boss ("Oscar Sanchez",60000);
		Personal [1] = new manager ("Isabel Torres",50000);
		Personal [2] = new Empleado ("Maite Rodríguez",40000);
		Personal [3] = new voluntario ("Edison Juarez", 20000);
		
	for (persona e: Personal) {
		e.subeSueldo();
		System.out.println("Con la subida de sueldo, "+
		e.getNombre()+ " tiene un sueldo de "+ e.damesueldobase()+ " euros");
	}
	
	}
}
