package Views;

import controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String empleado =new EmpleadoController().createEmpleado("Rengifo","Mariano","24","Masculino",2500);
		System.out.println(empleado);
		
		//String buscarEmpleado = new EmpleadoController().BuscarEmpleado(1);
		//System.out.println(buscarEmpleado);
				
		//String empleado= new EmpleadoController().EliminarEmpleado(1);
		//System.out.println(empleado);
				
		//ACTUALIZAR EMPLEADO
		//String empleado= new EmpleadoController().ActualizarEmpleado(1, "Guevara","Mariano");
		//System.out.println(empleado);
	}

}
