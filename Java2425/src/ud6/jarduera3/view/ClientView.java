package ud6.jarduera3.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ClientView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnCreate;
	private JButton btnModify;
	private JButton btnDelete;
	private JButton btnSee;
	private JButton btnExit;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientView frame = new ClientView();
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
	public ClientView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Client DB");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblTitle = new JLabel("CLIENTS");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitle);
		
		btnCreate = new JButton("Create Client");
		btnCreate.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnCreate);
		
		btnModify = new JButton("Modify information from a client");
		btnModify.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnModify);
		
		btnDelete = new JButton("Delete client");
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnDelete);
		
		btnSee = new JButton("See all clients");
		btnSee.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnSee);
		
		ImageIcon exitIcon = new ImageIcon("src/ud6/jarduera3/view/img/exit.png");
		btnExit = new JButton(exitIcon);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.addActionListener(e -> System.exit(0));
		contentPane.add(btnExit);
		
	}

	public void setActionListener(ActionListener listener) {

		btnCreate.addActionListener(listener);
		btnModify.addActionListener(listener);
		

	}

}
