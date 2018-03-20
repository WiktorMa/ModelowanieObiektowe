
public class Walec extends PunktMaterialny {

	
	private double promien;          //<---- Prywatne pole promien
	
		public double getpromien(){						//<---getter
			return promien;						     	//
		}                                                //
														//<---Akcesory do kontroli danych
		public void setpromien(int promien) {     		//	  
			this.promien = promien; 						//	  
		}												//<---setter
	
		public double MomentGlowny() {					//<------Przeciazona metoda bez parametrow obliczajaca
			return Moment=masa*promien*promien;			// 					glowny moment bezwladnosci
		}												     		
	
		public Walec() {				     //<----Konstruktor Domyslny
			super();                     
			promien = 1;					
		}								
	
		public Walec(int m,int p) {			//<-----Konstruktor z parametrami z wykorzystaniem superklasy
			super(m);						
			promien = p;						
		}									
	
		public void OpisObiektu() {						//<------Przeciazona metoda zwracajaca staly opis obiektu
		
			System.out.println("		Walec");	
			System.out.println("Promien: "+ promien);	
			System.out.println("Masa: "+ masa);																							
			System.out.println("Wartosc Glownego Momentu Bezwladnosci: " + MomentGlowny());	
			System.out.println("Moment Bezlwadności Względem Nowej Osi: "+ MomentSteiner);	
			System.out.println("-----------------------------------------");		
		}
	
}


