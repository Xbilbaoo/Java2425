package ud7.jarduera1.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import ud7.jarduera1.controller.BuyController;
import ud7.jarduera1.controller.ClientController;
import ud7.jarduera1.controller.ProductController;

import javax.swing.JScrollPane;

public class StoreView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel mainPanel;
	private JTextField tfProductID;
	private JTextField tfProductName;
	private JTextField tfProductPrice;
	private JTextField tfQuantity;
	private JTextField tfClientID;
	private JTextField tfClientName;
	private JTable sellTable;
	private JScrollPane scroll;
	private ProductController pctrl;
	private BuyController bctrl;
	private ClientController cctrl;
	private JComboBox comboBoxProducts;
	private JComboBox comboBoxTable;
	private JPanel buyPanel;
	private JPanel tablePanel;

	/**
	 * Create the frame.
	 */
	public StoreView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
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
		tfProductID.setBounds(150, 10, 195, 20);
		createPanel.add(tfProductID);
		tfProductID.setColumns(15);
		
		JLabel lblProductName = new JLabel("Produktuaren izena:");
		lblProductName.setBounds(10, 70, 150, 20);
		createPanel.add(lblProductName);
		
		tfProductName = new JTextField();
		tfProductName.setBounds(150, 70, 195, 20);
		createPanel.add(tfProductName);
		tfProductName.setColumns(10);
		
		JLabel lblProductPrice = new JLabel("Produktuaren prezioa:");
		lblProductPrice.setBounds(10, 130, 150, 20);
		createPanel.add(lblProductPrice);
		
		tfProductPrice = new JTextField();
		tfProductPrice.setBounds(150, 130, 195, 20);
		createPanel.add(tfProductPrice);
		tfProductPrice.setColumns(10);
		
		JButton btnSave = new JButton("Gorde");
		
		btnSave.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				pctrl.addProduct();
				pctrl.clearData();
				insertData();
				
			}
			
		});
		
		btnSave.setBounds(260, 190, 85, 21);
		createPanel.add(btnSave);
		
		buyPanel = new JPanel();
		formPanel.add(buyPanel);
		buyPanel.setLayout(null);
		
		JLabel lblProducts = new JLabel("Produktuak:");
		lblProducts.setBounds(43, 10, 80, 20);
		buyPanel.add(lblProducts);
		
		comboBoxProducts = new JComboBox();
		comboBoxProducts.setBounds(133, 9, 90, 20);
		buyPanel.add(comboBoxProducts);
		
		JLabel lblQuantity = new JLabel("Kantitatea:");
		lblQuantity.setBounds(263, 10, 80, 20);
		buyPanel.add(lblQuantity);
		
		tfQuantity = new JTextField();
		tfQuantity.setBounds(343, 10, 35, 20);
		buyPanel.add(tfQuantity);
		tfQuantity.setColumns(10);
		
		JLabel lblClientID = new JLabel("Bezeroaren ID-a:");
		lblClientID.setBounds(43, 70, 150, 20);
		buyPanel.add(lblClientID);
		
		tfClientID = new JTextField();
		tfClientID.setBounds(175, 70, 203, 19);
		buyPanel.add(tfClientID);
		tfClientID.setColumns(10);
		
		JLabel lblClientName = new JLabel("Bezeroaren izena:");
		lblClientName.setBounds(43, 130, 150, 20);
		buyPanel.add(lblClientName);
		
		tfClientName = new JTextField();
		tfClientName.setColumns(10);
		tfClientName.setBounds(175, 130, 203, 19);
		buyPanel.add(tfClientName);
		
		JButton btnBuy = new JButton("Erosi");
		btnBuy.setBounds(293, 190, 85, 21);
		buyPanel.add(btnBuy);
		
		tablePanel = new JPanel();
		mainPanel.add(tablePanel);
		tablePanel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 0, 776, 2);
		tablePanel.add(separator);
		
		comboBoxTable = new JComboBox();
		comboBoxTable.setBounds(338, 10, 100, 20);
		tablePanel.add(comboBoxTable);
		
		sellTable = new JTable();
		sellTable.setModel(new DefaultTableModel(
			new Object[][] {
				
			},
			new String[] {
				"PrezioTotala", "Unitatezko prezioa", "Kantitatea", "Produktua", "Bezeroa", "ID"
			}
		));
		sellTable.getColumnModel().getColumn(1).setPreferredWidth(100);
		sellTable.setBounds(10, 40, 756, 195);
		scroll = new JScrollPane(sellTable);
		tablePanel.add(scroll);
		
		JButton btnDelete = new JButton("Ezabatu");
		btnDelete.setBounds(338, 245, 100, 21);
		tablePanel.add(btnDelete);
		
	}
	
	
	
	// GETTERS //
	
	public JTextField getTfProductID() {
		return tfProductID;
	}

	public JTextField getTfProductName() {
		return tfProductName;
	}

	public JTextField getTfProductPrice() {
		return tfProductPrice;
	}

	public JTextField getTfQuantity() {
		return tfQuantity;
	}

	public JTextField getTfClientID() {
		return tfClientID;
	}

	public JTextField getTfClientName() {
		return tfClientName;
	}
	
	
	// SETTERS //
	
	public void setPctrl(ProductController pctrl) {
		this.pctrl = pctrl;
	}

	public void setBctrl(BuyController bctrl) {
		this.bctrl = bctrl;
	}

	public void setCctrl(ClientController cctrl) {
		this.cctrl = cctrl;
	}
	
	// METHODS //
	
	public void insertData() {
		
		comboBoxProducts.setModel(new DefaultComboBoxModel(pctrl.getNames()));
		buyPanel.add(comboBoxProducts);
		
		comboBoxTable.setModel(new DefaultComboBoxModel(bctrl.getIDs()));
		tablePanel.add(comboBoxTable);
		
		
	}
	
}
