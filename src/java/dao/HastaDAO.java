/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Hasta;
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
public class HastaDAO extends DBConnection {

    private IlacDAO idao;

    public IlacDAO getIdao() {
        if (idao == null) {
            this.idao = new IlacDAO();
        }
        return idao;
    }

    public void setIdao(IlacDAO idao) {
        this.idao = idao;
    }

    //CRUD
    public void create(Hasta i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "insert into hasta (hasta_name, hasta_tc, ilac_id, created) values ('" + i.getHasta_name() + "','" + i.getHasta_tc() + "'," + i.getIlac().getIlac_id() + ",'" + i.getCreated() + "')";
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Hasta> read() {
        List<Hasta> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            String query = "select * from hasta order by hasta_id asc";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Ilac i = this.getIdao().getById( rs.getInt("ilac_id"));
                Hasta tmp = new Hasta(rs.getInt("hasta_id"), rs.getString("hasta_name"), rs.getString("hasta_tc"),i, rs.getTimestamp("created"));
                list.add(tmp);
            }
            st.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    public List<Hasta> read(int page) {
        
        int offset = (page-1)*5;
        
        List<Hasta> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            String query = "select * from hasta limit 5 offset " + offset;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Ilac i = this.getIdao().getById( rs.getInt("ilac_id"));
                Hasta tmp = new Hasta(rs.getInt("hasta_id"), rs.getString("hasta_name"), rs.getString("hasta_tc"),i, rs.getTimestamp("created"));
                list.add(tmp);
            }
            st.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void update(Hasta i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "update hasta set hasta_name = '" + i.getHasta_name() + "', hasta_tc='" + i.getHasta_tc() + "', ilac_id=" + i.getIlac().getIlac_id() + " where hasta_id=" + i.getHasta_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Hasta i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "delete from hasta where hasta_id=" + i.getHasta_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
