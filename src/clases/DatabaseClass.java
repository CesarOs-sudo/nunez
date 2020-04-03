package clases;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author VictorManuel
 */
public class DatabaseClass {
    private static Connection conn;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/erpnunez";
    
    public DatabaseClass(){
        conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            if(conn!=null){
                 System.out.println("Conexion establecida..");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar.." + e);
        }
    }
    //Este metodo nos retorna la conexión
    public Connection getConnection(){
        return conn;
    }
    
    //Con este metodo nos desconectamos a la base de datos
    public void desconectar(){
        conn = null;
        if(conn == null){
            System.out.println("Conexión finalizada..");
        }
    }
}
