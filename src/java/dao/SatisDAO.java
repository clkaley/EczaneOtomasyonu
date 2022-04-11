/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import entity.Satis;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author Taha
 */
public class SatisDAO extends DBConnection{
    
    public Satis getById(int id){
        Satis l = null;

        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from alis where alis_id=" + id);
            rs.next();

            l = new Satis(rs.getInt("satis_id"), rs.getInt("alis_fiyat"), rs.getString("satilan_tarih"), rs.getTimestamp("created"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return l;
    }
    
    public void create(Satis i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "insert into dagiticiAlis (alis_name, alis_no, alis_telefon,alis_adres,created) values ('" + i.getSatis_fiyati()+ "','" + i.getSatilan_tarih()+ i.getCreated() + "')";
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public List<Satis> read() {
        List<Satis> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            String query = "select * from dagiticiAlis order by alis_id asc";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Satis tmp = new Satis(rs.getInt("satis_id"), rs.getInt("satis_fiyati"), rs.getString("satilan_tarih"), rs.getTimestamp("created"));
                list.add(tmp);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public void update(Satis i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "update dagiticiAlis set alis_name = '" + i.getSatis_fiyati() + "', alis_no='" + "', alis_telefon='" + i.getSatilan_tarih() + "', alis_adres='" + "' where alis_id=" + i.getSatis_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void delete(Satis i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "delete from dagiticiAlis where alis_id=" + i.getSatis_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
