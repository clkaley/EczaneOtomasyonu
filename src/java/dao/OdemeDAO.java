
package dao;

import entity.Odeme;
import entity.Firma;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class OdemeDAO extends DBConnection {

    private FirmaDAO idao;

    public FirmaDAO getIdao() {
        if (idao == null) {
            this.idao = new FirmaDAO();
        }
        return idao;
    }

    public void setIdao(FirmaDAO idao) {
        this.idao = idao;
    }

    //CRUD işlemleri
    public void create(Odeme i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "insert into odeme (odeme_toplam, odeme_turu,  created) values ('" + i.getOdeme_toplam() + "','" + i.getOdeme_turu() + ",'" + i.getCreated() + "')";
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Odeme> read() {
        List<Odeme> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            String query = "select * from odeme order by odeme_id asc";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Firma i = this.getIdao().getById( rs.getInt("firma_id"));
                Odeme tmp = new Odeme(rs.getInt("odeme_id"), rs.getString("odeme_toplam"), rs.getString("odeme_turu"), rs.getTimestamp("created"));
                //i eklencek
                list.add(tmp);
            }
            st.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void update(Odeme i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "update odeme set odeme_toplam = '" + i.getOdeme_toplam() + "', odeme_turu='" + i.getOdeme_turu() + " where odeme_id=" + i.getOdeme_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Odeme i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "delete from odeme where odeme_id=" + i.getOdeme_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
