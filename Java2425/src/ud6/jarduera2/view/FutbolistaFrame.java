package ud6.jarduera2.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
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
		Icon icon = new ImageIcon("src/ud6/jarduera2/view/img/exit.png");
		JButton btnExit = new JButton(icon);
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
		
		Icon icon = new ImageIcon("src/ud6/jarduera2/view/img/exit.png");
		JButton btnExit = new JButton(icon);
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
	
	public void CreatePlayer() {
		
		FutbolistaFrame view = new FutbolistaFrame();
		FutbolistaConnect con = new FutbolistaConnect();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel lblID = new JLabel("NAN / NIE");
		lblID.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblID.setBounds(20, 50, 85, 15);
		panel.add(lblID);
		
		JTextField tfID = new JTextField();
		tfID.setBounds(130, 48, 96, 19);
		panel.add(tfID);
		tfID.setColumns(10);
		
		JLabel lblIzena = new JLabel("IZENA");
		lblIzena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIzena.setBounds(20, 90, 55, 15);
		panel.add(lblIzena);
		
		JTextField tfName = new JTextField();
		tfName.setBounds(130, 88, 96, 19);
		panel.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblAbizena = new JLabel("ABIZENA");
		lblAbizena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAbizena.setBounds(20, 130, 75, 15);
		panel.add(lblAbizena);
		
		JTextField tfAbizena = new JTextField();
		tfAbizena.setColumns(10);
		tfAbizena.setBounds(130, 128, 96, 19);
		panel.add(tfAbizena);
		
		JLabel lblSoldata = new JLabel("SOLDATA");
		lblSoldata.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSoldata.setBounds(260, 50, 80, 15);
		panel.add(lblSoldata);
		
		JTextField tfSoldata = new JTextField();
		tfSoldata.setColumns(10);
		tfSoldata.setBounds(400, 48, 96, 19);
		panel.add(tfSoldata);
		
		JLabel lblIdTaldea = new JLabel("TALDEAREN ID-A");
		lblIdTaldea.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIdTaldea.setBounds(260, 90, 135, 15);
		panel.add(lblIdTaldea);
		
		JTextField tfIDTaldea = new JTextField();
		tfIDTaldea.setBounds(400, 88, 96, 19);
		panel.add(tfIDTaldea);
		tfIDTaldea.setColumns(10);
		
		JButton btnCreate = new JButton("Jokalaria Sortu");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FutbolistaController futctrl = new FutbolistaController(view, con);
				
			}
		});
		btnCreate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCreate.setBounds(118, 200, 150, 25);
		panel.add(btnCreate);
		
		JButton btnErase = new JButton("Datuak Ezabatu");
		btnErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnErase.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnErase.setBounds(309, 200, 150, 25);
		panel.add(btnErase);
		
		Icon icon = new ImageIcon("src/ud6/jarduera2/view/img/exit.png");
		JButton btnExit = new JButton(icon);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(476, 328, 100, 25);
		panel.add(btnExit);
	}
}
