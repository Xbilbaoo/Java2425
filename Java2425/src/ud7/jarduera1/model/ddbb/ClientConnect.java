package ud7.jarduera1.model.ddbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ud7.jarduera1.model.Client;

public class ClientConnect {

	/**
	 * Method to connect the program with a local hosted database.
	 * 
	 * @return the connection to the database.
	 */

	private Connection con() {

		String url = "jdbc:mysql://localhost:3306/tienda";
		String user = "root";
		String psswd = "";
		Connection con = null;

		try {

			con = DriverManager.getConnection(url, user, psswd);

		} catch (SQLException e) {

			System.err.println("ERROR connecting with the database: " + e.getMessage());

		}

		return con;

	}

	/**
	 * Method that takes all the data from the table from the database, and creates
	 * instances from each row of the query and inserts it on an ArrayList.
	 * 
	 * @return An ArrayList with all the data from the database.
	 */

	public ArrayList<Client> getClients() {

		ArrayList<Client> cList = new ArrayList<Client>();
		Client c;

		try {

			Connection con = con();
			Statement st = con.createStatement();
			String query = "SELECT * FROM cliente;";
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {

				c = new Client();
				c.setClientID(rs.getInt("Id_cliente"));
				c.setName(rs.getString("Nombre"));
				c.setSurname(rs.getString("Apellido"));
				cList.add(c);

			}
			
			con.close();
			
		} catch (SQLException e) {

			System.err.println("ERROR in method 'getClients': " + e.getMessage());

		}

		return cList;
	}
	
	/**
	 * Method to insert the values from the parameter into the database.
	 * 
	 * @param c instance of the Object "Client".
	 */

	public void createClient(Client c) {

		try {

			Connection con = con();
			Statement st = con.createStatement();
			String query = "INSERT INTO cliente VALUES(" + c.getClientID() + ", " + c.getName() + ", " + c.getSurname()
					+ ");";
			st.executeUpdate(query);
			
			con.close();

		} catch (SQLException e) {

			System.err.println("ERROR inserting data on table cliente");

		}
	}
	
	/**
	 * Method to delete a client 
	 * @param id The id of the client.
	 */

	public void deleteClient(int id) {

		try {

			Connection con = con();
			Statement st = con.createStatement();
			String query = "DELETE FROM cliente WHERE id_cliente = " + id + ";";
			st.executeUpdate(query);
			
			con.close();

		} catch (SQLException e) {

			System.err.println("ERROR deleting data on table cliente");

		}
	}

}
