package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
        
public class Conexao {
    
    public static Connection getConnection(){
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String host = "jdbc:mysql://localhost/trabalho";
            String usuario = "root";
            String senha = "";
            
            con=DriverManager.getConnection(host,usuario,senha);
            
            System.out.println("Conectado");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Nao conectado");
        }
        
        return con;
    }
            
}
