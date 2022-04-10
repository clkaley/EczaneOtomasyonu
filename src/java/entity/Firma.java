
package entity;

import java.sql.Timestamp;


public class Firma {
    private int firma_id;
    private String firma_name;
    private String firma_no;
    private String firma_telefon;
    private String firma_adres;
    private Timestamp created;
    private Timestamp updated;

    public Firma() {
    }

    public Firma(int firma_id, String firma_name, String firma_no, String firma_telefon, String firma_adres, Timestamp created, Timestamp updated) {
        this.firma_id = firma_id;
        this.firma_name = firma_name;
        this.firma_no = firma_no;
        this.firma_telefon = firma_telefon;
        this.firma_adres = firma_adres;
        this.created = created;
        this.updated = updated;
    }

    public Firma(int firma_id, String firma_name, String firma_no, String firma_telefon, String firma_adres, Timestamp created) {
        this.firma_id = firma_id;
        this.firma_name = firma_name;
        this.firma_no = firma_no;
        this.firma_telefon = firma_telefon;
        this.firma_adres = firma_adres;
        this.created = created;
    }

    public Firma(String firma_name, String firma_no, String firma_telefon, String firma_adres, Timestamp created) {
        this.firma_name = firma_name;
        this.firma_no = firma_no;
        this.firma_telefon = firma_telefon;
        this.firma_adres = firma_adres;
        this.created = created;
    }

    public int getFirma_id() {
        return firma_id;
    }

    public void setFirma_id(int firma_id) {
        this.firma_id = firma_id;
    }

    public String getFirma_name() {
        return firma_name;
    }

    public void setFirma_name(String firma_name) {
        this.firma_name = firma_name;
    }

    public String getFirma_no() {
        return firma_no;
    }

    public void setFirma_no(String firma_no) {
        this.firma_no = firma_no;
    }

    public String getFirma_telefon() {
        return firma_telefon;
    }

    public void setFirma_telefon(String firma_telefon) {
        this.firma_telefon = firma_telefon;
    }

    public String getFirma_adres() {
        return firma_adres;
    }

    public void setFirma_adres(String firma_adres) {
        this.firma_adres = firma_adres;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }
    
    
    
    
    
    
}
