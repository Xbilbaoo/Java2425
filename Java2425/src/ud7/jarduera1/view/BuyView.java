package ud7.jarduera1.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class BuyView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel mainPanel;
	private JTextField tfProductID;
	private JTextField tfProductName;
	private JTextField tfProductPrice;
	private JTextField tfQuantity;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyView frame = new BuyView();
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
	public BuyView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(mainPanel);
		mainPanel.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel formPanel = new JPanel();
		mainPanel.add(formPanel);
		formPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel createPanel = new JPanel();
		formPanel.add(createPanel);
		createPanel.setLayout(null);
		
		JLabel lblProductID = new JLabel("Produktuaren ID-a:");
		lblProductID.setBounds(10, 10, 150, 20);
		createPanel.add(lblProductID);
		
		tfProductID = new JTextField();
		tfProductID.setBounds(150, 9, 195, 20);
		createPanel.add(tfProductID);
		tfProductID.setColumns(15);
		
		JLabel lblProductName = new JLabel("Produktuaren izena:");
		lblProductName.setBounds(10, 50, 150, 20);
		createPanel.add(lblProductName);
		
		tfProductName = new JTextField();
		tfProductName.setBounds(150, 49, 195, 20);
		createPanel.add(tfProductName);
		tfProductName.setColumns(10);
		
		JLabel lblProductPrice = new JLabel("Produktuaren prezioa:");
		lblProductPrice.setBounds(10, 90, 150, 20);
		createPanel.add(lblProductPrice);
		
		tfProductPrice = new JTextField();
		tfProductPrice.setBounds(150, 89, 195, 20);
		createPanel.add(tfProductPrice);
		tfProductPrice.setColumns(10);
		
		JButton btnSave = new JButton("Gorde");
		btnSave.setBounds(260, 130, 85, 21);
		createPanel.add(btnSave);
		
		JPanel buyPanel = new JPanel();
		formPanel.add(buyPanel);
		buyPanel.setLayout(null);
		
		JLabel lblProducts = new JLabel("Produktuak:");
		lblProducts.setBounds(43, 10, 80, 20);
		buyPanel.add(lblProducts);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"PS4", "XBOX", "SWITCH"}));
		comboBox.setBounds(133, 9, 90, 20);
		buyPanel.add(comboBox);
		
		JLabel lblQuantity = new JLabel("Kantitatea:");
		lblQuantity.setBounds(263, 10, 80, 20);
		buyPanel.add(lblQuantity);
		
		tfQuantity = new JTextField();
		tfQuantity.setBounds(343, 10, 35, 20);
		buyPanel.add(tfQuantity);
		tfQuantity.setColumns(10);
		
		JLabel lblClientID = new JLabel("Bezeroaren ID-a:");
		lblClientID.setBounds(43, 50, 150, 20);
		buyPanel.add(lblClientID);
		
		textField = new JTextField();
		textField.setBounds(175, 50, 203, 19);
		buyPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblClientName = new JLabel("Bezeroaren ID-a:");
		lblClientName.setBounds(43, 90, 150, 20);
		buyPanel.add(lblClientName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(175, 90, 203, 19);
		buyPanel.add(textField_1);
		
		JPanel tablePanel = new JPanel();
		mainPanel.add(tablePanel);
	}
}
