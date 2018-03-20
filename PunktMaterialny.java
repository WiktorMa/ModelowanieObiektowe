public class PunktMaterialny {


    protected int masa;      //<--Prywatne pole masy
    
    int x;
    int y;					
    double Moment;				
    double MomentSteiner;		
    
    
    		public int getmasa() {						//
    			return masa;								//
    		}											//
                                            			//<--Akcesory
    													//
    		public void setmasa(int masa) {				//
    			this.masa = masa;         				//
    		}										


    		public PunktMaterialny() {             		//<--Konstruktor domyslny
    			masa=1;							
    		}										

    
    		public PunktMaterialny(int m) {				//<--Konstruktor z parametrami
    			masa=m;							
    		}										

    
    		public double MomentGlowny(){				//<--Metoda obliczajaca moment glowny	
    			return Moment = 0;				
    		}										

    
    		public double MomentztwSteinera(int odleglosc) {				        			//<---Metoda obliczajaca					
    			return MomentSteiner= MomentGlowny() + masa * (odleglosc * odleglosc);	//    moment z tw Steinera
    		}																				
    
    		public int Wspolrzedna_x() {			
    			return x;
    		}
    
    		public int Wspolrzedna_y() {
    			return y;
    		}
    
    		public void OpisObiektu(){												//<--Metoda zwracajaca opis			
    			System.out.println("        Punkt Materialny");										
    			System.out.println("Masa: "+ masa);												
    			System.out.println("Wartosc Glownego Momentu Bezwladnosci: " + MomentGlowny());		
    			System.out.println("Moment Bezwładności Względem Nowej Osi: "+MomentSteiner);	
    			System.out.println("-----------------------------------------");					
    }																								
    		
}

