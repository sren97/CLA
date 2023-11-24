/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import db.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author PC
 */
public class ClientDAO {
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn = null;
    public void Create(Client c){
        try{
            conn = DB.getConnection();
            String query = "INSERT INTO clients (mail, name, surname, phone_number) values (?, ?, ?, ?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, c.getMail()); ps.setString(2, c.getName()); 
            ps.setString(3, c.getSurname()); ps.setString(4, c.getPhoneNumber());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally { try { rs.close(); } catch (Exception e) { /* ignored */ }
        }
    }
}
