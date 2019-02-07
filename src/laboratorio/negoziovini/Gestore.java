package laboratorio.negoziovini;

/**
 * Classe Gestore 
 * 
 * @author cam
 *
 */
public class Gestore {
	
	private static void testGetCassaVinoByName() {
		
		Negozio negozio = new Negozio();
		
		negozio.addCassaVino("Lambrusco", 2000);
		
		CassaVini cassaMagazzino = negozio.getCassaVino("Lambrusco");
		
		System.out.println("TROVATO: " + cassaMagazzino);
		
		int numCasse = negozio.getNumCasseTotal();
		
		System.out.println(numCasse);
		
	}
	
	private static void testGetCassaVinoByNameAndYear() {
		
		Negozio negozio = new Negozio();
		
		negozio.addCassaVino("Lambrusco", 2000);
		negozio.addCassaVino("Grignolino", 1999);
		negozio.addCassaVino("Lambrusco", 2007);
		
		CassaVini cassaMagazzino = negozio.getCassaVino("Lambrusco", 2007);
		
		System.out.println("TROVATO: " + cassaMagazzino);
		
		int numCasse = negozio.getNumCasseTotal();
		
		System.out.println(numCasse);
		
	}

	public static void main(String[] args) {
		
		
		testGetCassaVinoByName();
		
		testGetCassaVinoByNameAndYear();
		

	}

}
