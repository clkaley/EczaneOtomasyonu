/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Ilac;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author ruslu
 */
public class IlacDAO extends DBConnection {

    public Ilac getById(int id) {
        Ilac l = null;

        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from ilac where ilac_id=" + id);
            rs.next();

            l = new Ilac(rs.getInt("ilac_id"), rs.getString("seri_no"), rs.getString("name"), rs.getString("type"), rs.getTimestamp("created"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return l;
    }

    //CRUD
    public void create(Ilac i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "insert into ilac (seri_no, name, type, created) values ('" + i.getSeri_no() + "','" + i.getName() + "','" + i.getType() + "','" + i.getCreated() + "')";
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Ilac> read() {
        List<Ilac> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            String query = "select * from ilac";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Ilac tmp = new Ilac(rs.getInt("ilac_id"), rs.getString("seri_no"), rs.getString("name"), rs.getString("type"), rs.getTimestamp("created"));
                list.add(tmp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public List<Ilac> read(int page) {
        List<Ilac> list = new ArrayList<>();
          int offset = (page-1)*5;
        try {
            Statement st = this.connect().createStatement();
            String query = "select * from ilac limit 5 offset " + offset;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Ilac tmp = new Ilac(rs.getInt("ilac_id"), rs.getString("seri_no"), rs.getString("name"), rs.getString("type"), rs.getTimestamp("created"));
                list.add(tmp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void update(Ilac i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "update ilac set seri_no = '" + i.getSeri_no() + "', name='" + i.getName() + "', type='" + i.getType() + "' where ilac_id=" + i.getIlac_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Ilac i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "delete from ilac where ilac_id=" + i.getIlac_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
