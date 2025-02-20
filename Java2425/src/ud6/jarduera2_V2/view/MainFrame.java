package ud6.jarduera2_V2.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("FUTBOL DB");
		ImageIcon img = new ImageIcon("src/ud6/jarduera2_V2/view/img/futIcon.jpg");
		setIconImage(img.getImage());
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 10));
		
		JButton btnSeePlayers = new JButton("See Players");
		btnSeePlayers.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnSeePlayers);
		
		JButton btnSeeTeams = new JButton("See Teams");
		btnSeeTeams.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnSeeTeams);
		
		JButton btnCreatePlayer = new JButton("Create Player");
		btnCreatePlayer.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnCreatePlayer);
		
		JButton btnCreateTeam = new JButton("Create Team");
		btnCreateTeam.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnCreateTeam);
		
		JButton btnSearcPlayer = new JButton("Search Player by ID");
		btnSearcPlayer.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnSearcPlayer);
		
		JButton btnSearchTeam = new JButton("Search Team by ID");
		btnSearchTeam.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnSearchTeam);
		
		JLabel lblFutbolDB = new JLabel("FUTBOL DB");
		lblFutbolDB.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFutbolDB.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblFutbolDB);
		
		Icon icon = new ImageIcon("src/ud6/jarduera2_V2/view/img/exit.png");
		JButton btnExit = new JButton(icon);
		btnExit.addActionListener(e1 -> System.exit(0));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		contentPane.add(btnExit);
		
	}

}
