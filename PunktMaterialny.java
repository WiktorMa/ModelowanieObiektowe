public class PunktMaterialny {


    private int masa;      
    
    int x;
    int y;
    int Moment;				
    int MomentSteiner;		
    
    
    public int getmasa() {					
               return masa;			
    }										
                                            
    										
    public void setmasa(int masa) {		
                this.masa = masa;         
    }										


    public PunktMaterialny() {             
           masa=1;							
    }										

    
    public PunktMaterialny(int m) {			
           masa=m;							
    }										

    
    public int MomentGlowny(){		
               return Moment=0;				
    }										

    
    public int MomentztwSteinera(int odleglosc) {									
               return MomentSteiner= Moment + masa * (odleglosc * odleglosc);		
    }																				
    
    public int Wspolrzedna_x() {
    	return x;
    }
    
    public int Wspolrzedna_y() {
    	return y;
    }
    
    public void OpisObiektu(){																		
                System.out.println("        Punkt Materialny");										
                System.out.println("Masa: "+ masa);												
                System.out.println("Wartosc Glownego Momentu Bezwladnosci: " + MomentGlowny());		
                System.out.println("Moment Bezw≥adnoúci WzglÍdem Nowej Osi: "+MomentSteiner);	
                System.out.println("-----------------------------------------");					
    }																								

    
}

