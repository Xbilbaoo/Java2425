package ud5.jarduera5_3.ddbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProduktuaConnect {

	private Connection conexion() {

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
}
