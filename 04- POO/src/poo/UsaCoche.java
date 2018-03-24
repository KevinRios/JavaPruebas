package poo;

public class UsaCoche {

	public static void main(String[] args) {

		// instanca 
		Coche mercedes = new Coche();
		
		System.out.println("Este cochen tiene " + mercedes.getRuedas() + " ruedas");
		
		
		mercedes.setRuedas(5);
		
		System.out.println("Ahora el mercedes tiene "+mercedes.getRuedas()+" ruedas");
		
		
	}

}
