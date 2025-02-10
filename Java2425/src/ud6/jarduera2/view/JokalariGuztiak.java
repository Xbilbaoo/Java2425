package ud6.jarduera2.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ud6.jarduera2.ddbb.FutbolistaConnect;
import ud6.jarduera2.models.Futbolista;

public class JokalariGuztiak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JokalariGuztiak frame = new JokalariGuztiak();
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
	public JokalariGuztiak() {
		
		FutbolistaConnect futcon = null;
		JPanel panel = new JPanel(new BorderLayout());
		DefaultTableModel dtm = new DefaultTableModel();
		JTable table = new JTable(dtm);
		String[] columns_data = { "nan", "Izena", "Abizena", "Soldata", "IdTaldea"};
		JScrollPane scroll = new JScrollPane(table);

		for (String i : columns_data) {
			dtm.addColumn(i);
		}

		try {
			futcon = new FutbolistaConnect();
			for (Futbolista i : futcon.getFutbolistak()) {

				dtm.addRow(new Object[] { i.getNan(), i.getIzena(), i.getAbizena(), i.getSoldata(), i.getIdTaldea()});

			}
		} catch (SQLException e1) {

			e1.printStackTrace();
		}

		panel.add(scroll, BorderLayout.WEST);

		setContentPane(panel);
		
		JButton btnExit = new JButton("ITZULI");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		panel.add(btnExit, BorderLayout.SOUTH);
		setSize(600, 450);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

}
