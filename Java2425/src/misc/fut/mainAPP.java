package misc.fut;

import misc.fut.Modelo.FutbolistaModel;
import misc.fut.Controlador.FutbolistaControlador;
import misc.fut.Vista.FutbolistaVista;

public class mainAPP {

	    public static void main(String[] args) {
	        
	    	FutbolistaModel modelo = new FutbolistaModel();
	        
	    	FutbolistaVista vista = new FutbolistaVista();
	        
	    	FutbolistaControlador contr = new FutbolistaControlador(vista, modelo);
	        
	    }
	}