package ud5.jarduera5_3.ddbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ud5.jarduera5_3.models.Produktua;

public class ProduktuaConnect {

	private Connection connection() {

		String url = "jdbc:mysql://localhost:3306/almacen";
		String username = "root";
		String password = "";
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(url, username, password);

		} catch (SQLException e) {

			System.out.println("Errorea konektatzen " + e.getMessage());

		}

		return connection;
	}

	public void produktuaSortu(Produktua p) {

		Connection con = connection();
		Statement st;
		String query;

		try {

			st = con.createStatement();
			
			query = "INSERT INTO productos VALUES (" + p.getId() + ", " + p.getNombre() + ", " + p.getProveedor() + ", "
					+ p.getPrecio() + ", " + p.getExistencias() + ");";
			
			st.execute(query);
			con.close();
			
		} catch (SQLException e) {
			
			System.err.println("ERROR inserting values on the table 'pedidos'");
			System.err.println(e.getMessage());
		}
		
	}
	
	public void produktuaEzabatu(int id) {
		
		Connection con = connection();
		Statement st;
		String query;
		
		try {
			
			st = con.createStatement();
			
			query = "DELETE FROM pedidos WHERE id = " + id + ";";
			
			st.execute(query);
			con.close();
			
		} catch (SQLException e) {
			
			System.err.println("ERROR deleting values on the table 'pedidos'");
			System.err.println(e.getMessage());
			
		}
		
	}
	
	public ArrayList<Produktua> getProduktuak() {
		
		Connection con = connection();
		Statement st;
		ResultSet rs;
		String query;
		
		ArrayList<Produktua> produktuList = new ArrayList<Produktua>();
		
		Produktua p = new Produktua();
		
		try {
			
			st = con.createStatement();
			
			query = "SELECT * FROM productos;";
			
			rs = (ResultSet) st.executeQuery(query);
			
			while (rs.next()) {
				
				p = new Produktua();
				
				p.setId(rs.getInt("id"));
				p.setNombre(rs.getString("nombre"));
				p.setProveedor(rs.getString("proveedor"));
				p.setPrecio(rs.getFloat("precio"));
				p.setExistencias(rs.getInt("existencias"));
				
				produktuList.add(p);
				
			}
			
			
		} catch (SQLException e) {
			
			System.err.println("ERROR in method getProduktuak.");
			System.err.println(e.getMessage());
			
		}
		
		return produktuList;
	}
	
	public float produktuenBatazBestekoaBistaratu() {
		
		Connection con = connection();
		Statement st;
		ResultSet rs;
		String query;
		
		float avg = 0;
		
		try {
			
			st = con.createStatement();
			
			query = "SELECT AVG(precio) AS average FROM productos;";
			
			rs =(ResultSet) st.executeQuery(query);
			
			while (rs.next()) {
				
				avg = rs.getFloat("average");
				
			}
			
			con.close();
			
			
		} catch (SQLException e) {
			
			System.err.println("ERROR in method produktuenBatazBestekoaBistaratu");
			System.err.println(e.getMessage());
			
		}
		
		return avg;
		
	}
}
