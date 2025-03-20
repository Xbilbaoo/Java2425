package ud7.jarduera1.model.ddbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ud7.jarduera1.controller.BuyController;
import ud7.jarduera1.model.Buy;

public class BuyConnect {

	private final ProductConnect pcon = new ProductConnect();
	private final ClientConnect ccon = new ClientConnect();

	private Connection con() {

		String url = "jdbc:mysql://localhost:3306/tienda";
		String user = "root";
		String psswd = "";

		Connection con = null;

		try {

			con = DriverManager.getConnection(url, user, psswd);

		} catch (SQLException e) {

			System.err.println("ERROR conecting to the database");

		}

		return con;
	}

	public ArrayList<Buy> getBuys() {

		ArrayList<Buy> bList = new ArrayList<Buy>();
		Buy b;

		try {

			Connection con = con();
			Statement st = con.createStatement();
			String query = "SELECT * FROM compras";
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {

				b = new Buy();

				b.setBuyID(rs.getInt("Id_compra"));
				b.setClientID(rs.getInt("Id_cliente"));
				b.setProductID(rs.getInt("Id_producto"));

				bList.add(b);

			}

			con.close();

		} catch (SQLException e) {

			System.err.println("ERROR in method 'getBuys'.");

		}

		return bList;

	}

	public void createBuy(int clientID, String clientName, String productName, int quantity) {
		
		
		int productID = pcon.searchProductID(productName);
		boolean clientExists = ccon.checkClient(clientID, clientName);
		boolean enoughStock = pcon.checkStock(quantity, productID, clientExists);

		if (clientExists && enoughStock) {

			try {

				Connection con = con();
				Statement st = con.createStatement();
				String query = "INSERT INTO compras (Id_cliente, Id_producto, Cantidad) VALUES(" + clientID + ", "
						+ productID + ", " + quantity + ");";

				st.executeUpdate(query);

				con.close();
				
				BuyController.clearData();

			} catch (SQLException e) {

				System.err.println("ERROR inserting data on table 'compras'.");

			}

		} else {
			
			if (!clientExists) {
				
				BuyController.showClientError();
				
			}
			
			if(!enoughStock) {
				
				System.out.println("Ez dago hainbeste stock.");
			}
		}

	}

	public void deleteBuy(int id) {

		try {

			Connection con = con();
			Statement st = con.createStatement();
			String query = "DELETE FROM compras WHERE Id_compra = " + id + ";";

			st.executeUpdate(query);

			con.close();

		} catch (SQLException e) {

			System.err.println("ERROR deleting data on table 'compras'.");

		}
	}

	public String[] getIDs() {

		ArrayList<String> iList = new ArrayList<String>();
		String[] IDs = null;
		try {

			Connection con = con();
			Statement st = con.createStatement();
			String query = "SELECT DISTINCT Id_cliente FROM compras;";
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {

				iList.add("");

			}

			IDs = iList.toArray(new String[iList.size() + 1]);
			int i = 1;
			IDs[0] = "DENAK";

			rs = st.executeQuery(query);

			while (rs.next()) {

				IDs[i] = rs.getString("Id_cliente");

				i++;

			}

		} catch (SQLException e) {

			System.err.println("ERROR in method 'getIDs'." + e.getMessage());

		}

		return IDs;
	}
}
