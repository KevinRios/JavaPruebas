package array1;

public class pruebaArray {

	public static void main(String[] args) {

		int total= 5 ;
		int [] primerArray = new int[total];
		
		
		primerArray [0] = 15;
		primerArray [1] = 84;
		primerArray [2] = 66;
		primerArray [3] = 123;
		primerArray [4] = 45678;
			
		for (int i = 0; i < primerArray.length; i++) {
			System.out.println("Valor del indice "+i+" -- "+primerArray[i]);
		}
	
		
		
		System.out.println("----------------------------");
		System.out.println("----------------------------");
		System.out.println("----------------------------");
		
		
		
		
		int[] otroArray = {53,6,9,8,7,4,11,22,55,88,996,63,62};
		
		for (int i = 0; i < otroArray.length; i++) {
			System.out.println("Valor del indice "+i+" -- "+otroArray[i]);
		}
		
		
		
	}

}
