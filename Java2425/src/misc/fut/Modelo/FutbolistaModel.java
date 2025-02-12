package misc.fut.Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;// DDBB kudeatzeko behar diren liburutegiak
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FutbolistaModel {
	
	// Se encarga de crear la conexión a MySQL. La estructura es la siguiente:
	public Connection conexion() {
		String url = "jdbc:mysql://localhost:3306/futbol";   // URL donde se encuentra ubicada la DDBBa
        String username = "root";            				 // El usuario para conectarse a la DDBB
        String password = "";								 // El password para conectarse a la DDBB
        Connection konexioa = null;
        try {
        	// Al controlador hay que pasarle 3 parámetros: 
        	// La URL para conectarse a la DDBBko URLa, El usuario y la password para conectarse a la BBDD
        	konexioa = DriverManager.getConnection(url, username, password);
        	
        	// Si la conexión se hace correctamente (OK) mostramos el siguiente mensaje.
            System.out.println("Conectado a la base de datos.");
            
        } catch (SQLException e) {   // En esta línea si se produce un error emn la conexion recogemos la información
        	// Si la conexión no ha sido correcta (KO) mostramos el siguiente mensaje.        	
            System.out.println("Error al conectarse : " + e.getMessage());
        }
 
		return konexioa; // Devolvemos el controlKontrol a la ventana principal
	}

    public List<Futbolista> obtenerFutbolistas() {
        List<Futbolista> futbolistas = new ArrayList<>();
        try {
        	
    		Connection con = conexion(); 			// con izeneko Connection motako objektua sortzen dugu.
    		Statement st = con.createStatement();   // st izeneko Statement motako objektua sortzen dugu.
    												// Eta SQL kontsulta egiteko con objektua erabiltzen dugu.

            // Consulta SQL
            String query = "SELECT * FROM futbolistas";
            ResultSet rs = st.executeQuery(query);
            
            // Procesar el resultado de la consulta
            while (rs.next()) {
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                futbolistas.add(new Futbolista(dni, nombre));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(""+futbolistas);
        return futbolistas;
    }
    
    // Cerrar la conexión
    public void cerrarConexion(Connection con) {
        try {
            if (con != null) {
            	con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}