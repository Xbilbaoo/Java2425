package ud6.jarduera2.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import ud6.jarduera2.controller.FutbolistaController;
import ud6.jarduera2.models.ddbb.FutbolistaConnect;

public class FutbolistaFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
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
		JButton btnExit = new JButton("ITZULI");
		btnExit.setBounds(491, 332, 85, 21);
		btnExit.addActionListener(e1 -> dispose());
		panel.add(btnExit, BorderLayout.SOUTH);
		

		return panel;

	}

	public void searchPlayer() {

		FutbolistaFrame view = new FutbolistaFrame();
		FutbolistaConnect con = new FutbolistaConnect();
		String[] columns = { "NAN", "Izena", "Abizena", "Soldata", "IDTaldea" };
		view.setSize(600, 400);
		view.setTitle("Futbolista");
		view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		view.setContentPane(mainPanel);
		mainPanel.setLayout(new GridLayout(2, 0, 0, 0));
		JPanel searchPanel = new JPanel();
		searchPanel.setLayout(null);
		JPanel dataPanel = new JPanel();
		dataPanel.setLayout(new BorderLayout());

		DefaultTableModel tableModel = new DefaultTableModel() {
			String[] columns = { "NAN", "Izena", "Abizena", "Soldata", "IDTaldea" };

			public int getColumnCount() {

				return columns.length;

			}

			public String getColumnName(int index) {

				return columns[index];

			}

		};

		JLabel lblID = new JLabel("Jokalariaren ID-a");
		lblID.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblID.setBounds(40, 100, 145, 15);

		JTextField tfID = new JTextField();
		tfID.setBounds(170, 98, 100, 20);

		JTable futTable = new JTable(tableModel);

		JButton btnExit = new JButton("ITZULI");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExit.setBounds(491, 332, 85, 21);
		btnExit.addActionListener(e1 -> view.dispose());

		JButton btnSearch = new JButton("Bilatu");
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FutbolistaController futctrl = new FutbolistaController(view, con);
				
				tableModel.addRow(futctrl.searchPlayerID(tfID.getText()));
				futTable.setModel(tableModel);
				JScrollPane scroll = new JScrollPane(futTable);
				
				dataPanel.add(scroll, BorderLayout.CENTER);
				dataPanel.add(btnExit, BorderLayout.SOUTH);

				mainPanel.add(dataPanel);

			}
		});
		btnSearch.setBounds(290, 98, 85, 21);

		searchPanel.add(lblID);
		searchPanel.add(tfID);
		searchPanel.add(btnSearch);
		mainPanel.add(searchPanel);

		dataPanel.add(futTable, BorderLayout.CENTER);
		dataPanel.add(btnExit, BorderLayout.SOUTH);
		mainPanel.add(dataPanel);

		view.setVisible(true);

	}
}
