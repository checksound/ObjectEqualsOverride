package laboratorio.negoziovini;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Negozio {

		private Vector<CassaVini> magazzino = new Vector<CassaVini>();
		
		public void addCassaVino(String nomeVino, int annata){
			
			CassaVini cassaVino = new CassaVini(nomeVino, annata);
			magazzino.add(cassaVino);
		}
		
		public int getNumCasseTotal() {
			return magazzino.size();
		}
		
		public CassaVini getCassaVino(String nomeVino) {
			CassaVini cassaVino = new CassaVini(nomeVino, -1);
			int index = magazzino.indexOf(cassaVino);

			if(index == -1) {
				return null;
			}
			
			return magazzino.remove(index);
		}
		
		
		
		public CassaVini getCassaVino(String nomeVino, int annata) {
			CassaVini cassaVino = new CassaVini(nomeVino, -1);
			
			int startIndex = 0;
			int endIndex = magazzino.size();
			
			while(true) {
				int index = magazzino.indexOf(cassaVino, startIndex);
				
				if(index == -1) {
					return null;
				}
				
				CassaVini cassaVinoMagazzino = magazzino.get(index);
				
				if(cassaVinoMagazzino.getAnnata() == annata) {
					
					return  magazzino.remove(index);
				}
				
				startIndex = index + 1;
				
				if(startIndex == endIndex) {
					return null;
				}
			}
			
			
		}
		
		public int countCassaVini(String nomeVino) {
			
			CassaVini cassaVino = new CassaVini(nomeVino, -1);
			
			int counter = 0;
			
			int startIndex = 0;
			int endIndex = magazzino.size();
			
			while(true) {
				int index = magazzino.indexOf(cassaVino, startIndex);
				
				if(index == -1) {
					break;
				}
				
				counter++;
				
				startIndex = index + 1;
				
				if(startIndex == endIndex) {
					break;
				}
			}
			
			return counter;
		}
		
		public int countCassaVini(String nomeVino, int annata) {
			
			CassaVini cassaVino = new CassaVini(nomeVino, -1);
			
			int counter = 0;
			
			int startIndex = 0;
			int endIndex = magazzino.size();
			
			while(true) {
				int index = magazzino.indexOf(cassaVino, startIndex);
				
				if(index == -1) {
					break;
				}
				
				CassaVini cassaVinoMagazzino = magazzino.get(index);
				
				if(cassaVinoMagazzino.getAnnata() == annata) {
					
					counter++;
				}
				
				startIndex = index + 1;
				
				if(startIndex == endIndex) {
					break;
				}
			}
			
			return counter;
		}
		
		public List<CassaVini> findAllCassaVini(String nomeVino) {
			List<CassaVini> listCassaVini = new ArrayList<>();
			
			
			return listCassaVini;
		}
		
		public List<CassaVini> findAllCassaVini(String nomeVino, int year) {
			List<CassaVini> listCassaVini = new ArrayList<>();
			
			
			return listCassaVini;
		}
		
}
