package arreglo;

import clase.Factura;
import java.util.ArrayList;

public class ArregloFacturas {

	private ArrayList <Factura> fac;
	
	public ArregloFacturas() {
		fac = new ArrayList <Factura> ();
		adicionar(new Factura("12345", "Claro", 15, 14.2));
		adicionar(new Factura("67876", "Nike", 16, 17.3));
		adicionar(new Factura("45654", "Google", 10, 16.3));
		adicionar(new Factura("24345", "Pepsi", 12, 10.0));
		adicionar(new Factura("98988", "Samsung", 20, 19.5));
		adicionar(new Factura("54646", "Apple", 9, 20.4));
		adicionar(new Factura("76868", "Entel", 8, 11.0));
		adicionar(new Factura("87412", "Movistar", 23, 16.8));
	}
	
	public void adicionar(Factura x) {
		fac.add(x);
	}
	
	public int tamanio() {
		return fac.size();
	}
	
	public Factura obtener(int i) {
		return fac.get(i);
	}
	
	public double sumaImporteFacturado() {
		double suma = 0;
		for(int i = 0; i<tamanio(); i++) {
			suma += obtener(i).importeFacturado();
		}
		return suma;
	}
	
	public double promedioImporteFacturado() {
		return sumaImporteFacturado() / tamanio();
	}
	
	public double menorImporteFacturado() {
		double menor = obtener(0).importeFacturado();
		for(int i = 1; i<tamanio(); i++) {
			if(obtener(i).importeFacturado() < menor) {
				menor = obtener(i).importeFacturado();
			}
		}
		return menor;
	}
	
	public double mayorImporteFacturado() {
		double mayor = 0;
		for(int i = 0; i<tamanio(); i++) {
			if(obtener(i).importeFacturado() > mayor) {
				mayor = obtener(i).importeFacturado();
			}
		}
		return mayor;
	}
	
	public String empresa() {
		for(int i = 0; i<tamanio(); i++) {
			if(obtener(i).importeFacturado() < promedioImporteFacturado()) {
				return obtener(i).getEmpresa();
			}
		}
		return null;
	}
	
}