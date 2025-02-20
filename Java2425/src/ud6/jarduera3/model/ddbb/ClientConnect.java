package ud6.jarduera3.model.ddbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ud6.jarduera3.model.Client;

public class ClientConnect {

	private Connection con() {

		String url = "jdbc:mysql://localhost:3306/almacen";
		String username = "root";
		String password = "";
		Connection con = null;

		try {

			con = DriverManager.getConnection(url, username, password);

		} catch (SQLException e) {

			System.out.println("Errorea konektatzen " + e.getMessage());

		}

		return con;
	}

	public ArrayList<Client> getClients() {

		ArrayList<Client> clientList = new ArrayList<Client>();
		Client client = new Client();

		try {

			Connection con = con();
			Statement st = con.createStatement();
			String query = "SELECT * FROM clientes;";
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {

				client = new Client();

				client.setId(rs.getString("id"));
				client.setName(rs.getString("name"));
				client.setDir(rs.getString("dir"));
				client.setCodPostal(rs.getString("codPostal"));
				client.setTlf(rs.getString("tlf"));

				clientList.add(client);

			}

			con.close();

		} catch (SQLException e) {

			System.err.println("ERROR on method getCLients " + e.getMessage());

		}

		return clientList;

	}

	public void createClient(Client c) {

		Connection con = con();
		
		try {

			Statement st = con.createStatement();
			
			String query = "INSERT INTO clientes VALUES (" + "'" + c.getId() + "', '" + c.getName() + "', '"
					+ c.getDir() + "', '" + c.getCodPostal() + "', '" + c.getTlf() + "');";
			
			st.executeQuery(query);
			
			con.close();
			
		} catch (SQLException e) {

			System.err.println("ERROR inserting values to the table 'Clientes'" + e.getMessage());

		}

	}
	
	public void deleteClient(String id) {
		
		Connection con = con();
		
		try {
			
			Statement st = con.createStatement();
			
			String query = "DELETE FOM clientes WHERE id = " + id;
			
			st.executeQuery(query);
			con.close();
			
		} catch (SQLException e) {
			
			System.err.println("ERROR deleting data from the table 'Clientes' " + e.getMessage());
			
		}
		
	}
	
	

}
