package ud6.jarduera2.controller.ddbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ud6.jarduera2.models.Taldea;

public class TaldeaConnect {
	private static Connection conexion() {
		String url = "jdbc:mysql://localhost:3306/futbol";
		String username = "root";
		String password = "";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
			// System.out.println("Datu basera konektatuta");

		} catch (SQLException e) {
			System.out.println("Errorea konektatzen ");
		}

		return connection;
	}

	public static ArrayList<Taldea> getTaldeak() throws SQLException {
		Connection con = conexion();
		Statement st = con.createStatement();
		String consulta = "SELECT * FROM equipos;";
		ResultSet resultSet = (ResultSet) st.executeQuery(consulta);
		ArrayList<Taldea> taldeaList = new ArrayList<Taldea>();
		// System.out.println("Zelan goaz hemen?");

		try {
			while (resultSet.next()) {
				Taldea talde = new Taldea();
				talde.setIdTaldea(resultSet.getInt("idEquipo"));
				talde.setIzena(resultSet.getString("nombre"));
				talde.setHerria(resultSet.getString("ciudad"));

				taldeaList.add(talde);
				// System.out.println(futbolistaList.toString());
			}
		} catch (Exception e) {
			System.err.println("Errorea getTaldeak-en");
		}

		return taldeaList;
	}

	public static Taldea getTaldeaIDtik(int id) throws SQLException {
		Connection con = conexion();
		Statement st = con.createStatement();
		String consulta = "SELECT * FROM equipos WHERE idEquipo=" + id + ";";
		ResultSet resultSet = (ResultSet) st.executeQuery(consulta);
		Taldea talde = new Taldea();
		while (resultSet.next()) {
			String izena = resultSet.getString("nombre");
			int idTaldea = resultSet.getInt("idEquipo");
			String hiria = resultSet.getString("ciudad");
			talde = new Taldea(idTaldea, izena, hiria);
		}
		return talde;
	}

	public static void taldeaSortu(Taldea talde) throws SQLException {
		Connection con = conexion();
		Statement st = con.createStatement();
		String consulta = "INSERT INTO equipos " + "(idEquipo, nombre, ciudad) VALUES ('" + talde.getIdTaldea() + "', '"
				+ talde.getIzena() + "', '" + talde.getHerria() + "');";

		st.execute(consulta);
//			System.out.println(emaitza);

		System.out.println("Taldea ondo sortu da!!");
		con.close();
	}

	public void futbolistaEzabatu(String NANFut) throws SQLException {
		Connection con = conexion();
		Statement st = con.createStatement();
		String consulta = "DELETE FROM futbolistas WHERE id='" + NANFut + "'";

		st.execute(consulta);

	}
}
