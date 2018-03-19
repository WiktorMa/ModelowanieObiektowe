import java.util.ArrayList;

public class main {


	public static void main(String[] args) {
		

		PunktMaterialny a1 = new PunktMaterialny();    
		PunktMaterialny a2 = new PunktMaterialny(10);  

		a1.MomentztwSteinera(2);		
		a2.MomentztwSteinera(2);		


		a1.OpisObiektu();            
		a2.OpisObiektu();             

		a1.setmasa(3);               
		a1.MomentztwSteinera(10);
		a1.OpisObiektu();


		ArrayList<Integer> PunktMaterialny = new ArrayList<Integer>(); 

		for(int i=0; i<10; i++) {				  
			PunktMaterialny.add((i+1)*5);         
		}										  


		PunktMaterialny punkt = new PunktMaterialny();   


		for(int i=0; i<PunktMaterialny.size(); i++) {	
			punkt.setmasa(PunktMaterialny.get(i));		
			punkt.MomentztwSteinera(10);                
			punkt.OpisObiektu();						
		}												

//-----------------------------------
		
		
		Bryla bryla = new Bryla();  //<-------Stworzenie obiektu bryla
		bryla.OpisBryly();          //<-------Wyswietlenie opisu obiektu bryla

	}	
}


