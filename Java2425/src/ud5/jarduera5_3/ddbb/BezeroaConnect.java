package ud5.jarduera5_3.ddbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import ud5.jarduera5_3.models.Bezeroa;

public class BezeroaConnect {

	private Connection connection() {

		String url = "jdbc:mysql://localhost:3306/almacen";
		String username = "root";
		String password = "";
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Datu basera konektatuta");

		} catch (SQLException e) {

			System.out.println("Errorea konektatzen " + e.getMessage());

		}

		return connection;
	}

	public void bezeroaSortu(Bezeroa b) {
		
		Connection con = connection();
		
		Statement st;
		String query;
		
		try {
			
			st = con.createStatement();
			
			query = "INSERT INTO clientes VALUES (" + b.getId() + ", " + b.getNombre() + ", " + b.getDireccion() + ", " + b.getCodPostal() + ", " + b.getTelefono() + ");";
			
			st.executeQuery(query);
			con.close();
			
		} catch (SQLException e) {
			
			System.err.println("ERROR insertin values in the table 'clientes'");
			System.err.println(e.getMessage());
			
		}
		
	}
	
	public void bezeroaEzabatu(String id) {
		
		Connection con = connection();
		Statement st;
		String query;
		
		try {
			
			st = con.createStatement();
			query = "DELETE FROM clientes WHERE id  LIKE '" + id + "';";
			
			st.execute(query);
			con.close();
			
		} catch (SQLException e) {
			
			System.err.println("ERROR deleting values in the table 'clientes'");
			System.err.println(e.getMessage());
			
		}
		
	}

}
