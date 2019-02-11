package es.urjc.etsii;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Crea una tabla en la BD.
 *
 */
public class CreaTabla
{
    public static void main( String[] args )
    {

        // Conecta con la base de datos
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "root", "");

        // Sentencia de creación de tabla
            String createSql = "CREATE TABLE usuarios (iduser INT NOT NULL AUTO_INCREMENT, "
                    + "username VARCHAR(45) NOT NULL UNIQUE, pass VARCHAR(50) NOT NULL, " + "PRIMARY KEY (iduser))";
        // Ejecuta la sentencia sobre la conexión.
            Statement statement = conn.createStatement();
            statement.execute(createSql);
            statement.close();
        // Cierre de la conexión
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
