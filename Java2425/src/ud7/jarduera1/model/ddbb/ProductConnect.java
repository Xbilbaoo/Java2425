package ud7.jarduera1.model.ddbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ud7.jarduera1.model.Product;

public class ProductConnect {

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

	public ArrayList<Product> getProducts() {

		ArrayList<Product> pList = new ArrayList<Product>();
		Product p;

		try {

			Connection con = con();
			Statement st = con.createStatement();
			String query = "SELECT * FROM producto;";
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {

				p = new Product();

				p.setProductID(rs.getInt("Id_producto"));
				p.setName(rs.getString("Nombre"));
				p.setPrice(rs.getInt("Precio"));
				p.setStock(rs.getInt("Cantidad"));

				pList.add(p);

			}

			con.close();

		} catch (SQLException e) {

			System.err.println("ERROR in method 'getProducts'.");

		}

		return pList;

	}

	public void createProduct(int id, String name, int price) {

		try {

			Connection con = con();
			Statement st = con.createStatement();
			String query = "INSERT INTO producto VALUES(" + id + ", '" + name + "', " + price + ", 100);";

			st.executeUpdate(query);

			con.close();

		} catch (SQLException e) {

			System.err.println("ERROR inserting data on table 'producto'." + e.getMessage());

		}
	}

	public void deleteProduct(int id) {

		try {

			Connection con = con();
			Statement st = con.createStatement();
			String query = "DELETE FROM producto WHERE Id_producto = " + id + ";";

			st.executeUpdate(query);

			con.close();

		} catch (SQLException e) {

			System.err.println("ERROR deleting data on table 'producto'.");

		}
	}

	public String[] getNames() {

		ArrayList<String> nList = new ArrayList<String>();
		String[] names = null;
		try {

			Connection con = con();
			Statement st = con.createStatement();
			String query = "SELECT Nombre FROM producto;";
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {

				nList.add("");

			}

			names = nList.toArray(new String[nList.size()]);
			int i = 0;

			rs = st.executeQuery(query);

			while (rs.next()) {

				names[i] = rs.getString("Nombre");
				i++;

			}

		} catch (SQLException e) {

			System.err.println("ERROR in method 'getNames'." + e.getMessage());

		}

		return names;

	}
	
	public int searchProductID(String product) {
		
		int id = 0;
		
		try {
			
			Connection con = con();
			Statement st = con.createStatement();
			String query = "SELECT Id FROM producto WHERE Nombre = " + product + ";";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				
				id = rs.getInt("Id_producto");
				
			}
			
		} catch(SQLException e) {
			
			System.err.println("ERROR in method 'searchProductID'.");
		}
		
		return id;
	}
}
