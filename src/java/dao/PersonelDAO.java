
package dao;

import entity.Personel;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;


public class PersonelDAO extends DBConnection {
    
    public Personel getById(int id){
        Personel l = null;
        
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from personel where personel_id="+id);
            rs.next();
            
            l = new Personel(rs.getInt("personel_id"), rs.getString("personel_name"), rs.getString("personel_tc"), rs.getString("personel_telefon"), rs.getString("personel_maas") ,rs.getTimestamp("created"));
                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return l;
    }
    
    //CRUD işlemleri
    public void create(Personel i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "insert into personel (personel_name, personel_tc, personel_telefon,personel_maas,created) values ('" + i.getPersonel_name() + "','" + i.getPersonel_tc() + "','" +i.getPersonel_telefon() + "','" + i.getPersonel_maas() + "','" + i.getCreated() + "')";
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Personel> read() {
        List<Personel> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            String query = "select * from personel";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Personel tmp = new Personel(rs.getInt("personel_id"), rs.getString("personel_name"), rs.getString("personel_tc"), rs.getString("personel_telefon"), rs.getString("personel_maas") ,rs.getTimestamp("created"));
                list.add(tmp);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
     public List<Personel> read(int page) {
        List<Personel> list = new ArrayList<>();
        int offset = (page-1)*5;
        try {
            Statement st = this.connect().createStatement();
            String query = "select * from personel limit 5 offset " + offset ;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Personel tmp = new Personel(rs.getInt("personel_id"), rs.getString("personel_name"), rs.getString("personel_tc"), rs.getString("personel_telefon"), rs.getString("personel_maas") ,rs.getTimestamp("created"));
                list.add(tmp);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void update(Personel i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "update personel set personel_name = '" + i.getPersonel_name()+ "', personel_tc='" + i.getPersonel_tc()+ "', personel_telefon='" + i.getPersonel_telefon() + "', personel_maas='" + i.getPersonel_maas()+"' where personel_id=" + i.getPersonel_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Personel i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "delete from personel where personel_id=" + i.getPersonel_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
