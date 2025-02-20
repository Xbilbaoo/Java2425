package ud6.jarduera2_V2.models.ddbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ud6.jarduera2.models.Futbolista;

public class FutbolistaConnect {

	private Connection conexion() {
		String url = "jdbc:mysql://localhost:3306/futbol";
		String username = "root";
		String password = "";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
			// System.out.println("Datu basera konektatuta");

		} catch (SQLException e) {
			System.out.println("Errorea konektatzen " + e.getMessage());
		}

		return connection;
	}

	public Futbolista getFutbolistaIDtik(String id) {

		Futbolista fut = new Futbolista();
		try {
			Connection con = conexion();
			Statement st = con.createStatement();
			String consulta = "SELECT * FROM futbolistas WHERE dni='" + id + "';";
			ResultSet resultSet = (ResultSet) st.executeQuery(consulta);
			
			while (resultSet.next()) {
				
				String izena = resultSet.getString("nombre");
				String abizena = resultSet.getString("apellido");
				int salary = resultSet.getInt("salario");
				int teamID = resultSet.getInt("idEquipo");
				
				fut = new Futbolista(id, izena, abizena, salary, teamID);
			}
		} catch (SQLException e) {

			System.err.println("ERROR in Method getFutbolistaIDtik" + e.getMessage());

		}
		return fut;
	}

	public void futbolistaSortu(Futbolista fut) throws SQLException {
		Connection con = conexion();
		Statement st = con.createStatement();
		String consulta = "INSERT INTO futbolistas " + "(DNI, nombre, apellido, salario, idEquipo) " + "VALUES ('"
				+ fut.getNan() + "', '" + fut.getIzena() + "', '" + fut.getAbizena() + "', '" + "', '"
				+ fut.getIdTaldea() + "');";

		boolean emaitza = st.execute(consulta);
		System.out.println(emaitza);

		System.out.println("Langilea ondo sortu da!!");

		con.close();
	}

	public void futbolistaEzabatu(String NANFut) throws SQLException {
		Connection con = conexion();
		Statement st = con.createStatement();
		String consulta = "DELETE FROM usuarios WHERE id='" + NANFut + "'";

		st.execute(consulta);

	}

	public ArrayList<Futbolista> getFutbolistak() {

		ArrayList<Futbolista> futbolistaList = new ArrayList<Futbolista>();

		try {

			Connection con = conexion();
			Statement st = con.createStatement();
			String consulta = "SELECT * FROM futbolistas;";
			ResultSet resultSet = (ResultSet) st.executeQuery(consulta);
			Futbolista fut = new Futbolista();

			while (resultSet.next()) {

				fut = new Futbolista();

				fut.setNan(resultSet.getString("dni"));
				fut.setIzena(resultSet.getString("nombre"));
				fut.setAbizena(resultSet.getString("apellido"));
				fut.setSoldata(resultSet.getInt("salario"));
				fut.setIdTaldea(resultSet.getInt("idEquipo"));
				futbolistaList.add(fut);
				
			}
		} catch (SQLException e) {

			System.err.println("ERROR in method getFutbolistak()");
		}
		return futbolistaList;
	}
}
