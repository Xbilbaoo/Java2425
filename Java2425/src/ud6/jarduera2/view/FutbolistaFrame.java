package ud6.jarduera2.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ud6.jarduera2.controller.FutbolistaController;
import ud6.jarduera2.controller.ddbb.FutbolistaConnect;

import javax.swing.JTextArea;

public class FutbolistaFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnExit;
	protected JTable futTable;

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
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

	}

	public JPanel showData(Object[][] data, String[] columns) {

		// Crear la ventana para mostrar los futbolistas
		
		JPanel panel = new JPanel();

		// Crear la tabla con los datos
		JTable futTable = new JTable(data, columns);
		JScrollPane scrollPane = new JScrollPane(futTable);
		

		// Agregar componentes
		panel.setLayout(new BorderLayout());
		panel.add(scrollPane, BorderLayout.CENTER);

		return panel;

	}

	public void searchPlayer() {

		FutbolistaFrame view = new FutbolistaFrame();
		FutbolistaConnect con = new FutbolistaConnect();
		view.setSize(600, 400);
		view.setTitle("Futbolista");
		view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		view.setContentPane(mainPanel);
		mainPanel.setLayout(new GridLayout(2, 0, 0, 0));
		JPanel searchPanel = new JPanel();
		searchPanel.setLayout(null);
		JPanel dataPanel = new JPanel();
		dataPanel.setLayout(new GridLayout(2, 0, 0, 0));
		
		
		JLabel lblID = new JLabel("Jokalariaren ID-a");
		lblID.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblID.setBounds(40, 100, 145, 15);
		
		JTextField tfID = new JTextField();
		tfID.setBounds(170, 98, 100, 20);
		
		JButton btnSearch = new JButton("Bilatu");
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	FutbolistaController futctrl = new FutbolistaController(view, con);
            	String[] columns = { "NAN", "Izena", "Abizena", "Soldata", "IDTaldea" };
            	
            	futTable = new JTable(futctrl.searchPlayerID(tfID.getText()), columns);
        		dataPanel.add(futTable);
            	
            	
        		
        		mainPanel.add(dataPanel);
        		
        		
            }
        });
		btnSearch.setBounds(290, 98, 85, 21);
		
		JButton btnExit = new JButton("ITZULI");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExit.setBounds(491, 332, 85, 21);
		btnExit.addActionListener(e1 -> view.dispose());
		
		
		
		searchPanel.add(lblID);
		searchPanel.add(tfID);
		searchPanel.add(btnSearch);
		mainPanel.add(searchPanel);
		
		dataPanel.add(futTable);
		dataPanel.add(btnExit);
		
		view.setVisible(true);
		
		
	}
}
