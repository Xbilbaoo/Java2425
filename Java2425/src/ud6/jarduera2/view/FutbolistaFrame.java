package ud6.jarduera2.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class FutbolistaFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable futTable;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FutbolistaFrame frame = new FutbolistaFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FutbolistaFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
	}
	
	 public void showAllPlayers(Object[][] datos, String[] columnas) {
	        // Crear la ventana para mostrar los futbolistas
	        JFrame ventanaFutbolistas = new JFrame("Futbolistas");
	        ventanaFutbolistas.setSize(600, 400);
	        ventanaFutbolistas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        
	        // Crear la tabla con los datos
	        futTable = new JTable(datos, columnas);
	        JScrollPane scrollPane = new JScrollPane(futTable);
	        
	        // Crear el botón de volver
	        btnExit = new JButton("Itzuli");
	        btnExit.addActionListener(e -> ventanaFutbolistas.dispose());
	        
	        // Agregar componentes
	        ventanaFutbolistas.setLayout(new BorderLayout());
	        ventanaFutbolistas.add(scrollPane, BorderLayout.CENTER);
	        ventanaFutbolistas.add(btnExit, BorderLayout.SOUTH);
	        
	        // Hacer la ventana visible
	        ventanaFutbolistas.setVisible(true);
	    
	 }

	public void setActionListener(ActionListener listener) {
		
		
		
	}

}
