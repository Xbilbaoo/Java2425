package ud6.jarduera2.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.JTextField;

public class A extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfID;
	private JTextField tfName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A frame = new A();
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
	public A() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblID = new JLabel("NAN / NIE");
		lblID.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblID.setBounds(20, 50, 85, 15);
		contentPane.add(lblID);
		
		tfID = new JTextField();
		tfID.setBounds(130, 48, 96, 19);
		contentPane.add(tfID);
		tfID.setColumns(10);
		
		JLabel lblIzena = new JLabel("IZENA");
		lblIzena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIzena.setBounds(20, 80, 55, 15);
		contentPane.add(lblIzena);
		
		tfName = new JTextField();
		tfName.setBounds(130, 78, 96, 19);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblAbizena = new JLabel("ABIZENA");
		lblAbizena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAbizena.setBounds(20, 110, 75, 15);
		contentPane.add(lblAbizena);
	}
}
