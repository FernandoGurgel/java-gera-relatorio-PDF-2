package model;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import conexao.Conexao;

public class ModelDao {

	Connection con;
    Statement st;
    String query;
    
    public void salvar(ModelBean modelBean){
        
        con = Conexao.getConnection();
        
        try {
            st = con.createStatement();
            query = "insert into aluno (nomealu) values ('"+modelBean.getNome()+"')";
            st.execute(query);
            JOptionPane.showMessageDialog(null, "Dados Salvos");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void imprimirCupon(ModelBean modelBean){
    	
    }
    
}
