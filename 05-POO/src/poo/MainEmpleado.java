package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class MainEmpleado {

	public static void main(String[] args) {

	/*  Empleado empl1 = new Empleado("qwerty", 30000, 2000, 1, 29);
		Empleado empl2 = new Empleado("asdfgh", 60000, 1990, 4, 8);
		Empleado empl3 = new Empleado("asdfgh", 20000, 2011, 8, 11);
	*/		
		

	/*	empl1.setAumentoSueldo(6);
		empl2.setAumentoSueldo(10);
		empl3.setAumentoSueldo(3);
	*/	
		
		//System.out.println("Nombre: "+empl1.getNombre()+ " Sueldo: "+empl1.getSueldo()+" Ingreso:"+ empl1.getAltaEmpleado());
		//System.out.println("Nombre: "+empl2.getNombre()+ " Sueldo: "+empl2.getSueldo()+" Ingreso:"+ empl2.getAltaEmpleado());
		//System.out.println("Nombre: "+empl3.getNombre()+ " Sueldo: "+empl3.getSueldo()+" Ingreso:"+ empl3.getAltaEmpleado());
		
		Empleado [] misEmpleados = new Empleado[3];
		
		misEmpleados[0] = new Empleado("qwerty", 30000, 2000, 1, 29);
		misEmpleados[1] = new Empleado("asdfgh", 60000, 1990, 4, 8);
		misEmpleados[2] = new Empleado("asdfgh", 20000, 2011, 8, 11);
		
		misEmpleados[0] .setAumentoSueldo(6);
		misEmpleados[1].setAumentoSueldo(10);
		misEmpleados[2].setAumentoSueldo(3);
		
		for (Empleado empleado : misEmpleados) {
			System.out.println("Nombre: "+empleado.getNombre()+ " Sueldo: "+empleado.getSueldo()+" Ingreso:"+ empleado.getAltaEmpleado());
				
		}
	}

}





class Empleado{
	
	//atributos
	private String nombre;
	private double sueldo;
	private Date altaEmpleado;

	// getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setAumentoSueldo(double porcentaje) {
		double aumento= sueldo*porcentaje/100;
		sueldo= sueldo+aumento;
	}
	
	public Date getAltaEmpleado() {
		return altaEmpleado;
	}
	public void setAltaEmpleado(Date altaEmpleado) {
		this.altaEmpleado = altaEmpleado;
	}
	


	//constructor que inicia un objeto de tipo empleado 
	public Empleado(String nomb, double suel, int anio, int mes, int dia){
		
		nombre=nomb;
		sueldo=suel;
		GregorianCalendar calendario= new GregorianCalendar(anio, mes-1, dia);
		altaEmpleado=calendario.getTime();
		
		
	}
	
}
