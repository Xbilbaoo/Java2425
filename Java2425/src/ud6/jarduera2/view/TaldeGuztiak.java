package ud6.jarduera2.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ud6.jarduera2.ddbb.TaldeaConnect;
import ud6.jarduera2.models.Taldea;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class TaldeGuztiak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaldeGuztiak frame = new TaldeGuztiak();
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
	public TaldeGuztiak() {
		
		TaldeaConnect talcon = null;
		JPanel panel = new JPanel(new BorderLayout());
		DefaultTableModel dtm = new DefaultTableModel();
		JTable table = new JTable(dtm);
		String[] columns_data = { "idTaldea", "izena", "herria" };
		JScrollPane scroll = new JScrollPane(table);

		for (String i : columns_data) {
			dtm.addColumn(i);
		}

		try {
			talcon = new TaldeaConnect();
			for (Taldea i : talcon.getTaldeak()) {

				dtm.addRow(new Object[] { i.getIdTaldea(), i.getIzena(), i.getHerria() });

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
