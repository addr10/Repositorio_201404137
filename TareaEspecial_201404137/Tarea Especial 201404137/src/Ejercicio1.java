
public class Ejercicio1 {

	public class Conductor(){
		int DPI;
		String tipo;
		float horas;
		float sueldo;
		switch (tipo){
		case "Personas":
			if (colectivo=true)
				sueldo=700+6*horas;
			else
				sueldo=700+5.50*horas;
		case "Mercancias":
			sueldo=700+5*horas+2*tonT;
		case "Mercancia Peligrosa":
			sueldo=700+5*horas+2*tonT+0.50*transpR;
		}
	}
	
	public class TipodeTransporte(){
		boolean personas;
		boolean mercancias;
		boolean mercanciaspeligrosas;
	}
	public class Personas(){
		boolean colectivo;
		int personastransportadas;
	}
	public class Mercancias(){
		int ton; //toneladas transportadas
	}
	public class MercanciasPeligrosas(){
		int ton; //toneladas transportadas
		int transportes; //transportes realizados
	}
}
