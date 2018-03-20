
public class Pret extends PunktMaterialny {

	
	private double dlugosc;								//<---- Prywatne pole dlugosc
	
		public double getdlugosc(){						//<---getter
			return dlugosc;								//
		}												//
														//<---Akcesory do kontroli danych	
		public void setdlugosc(int dlugosc) {			//
			this.dlugosc = dlugosc;						//
		}												//<---setter
	
		public double MomentGlowny() {						//<------Przeciazona metoda bez parametrow obliczajaca
			return Moment=masa*dlugosc*dlugosc/12;			// 					glowny moment bezwladnosci
		}
	
		public Pret() {									//<----Konstruktor Domyslny
			super();
			dlugosc = 1;
		}
	
		public Pret(int m,int d) {							//<-----Konstruktor z parametrami z wykorzystaniem superklasy
			super(m);
			dlugosc = d;
		}
		
		public void OpisObiektu() {						//<------Przeciazona metoda zwracajaca staly opis obiektu
		
			System.out.println("		Pret");	
			System.out.println("Dlugosc: "+ dlugosc);	
			System.out.println("Masa: "+ masa);																							
			System.out.println("Wartosc Glownego Momentu Bezwladnosci: " + MomentGlowny());	
			System.out.println("Moment Bezlwadności Względem Nowej Osi: "+ MomentSteiner);
			System.out.println("-----------------------------------------");		
		}
		
}
