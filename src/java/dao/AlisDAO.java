/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Alis;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author ruslu
 */
public class AlisDAO extends DBConnection {
    
    public Alis getById(int id){
        Alis l = null;
        
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from alis where alis_id="+id);
            rs.next();
            
            l = new Alis(rs.getInt("alis_id"), rs.getInt("alis_fiyati"), rs.getTimestamp("created"));
                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return l;
    }
    
    //CRUD
    public void create(Alis i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "insert into alis (alis_fiyati,, created) values (" + i.getAlis_fiyati() + ",'" + i.getCreated() + "')";
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Alis> read() {
        List<Alis> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            String query = "select * from alis order by alis_id asc";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Alis tmp = new Alis(rs.getInt("alis_id"), rs.getInt("alis_fiyati"), rs.getTimestamp("created"));
                list.add(tmp);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void update(Alis i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "update alis set alis_fiyati = '" + i.getAlis_fiyati()+ "' where alis_id=" + i.getAlis_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Alis i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "delete from alis where alis_id=" + i.getAlis_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
