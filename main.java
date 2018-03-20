import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		Walec w1 = new Walec(2, 3);			//
		Kula k1 = new Kula(2, 3);			//<--Stworzenie obiektow klas pochodnych za pomoca konstruktorow
		Pret p1 = new Pret(2, 4);			//		 z parametrami (dla walca, kuli i preta)
		
		
		w1.OpisObiektu();					//
		k1.OpisObiektu();					//<---Wyswietlenie opisu powyzszych obiektow
		p1.OpisObiektu();					//
		

		Walec walec[] = new Walec[5];	
		Kula kula[] = new Kula[walec.length];	 //<--Stworzenie tablicy obiektow roznych klas pochodnych
		Pret pret[] = new Pret[walec.length];	
		
		for(int i=0; i<walec.length; i++) {							//<---Wyswietlanie na konsoli informacji
																	//    zawierajacej opis, dane, wartosci
				walec[i]= new Walec( (2*i)%3+1 , (3*i)%5+1);			//    glownych momentow bezwladnosci i
				walec[i].MomentztwSteinera(3);						//    momentow bezwladnosci wzgledem nowej
				walec[i].OpisObiektu();	  							//    osi dla wszystkich obiektow w tablicy
																	//    z wykorzystanem petli for
				kula[i]= new Kula( (2*i)%6+1 , (5*i)%4+1);        
				kula[i].MomentztwSteinera(3);
				kula[i].OpisObiektu();	  
				
				pret[i]= new Pret( (4*i)%8+1 , (3*i)%7+1);
				pret[i].MomentztwSteinera(3);
				pret[i].OpisObiektu();	  
		}				
		
	}
	
}


