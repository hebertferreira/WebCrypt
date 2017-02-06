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

/**
 *
 * @author hebertferreira
 */
public class DaoConfiguracaoGeral {
    
    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    
    public DaoConfiguracaoGeral() throws Exception{
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/web_crypt", "epaminondas", "#tebas!");
    }
    
    
    
}
