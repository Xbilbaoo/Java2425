package ud6.jarduera0.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Hasiera extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hasiera frame = new Hasiera();
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
	public Hasiera() {
		setTitle("Hasiera");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnJarraitu = new JButton("Jarraitu");
		btnJarraitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnJarraitu.setBounds(110, 197, 85, 21);
		contentPane.add(btnJarraitu);
		
		JButton btnExit = new JButton("Irten");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setBounds(242, 197, 85, 21);
		contentPane.add(btnExit);
		
		JLabel lblOngiEtorri = new JLabel("ONGI ETORRI !!");
		lblOngiEtorri.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOngiEtorri.setBounds(155, 56, 137, 39);
		contentPane.add(lblOngiEtorri);
		
		JLabel lblBienvenido = new JLabel("BIENVENIDO !!");
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBienvenido.setBounds(155, 105, 138, 21);
		contentPane.add(lblBienvenido);
	}
}
