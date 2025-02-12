package misc.fut.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import misc.fut.Modelo.FutbolistaModel;
import misc.fut.Modelo.Futbolista;
import misc.fut.Vista.FutbolistaVista;

public class FutbolistaControlador {
    private FutbolistaVista vista;
    private FutbolistaModel modelo;

    public FutbolistaControlador(FutbolistaVista vista, FutbolistaModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.setActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == vista.getVerTodosItem()) {
                    mostrarFutbolistas();
                } else if (e.getSource() == vista.getSalirItem()) {
                    System.exit(0);
                }
            }
        });
    }

    public void mostrarFutbolistas() {
        List<Futbolista> futbolistas = modelo.obtenerFutbolistas();
        String[] columnas = {"ID", "Nombre"};
        Object[][] datos = new Object[futbolistas.size()][2];
        
        for (int i = 0; i < futbolistas.size(); i++) {
            datos[i][0] = futbolistas.get(i).getDni();
            datos[i][1] = futbolistas.get(i).getNombre();
        }
        
        vista.mostrarVentanaFutbolistas(datos, columnas);
    }
}

