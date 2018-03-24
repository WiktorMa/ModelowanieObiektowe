import java.util.Scanner;		//<---Biblioteka potrzebna do odczytywania z klawiatury


public class main {
	
	
    			private static int x,y,z,liczba,a;		//<---Stworzenie pól potrzebnych w dalszej częśći kodu
    													//    x-masa , y-promien/dlugosc , z-odleglosc od osi
    
	  public static int Klawiatura(Scanner in) {		//<--Metoda umozliwiajaca odczyt z klawiatury
		  											//   zwracajaca liczbe wpisana (a)
		  		while (!in.hasNextInt()) {
		  			in.next();					//<--Petla majaca na celu zapobieganie chrashowaniu sie
		  		}								//   programu po wpisaniu czegosc innego niz liczba
		return a = in.nextInt();
	  }
	    
	  
	public static void wyborbryly() {			//<---Metoda wypisujaca podstawowe menu wyboru bryly
			
		System.out.println("	Wybierz Bryle");
		System.out.println("");
		System.out.println("	  1.Walec");
		System.out.println("	  2.Kula");
		System.out.println("	  3.Pret");
		System.out.println("");
		System.out.println("	  0.Zakoncz Program");
		System.out.println("-----------------------------------------");		
			 
	}
	
	public static void main(String[] args){
			
					Scanner klawisz = new Scanner(System.in);  //<---Stworzenie obiektu klawisz
	        
	       do{
	    	   			wyborbryly();											     	//<--Wyswietlnie menu
	    	   			liczba=Klawiatura(klawisz);  								    //<--Podstawinie pod "liczba" przycisku wcisnietego na klawiaturze
	    	   			if(liczba==1||liczba==2||liczba==3) {							//<--Instrukcja if zapobiegajaca wypisaniu w terminalu ponizszego 
	    	   																			//   tekstu po wpisaniu cyfry innej niz 1,2 lub 3	
	    	   			System.out.println("Wpisz odleglosc od osi obrotu do srodka masy bryly:");
	    	   			z = Klawiatura(klawisz);											//<--Podstawienie pod "z" przycisku wcisnietego na klawiaturze
	    	   			System.out.println("Wpisz mase:");
					x = Klawiatura(klawisz);											//<---Jak wyzej
					
					if(liczba==2) System.out.println("Wpisz dlugosc pręta:");  						//<--Zastosowanie 2 if-ow umozliwia wypisanie roznych 
			        if(liczba==1 || liczba==3 ) System.out.println("Wpisz promien bryly:");  			//    tekstow dla preta i dla walca,kuli
			        y = Klawiatura(klawisz);
					System.out.println("-----------------------------------------");		
	    	   			}
	 
	            switch(liczba){		//<--Instrukcja wyboru switch
	          
	            			case 1:     		//<--Po spelnieniu warunku (liczba=1) wykonaja sie linijki kodu zawarte w case 1
	            			
	            				Walec walec = new Walec(x, y);	//<--Stworzenie obiektu walce z klasy Walec
	            				walec.MomentztwSteinera(z);		//<--Obliczenie MomentuztwSteinera dla obiektu walec
	            				walec.OpisObiektu();      		//<--Wyswietlenie opisu dla obiektu walec
	            				break;							//<--Koniec przypadku
	 
	            			case 2:                	
	            				
	            				Pret pret = new Pret(x,y);
	            				pret.MomentztwSteinera(z);
	            				pret.OpisObiektu();      
	            				break;
	            												//<---Dla case 2 i 3 tak samo jak dla case 1
	            			case 3:
	            			  
	            				Kula kula = new Kula(x,y);
	            				kula.MomentztwSteinera(z);
	            				kula.OpisObiektu();
	            				break; 	            		
	            }
	            	 	       
	        }while(liczba!=0);  		//<---Warunek pętli wyswietlanego programu, dla liczba=0 pętla kończy się
	       
	       System.out.println("	Koniec");  //<--Wypisaie informacji o zakonczeniu programu
	     
	    }     
}
