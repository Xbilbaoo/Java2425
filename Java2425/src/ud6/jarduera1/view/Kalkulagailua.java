package ud6.jarduera1.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kalkulagailua extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulagailua frame = new Kalkulagailua();
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
	public Kalkulagailua() {
		setTitle("Jarduera6.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNum1 = new JLabel("Lehenengo Balioa");
		lblNum1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNum1.setBounds(10, 10, 160, 30);
		contentPane.add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Bigarren Balio");
		lblNum2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNum2.setBounds(10, 50, 150, 30);
		contentPane.add(lblNum2);
		
		JTextArea textAreaEmaitza = new JTextArea();
		textAreaEmaitza.setBounds(10, 175, 410, 75);
		contentPane.add(textAreaEmaitza);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(170, 15, 96, 19);
		contentPane.add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setColumns(10);
		textFieldNum2.setBounds(170, 56, 96, 19);
		contentPane.add(textFieldNum2);
		
		JLabel lblEmaitza = new JLabel("Batuketaren Emaitza");
		lblEmaitza.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmaitza.setBounds(10, 150, 150, 13);
		contentPane.add(lblEmaitza);
		
		JButton btnGehiketa = new JButton("BATUKETA");
		btnGehiketa.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int num1 = Integer.parseInt(textFieldNum1.getText());
				int num2 = Integer.parseInt(textFieldNum2.getText());
				
				int emaitza = num1 + num2;
				
				textAreaEmaitza.setText(num1 + " + " + num2 + " = " + emaitza + " da.");
			}
		});
		btnGehiketa.setBounds(10, 120, 100, 21);
		contentPane.add(btnGehiketa);
		
		JButton btnKenketa = new JButton("KENKETA");
		btnKenketa.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int num1 = Integer.parseInt(textFieldNum1.getText());
				int num2 = Integer.parseInt(textFieldNum2.getText());
				
				int emaitza = num1 - num2;
				
				textAreaEmaitza.setText(num1 + " - " + num2 + " = " + emaitza + " da.");
				
			}
		});
		btnKenketa.setBounds(115, 120, 100, 21);
		contentPane.add(btnKenketa);
		
		JButton btnBiderketa = new JButton("BIDERKETA");
		btnBiderketa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int num1 = Integer.parseInt(textFieldNum1.getText());
				int num2 = Integer.parseInt(textFieldNum2.getText());
				
				int emaitza = num1 * num2;
				
				textAreaEmaitza.setText(num1 + " * " + num2 + " = " + emaitza + " da.");
			}
		});
		btnBiderketa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBiderketa.setBounds(220, 120, 100, 21);
		contentPane.add(btnBiderketa);
		
		JButton btnZatiketa = new JButton("ZATIKETA");
		btnZatiketa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				boolean isZero = false;
				float num1 = Integer.parseInt(textFieldNum1.getText());
				float num2 = Integer.parseInt(textFieldNum2.getText());
				
				if (num2 == 0) {
					
					isZero = true;
					
				}
				
				if (isZero) {
					
					textAreaEmaitza.setText("Ezin da 0 zenbakiarekin zatiketa egin.");
					
				} else {
					
					float emaitza = num1 / num2;
					
					textAreaEmaitza.setText(num1 + " / " + num2 + " = " + emaitza + " da.");
					
				}
				
						
			}
		});
		btnZatiketa.setBounds(325, 120, 100, 21);
		contentPane.add(btnZatiketa);
		
		
	}
}
