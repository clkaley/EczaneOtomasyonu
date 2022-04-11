/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import util.DBConnection;
import entity.Alis;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * List
 *
 * @author Taha
 */
public class AlisDAO extends DBConnection {

    public Alis getById(int id) {
        Alis l = null;

        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from alis where alis_id=" + id);
            rs.next();

            l = new Alis(rs.getInt("alis_id"), rs.getInt("alis_fiyati"), rs.getString("alinan_firma"), rs.getString("alinan_tarih"), rs.getTimestamp("created"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return l;
    }

    //CRUD işlemleri
    public void create(Alis i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "insert into dagiticiAlis (alis_name, alis_no, alis_telefon,alis_adres,created) values ('" + i.getAlis_fiyati() + "','" + i.getAlinan_firma() + "','" + i.getAlinan_tarih() + i.getCreated() + "')";
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Alis> read() {
        List<Alis> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            String query = "select * from dagiticiAlis order by alis_id asc";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Alis tmp = new Alis(rs.getInt("alis_id"), rs.getInt("alis_fiyati"), rs.getString("alinan_firma"), rs.getString("alinan_tarih"), rs.getTimestamp("created"));
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
            String query = "update dagiticiAlis set alis_name = '" + i.getAlis_fiyati() + "', alis_no='" + i.getAlinan_firma() + "', alis_telefon='" + i.getAlinan_tarih() + "', alis_adres='" + "' where alis_id=" + i.getAlis_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Alis i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "delete from dagiticiAlis where alis_id=" + i.getAlis_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
