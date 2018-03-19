import java.util.ArrayList;

public class Bryla {      //<---Stworzenie klasy Bryla
			
	ArrayList<Integer> MASA = new ArrayList<Integer>();
	ArrayList<Integer> X = new ArrayList<Integer>();     //<----- Stworzenie tablicy mas i wspolrzednych punkow
	ArrayList<Integer> Y = new ArrayList<Integer>(); 
	
	int Suma_mas;	//<---Stworzenie zmiennej bedaca mianownikiem wzoryuna srodek masy
	
	int x;      //<---Stworzenie zmiennych bedacymi licznikiem wzoru na srodek masy
	int y;
	
	double SrodekMasy_x;	   //<-----Stworzenie zmiennych wykorzystanych do przechowania wyniku wzoru na srodek masy
	double SrodekMasy_y; 
	
	ArrayList<Double> MX = new ArrayList<Double>();  //<-----Stworzenie tablicy momentow na osiach x i y
	ArrayList<Double> MY = new ArrayList<Double>();
	 
	double Moment_gl;							//<---Stworzenie zmiennej dla momemntu glownego
	
	public Bryla() {      //<----Stworzenie metody obliczajacej potrzebne dane
		
			for(int i=0; i<10; i++) {
					MASA.add((i+1)*5);
					X.add(i*2);                      //<----Wypelnienie tablicy mas,x i y danymi (wielokrotnosci
					Y.add(i*3);                      //     roznych liczb)(mozna bylo uzyc liczb losowych)
					x = x + X.get(i) * MASA.get(i);
					y = y + Y.get(i) * MASA.get(i);    //<-Dodawanie iloczynu masy i wspolrzednej kazdego punktu do licznika
					Suma_mas = Suma_mas + MASA.get(i); //<-Dodawanie mas kazdego punktu do mianownika
			}
			
			SrodekMasy_x = x/Suma_mas;   //<---Wzor na srodek masy osobno dla kazdej osi
			SrodekMasy_y = y/Suma_mas;
			
			for(int i=0; i<MASA.size(); i++) {
				
				MX.add( (MASA.get(i)*((SrodekMasy_x - X.get(i))*(SrodekMasy_x - X.get(i))))); //<---Dodadnie wartosci do tablicy momentow na osi X kozystajac ze wzoru na moment
				MY.add( (MASA.get(i)*((SrodekMasy_y - Y.get(i))*(SrodekMasy_y - Y.get(i))))); //<---Dodadnie wartosci do tablicy momentow na osi Y kozystajac ze wzoru na moment
				Moment_gl = Moment_gl + (Math.sqrt(MX.get(i)*MX.get(i) + MY.get(i)*MY.get(i)));  //<---Obliczenie momentu glownego wzgledem srodka masy z powyzszych danych
			}
		}
	public void OpisBryly() {   //<---Stworzenie metody wyswietlajacej dane kazdego punktu i moment calej bryly
		
		for(int i=0; i<MASA.size(); i++) {
				System.out.println("PUNKT " + (i+1) + " o masie: "+ MASA.get(i));
				System.out.println("WSPOLRZEDNE punktu x=" + X.get(i) + ", y=" + Y.get(i));
				System.out.println("WSPOLRZEDNE srodka masy x=" + SrodekMasy_x + ", y=" + SrodekMasy_y + ""); 
				System.out.println("MOMENT wzgledem x: "+MX.get(i) );
				System.out.println("MOMENT wzgledem y: "+MY.get(i) );
				System.out.println("------------------------------------------------------------");
	}
				System.out.println("MOMENT CALEJ BRYLY: " + Moment_gl);
	}
}

