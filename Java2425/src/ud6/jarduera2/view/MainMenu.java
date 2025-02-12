package ud6.jarduera2.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ud6.jarduera2.controller.ddbb.FutbolistaConnect;
import ud6.jarduera2.controller.ddbb.TaldeaConnect;
import ud6.jarduera2.controller.FutbolistaController;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MainMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 5, 5));

		JButton btnOption1 = new JButton("1. Jokalariak Ikusi");
		btnOption1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				FutbolistaConnect futcon = new FutbolistaConnect();
				FutbolistaFrame futFrame = new FutbolistaFrame();
				FutbolistaController futctrl = new FutbolistaController(futFrame, futcon);
				
				futctrl.showPlayers();
				
			}
		});
		contentPane.add(btnOption1);
		

		JButton btnOption3 = new JButton("3. Jokalari berri bat sortu\r\n");
		contentPane.add(btnOption3);

		JButton btnOption2 = new JButton("2. Taldeak Ikusi");
		contentPane.add(btnOption2);

		JButton btnOption4 = new JButton("4. Talde berri bat sortu");
		contentPane.add(btnOption4);

		JButton btnOption5 = new JButton("5. Jokalaria bilatu");
		contentPane.add(btnOption5);

		JButton btnNewButton_5 = new JButton("6. Taldea bilatu");
		contentPane.add(btnNewButton_5);

		JLabel lblnfo = new JLabel("FUTBOL DB");
		lblnfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblnfo.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblnfo);

		Icon icon = new ImageIcon("src/ud6/jarduera2/view/img/exit.png");
		JButton btnExit = new JButton(icon);
		btnExit.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {

				System.exit(0);

			}
		});
		contentPane.add(btnExit);
	}

}
