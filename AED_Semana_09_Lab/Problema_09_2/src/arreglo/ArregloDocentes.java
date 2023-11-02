package arreglo;

import clase.Docente;
import java.util.ArrayList;

public class ArregloDocentes {
	
	private ArrayList <Docente> doc;
	
	public ArregloDocentes() {
		doc = new ArrayList <Docente> ();
		adicionar(new Docente(123, 15, "Mateo", 30.6));
		adicionar(new Docente(321, 10, "Jheremy", 35.0));
		adicionar(new Docente(231, 12, "Eustaquio", 29.0));
		adicionar(new Docente(132, 11, "Pepe", 32.0));
		adicionar(new Docente(678, 20, "Paco", 40.3));
		adicionar(new Docente(876, 8, "Ernesto", 28.7));
		adicionar(new Docente(456, 18, "Pablo", 39.8));
		adicionar(new Docente(986, 30, "Juan", 27.4));
	}
	
	public void adicionar(Docente x) {
		doc.add(x);
	}
	
	public int tamanio() {
		return doc.size();
	}
	
	public Docente obtener(int i) {
		return doc.get(i);
	}

	public double Sueldopromedio() {
		double suma = 0;
		for(int i = 0; i<tamanio(); i++) {
			suma += obtener(i).sueldo();
		}
		return suma/tamanio();
	}
	
	public double sueldoMayor() {
		double mayor = 0;
		for(int i = 0; i<tamanio(); i++) {
			if(obtener(i).sueldo() > mayor) {
				mayor = obtener(i).sueldo();
			}
		}
		return mayor;
	}
	
	public double sueldoMenor() {
		double menor = obtener(0).sueldo();
		for(int i = 1; i<tamanio(); i++) {
			if(obtener(i).sueldo() < menor) {
				menor = obtener(i).sueldo();
			}
		}
		return menor;
	}
	
	public double tarifaMayor() {
		double tMayor = 0;
		for(int i = 0; i<tamanio(); i++) {
			if(obtener(i).getTarifa() > tMayor) {
				tMayor = obtener(i).getTarifa();
			}
		}
		return tMayor;
	}
	
	public double tarifaMenor() {
		double tMenor = obtener(0).getTarifa();
		for(int i = 0; i<tamanio(); i++) {
			if(obtener(i).getTarifa() < tMenor) {
				tMenor = obtener(i).getTarifa();
			}
		}
		return tMenor;
	}

}