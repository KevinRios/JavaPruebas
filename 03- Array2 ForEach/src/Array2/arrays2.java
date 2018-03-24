package Array2;

public class arrays2 {

	public static void main(String[] args) {

		String[] paises = { "Argentina", "Noruega", "Finlandia", "Polonia", "Dinamarca" };

		for (String elemento : paises) {

			System.out.println("Pais - " + elemento);
		}

		System.out.println("--------------");
		System.out.println("--------------");
		System.out.println("--------------");

		int[] otraMatriz = new int[20];

		for (int i = 0; i < otraMatriz.length; i++) {
			otraMatriz[i]= (int)Math.round(Math.random()*100);
		}
		
		for (int elem : otraMatriz) {
			System.out.println(elem);
			
		}

	}

}
