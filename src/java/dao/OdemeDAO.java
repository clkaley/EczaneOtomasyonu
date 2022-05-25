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
            String query = "insert into odeme (odeme_toplam, odeme_turu, created) values ('" + i.getOdeme_toplam() + "','" + i.getOdeme_turu() + "','" + i.getCreated() + "')";
            st.executeUpdate(query);

            ResultSet rs = st.executeQuery("select max(odeme_id) as mid from odeme");
            rs.next();

            int odemeId = rs.getInt("mid");

            for (Firma frm : i.getFirmais()) {
                query = "insert into odeme_firma (odeme_id, firma_id) values (" + odemeId + ", " + frm.getFirma_id() + ")";
                st.executeUpdate(query);
            }

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

                Odeme tmp = new Odeme(rs.getInt("odeme_id"), rs.getString("odeme_toplam"), rs.getString("odeme_turu"), this.getOdemeFirma(rs.getInt("odeme_id")), rs.getTimestamp("created"));
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

    public List<Firma> getOdemeFirma(int odemeId) {
        List<Firma> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            String query = "select * from dagiticiFirma where firma_id in (select firma_id from odeme_firma where odeme_id = " + odemeId + ")";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Firma tmp = new Firma(rs.getInt("firma_id"), rs.getString("firma_name"), rs.getString("firma_no"), rs.getString("firma_telefon"), rs.getString("firma_adres"), rs.getTimestamp("created"));
                list.add(tmp);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void update(Odeme i) {
        try {
            Statement st = this.connect().createStatement();
            String query = "update odeme set odeme_toplam = '" + i.getOdeme_toplam() + "', odeme_turu= '" + i.getOdeme_turu() + "' where odeme_id=" + i.getOdeme_id();
            st.executeUpdate(query);

            st.executeUpdate("delete from odeme_firma where odeme_id = " + i.getOdeme_id());

            for (Firma frm : i.getFirmais()) {
                query = "insert into odeme_firma (odeme_id, firma_id) values (" + i.getOdeme_id() + ", " + frm.getFirma_id() + ")";
                st.executeUpdate(query);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Odeme i) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from odeme_firma where odeme_id = " + i.getOdeme_id());
            String query = "delete from odeme where odeme_id=" + i.getOdeme_id();
            st.executeUpdate(query);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
