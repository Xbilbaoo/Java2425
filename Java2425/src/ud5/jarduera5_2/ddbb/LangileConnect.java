package ud5.jarduera5_2.ddbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ud5.jarduera5_2.models.Langilea;

public class LangileConnect {

	private Connection conexion() {
		String url = "jdbc:mysql://localhost:3306/empresa2";
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

	public void langileaSortu(Langilea lan) throws SQLException {
		Connection con = conexion();
		Statement st = con.createStatement();
		String consulta = "INSERT INTO empleados VALUES (" + lan.getId() + ", " + lan.getFirstName() + ", "
				+ lan.getLastName() + ", " + lan.getDepartment() + ", " + lan.getSalario() + ");";
		
		boolean emaitza = st.execute(consulta);
		System.out.println(emaitza);

		con.close();
		
	}

	public void langileaEzabatu(int id) throws SQLException {
		
		Connection con = conexion();
		Statement st = con.createStatement();
		
		String consulta = "DELETE FROM empleados WHERE id = " + id;

		st.execute(consulta);

	}
	
	public ArrayList<Langilea> getLangileak() throws SQLException {

		Connection con = conexion();
		Statement st = con.createStatement();
		String consulta = "SELECT * FROM empleados;";
		ResultSet resultSet = (ResultSet) st.executeQuery(consulta);
		ArrayList<Langilea> langileList = new ArrayList<Langilea>();
		Langilea lan = new Langilea();

		while (resultSet.next()) {

			lan = new Langilea();
			lan.setId(resultSet.getInt("id"));
			lan.setFirstName(resultSet.getString("first_name"));
			lan.setLastName(resultSet.getString("last_name"));
			lan.setDepartment(resultSet.getString("department"));
			lan.setSalario(resultSet.getFloat("salario"));
			langileList.add(lan);
			lan.toString();
		}
		
		return langileList;
		
	}
	
}
