package ud5.jarduera5_3.ddbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ud5.jarduera5_3.models.Eskaera;

public class EskaeraConnect {

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

	public void eskeraSortu(Eskaera esk) {

		Connection con = connection();
		Statement st;
		String query;

		try {

			st = con.createStatement();
			query = "INSERT INTO pedidos (" + esk.getId() + ", " + esk.getIdCliente() + ", " + esk.getFecha() + ", "
					+ esk.getCodPostal() + ");";
			
			st.execute(query);
			con.close();

		} catch (SQLException e1) {

			System.err.println("ERROR inserting data on the table 'pedidos'.");
			System.err.println(e1.getMessage());
			
		}

	}
	
	public void eskaeraEzabatu(int id) {
		
		Connection con = connection();
		Statement st;
		String query;
		
		try {
			
			st = con.createStatement();
			
			query = "DELETE FROM pedidos WHERE id = " + id +";";
			st.execute(query);
			
			con.close();
			
		} catch (SQLException e) {
			
			System.err.println("ERROR deleting a register from the table 'pedidos'.");
			System.err.println(e.getMessage());
		}
	}
	
	public ArrayList<Eskaera> getEskaerak() {
		
		// VARIABLES //
		
		Connection con = connection();
		Statement st;
		String query;
		ResultSet rs;
		
			// CREATE AN ARRAYLIST TO INTRODUCE THE COVERTED REGISTERS INTO IT //
		
		ArrayList<Eskaera> eskaeraList = new ArrayList<Eskaera>();
		
			// CREATE A NEW INSTANCE OF THE MODEL "ESKAERA" //
		
		Eskaera esk = new Eskaera();
		
		// TRY CATCH TO "CATCH" ANY EXCEPTION DURING THE CONNECTION OR OBTAINING THE DATA //
		
		try {
			
			// INITIALIZE THE VARIABLES //
			
			st = con.createStatement();
			query = "SELECT * FROM pedidos";
			rs = (ResultSet) st.executeQuery(query);
			
			// WHILE LOOP TO CONVERT EACH REGISTER INTO A INSTANCE OF THE MODEL //
			
			while (rs.next()) {
				
				esk = new Eskaera();
				esk.setId(rs.getInt("id"));
				esk.setIdCliente(rs.getString("idCliente"));
				esk.setFecha(rs.getDate("fecha"));
				esk.setCodPostal(rs.getString("codPostal"));
				
				eskaeraList.add(esk);
				
			}
			
		} catch (SQLException e) {
			
			System.err.println("ERROR in method getEskaerak");
			System.err.println(e.getMessage());
			
		}
		
		return eskaeraList;
		
	}
	
	
}
