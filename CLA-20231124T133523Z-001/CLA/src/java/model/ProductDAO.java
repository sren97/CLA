/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

import db.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author PC
 */
public class ProductDAO {
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn = null;
    public void Create(Product p){
        try{
            conn = DB.getConnection();
            String query = "INSERT INTO products (id, name, description, price, category) values (?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, p.getId()); ps.setString(2, p.getName()); 
            ps.setString(3, p.getDescription()); ps.setInt(4, p.getPrice());
            ps.setString(4, p.getCategory());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally { try { rs.close(); } catch (Exception e) { /* ignored */ }
        }
    }

}
