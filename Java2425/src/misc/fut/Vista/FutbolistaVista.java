package misc.fut.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FutbolistaVista extends JFrame {
    private JMenuBar menuBar;
    private JMenu menuFutbolistas;
    private JMenuItem verTodosItem;
    private JMenuItem salirItem;
    
    private JTable tablaFutbolistas;
    private JButton volverButton;
    
    public FutbolistaVista() {
        // Configuración de la ventana principal
        setTitle("Ventana Principal");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crear el menú
        menuBar = new JMenuBar();
        menuFutbolistas = new JMenu("Futbolistas");
        verTodosItem = new JMenuItem("Ver Todos");
        salirItem = new JMenuItem("Salir");
        menuFutbolistas.add(verTodosItem);
        menuFutbolistas.add(salirItem);
        menuBar.add(menuFutbolistas);
        setJMenuBar(menuBar);
        
        // Hacer la ventana visible
        setVisible(true);
    }
    
    public void mostrarVentanaFutbolistas(Object[][] datos, String[] columnas) {
        // Crear la ventana para mostrar los futbolistas
        JFrame ventanaFutbolistas = new JFrame("Futbolistas");
        ventanaFutbolistas.setSize(600, 400);
        ventanaFutbolistas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Crear la tabla con los datos
        tablaFutbolistas = new JTable(datos, columnas);
        JScrollPane scrollPane = new JScrollPane(tablaFutbolistas);
        
        // Crear el botón de volver
        volverButton = new JButton("Volver");
        volverButton.addActionListener(e -> ventanaFutbolistas.dispose());
        
        // Agregar componentes
        ventanaFutbolistas.setLayout(new BorderLayout());
        ventanaFutbolistas.add(scrollPane, BorderLayout.CENTER);
        ventanaFutbolistas.add(volverButton, BorderLayout.SOUTH);
        
        // Hacer la ventana visible
        ventanaFutbolistas.setVisible(true);
    }

    public void setActionListener(ActionListener listener) {
        verTodosItem.addActionListener(listener);
        salirItem.addActionListener(listener);
    }
    
    // Obtener los elementos de la interfaz para el controlador
    public JMenuItem getVerTodosItem() {
        return verTodosItem;
    }
    
    public JMenuItem getSalirItem() {
        return salirItem;
    }
}