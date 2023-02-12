/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package currency.converter;

import com.config.Config;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

/**
 *
 * @author dani
 */
public class Login {    
    private static Connection getConnection = Config.connection();
    private static ResultSet publicResult;
    private static Statement statement;
    
    public static ResultSet getUserData() {
        try {
            statement = Config.connection().createStatement();
            String query = "SELECT `username`, `password` FROM tbl_user";
            publicResult = statement.executeQuery(query);
                        
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return publicResult;
    }
}
