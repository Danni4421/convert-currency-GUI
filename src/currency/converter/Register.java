/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package currency.converter;
import com.config.Config;

import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author dani
 */
public class Register {
    private static Statement statement;
    private static ResultSet result;
    
    public static ResultSet getContinentBox() {
        try {
            statement = Config.connection().createStatement();
            String query = "SELECT * FROM tbl_continent";
            result = statement.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }   
    
    public static ResultSet getCountryBox(int idContinent) {
        try {
            statement = Config.connection().createStatement();
            String query = "SELECT * FROM tbl_country WHERE idContinent = " + idContinent;
            result = statement.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    public static boolean addUser(String fullname, String username, String password
    , int idContinent, int idCountry) {
            
        boolean condition = false;
            
        try {
            
            statement = Config.connection().createStatement();
            String query = "INSERT INTO tbl_user VALUES (null,'"+ fullname +"', '"+ username +"', '"+ password +"', '"+ idContinent +"', '"+ 
                    idCountry +"', 'online')";
            
            if (statement.execute(query)) {
                condition = true;
            } 
            
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        return condition;
    }
}
