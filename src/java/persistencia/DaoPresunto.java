/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Presunto;

/**
 *
 * @author hebertferreira
 */
public class DaoPresunto {
    
    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    
    public DaoPresunto() throws Exception{
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/web_crypt", "epaminondas", "#tebas!");
    }
    
    
    public void incluir(Presunto novoPresunto)throws Exception{
        
        pst = con.prepareStatement("insert into presunto(nome, email, altura, peso) values(?,?,?,?)");
        
        pst.setString(1, novoPresunto.getNome());
        pst.setString(2, novoPresunto.getEmail());
        pst.setDouble(3, novoPresunto.getAltura());
        pst.setDouble(4, novoPresunto.getPeso());
            
        
        pst.execute();  
        pst.close();
    }
    
    public void excluir(Presunto novoPresunto)throws Exception{
        
        pst = con.prepareStatement("delete from presunto where nome = ? or email = ?");
        
        pst.setString(1, novoPresunto.getNome());
        pst.setString(2, novoPresunto.getEmail());
        
        pst.execute();  
        pst.close();    
        
    }
    
        public void alterar(Presunto novoPresunto)throws Exception{

            pst = con.prepareStatement("update presunto set nome = ? , altura = ? , peso = ? where email = ?");

            pst.setString(1, novoPresunto.getNome());
            pst.setDouble(2, novoPresunto.getAltura());
            pst.setDouble(3, novoPresunto.getPeso());
            pst.setString(4, novoPresunto.getEmail());
            
            pst.execute();
            pst.close();
        }
        
        
        public Presunto consultar(Presunto novoPresunto)throws Exception{
        
        Presunto temp = null;
        
        pst = con.prepareStatement("select *  from presunto where nome = ?");
        pst.setString(1, novoPresunto.getNome());
        rs = pst.executeQuery();
        
        if(rs.next()){
            temp = new Presunto();
            
            temp.setNome(rs.getString(1));
            temp.setEmail(rs.getString(2));
            temp.setAltura(rs.getDouble(3));
            temp.setPeso(rs.getDouble(4));
        }
        
        pst.close();
        return temp;
    }
    
}

