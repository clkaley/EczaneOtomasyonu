
package dao;

import entity.Firma;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;


public class FirmaDAO extends DBConnection {
    
    public Firma getById(int id){
        Firma l = null;
        
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from dagiticifirma where firma_id="+id);
            rs.next();
            
            l = new Firma(rs.getInt("firma_id"), rs.getString("firma_name"), rs.getString("firma_no"), rs.getString("firma_telefon"), rs.getString("firma_adres") ,rs.getTimestamp("created"));
                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return l;
    }
    
    //CRUD işlemleri
    public void create(Firma i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "insert into dagiticiFirma (firma_name, firma_no, firma_telefon,firma_adres,created) values ('" + i.getFirma_name() + "','" + i.getFirma_no() + "','" +i.getFirma_telefon() + "','" + i.getFirma_adres() + "','" + i.getCreated() + "')";
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Firma> read() {
        List<Firma> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            String query = "select * from dagiticiFirma order by firma_id asc";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Firma tmp = new Firma(rs.getInt("firma_id"), rs.getString("firma_name"), rs.getString("firma_no"), rs.getString("firma_telefon"), rs.getString("firma_adres") ,rs.getTimestamp("created"));
                list.add(tmp);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void update(Firma i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "update dagiticiFirma set firma_name = '" + i.getFirma_name()+ "', firma_no='" + i.getFirma_no()+ "', firma_telefon='" + i.getFirma_telefon() + "', firma_adres='" + i.getFirma_adres()+"' where firma_id=" + i.getFirma_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Firma i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "delete from dagiticiFirma where firma_id=" + i.getFirma_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
