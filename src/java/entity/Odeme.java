
package entity;

import java.sql.Timestamp;


public class Odeme {
    private int odeme_id;
    private String odeme_toplam;
    private String odeme_turu;
    private Timestamp created;
    private Timestamp updated;

    public Odeme() {
    }

    public Odeme(int odeme_id, String odeme_toplam, String odeme_turu, Timestamp created, Timestamp updated) {
        this.odeme_id = odeme_id;
        this.odeme_toplam = odeme_toplam;
        this.odeme_turu = odeme_turu;
        this.created = created;
        this.updated = updated;
    }

    public Odeme(int odeme_id, String odeme_toplam, String odeme_turu, Timestamp created) {
        this.odeme_id = odeme_id;
        this.odeme_toplam = odeme_toplam;
        this.odeme_turu = odeme_turu;
        this.created = created;
    }

    public Odeme(String odeme_toplam, String odeme_turu, Timestamp created) {
        this.odeme_toplam = odeme_toplam;
        this.odeme_turu = odeme_turu;
        this.created = created;
    }

    public int getOdeme_id() {
        return odeme_id;
    }

    public void setOdeme_id(int odeme_id) {
        this.odeme_id = odeme_id;
    }

    public String getOdeme_toplam() {
        return odeme_toplam;
    }

    public void setOdeme_toplam(String odeme_toplam) {
        this.odeme_toplam = odeme_toplam;
    }

    public String getOdeme_turu() {
        return odeme_turu;
    }

    public void setOdeme_turu(String odeme_turu) {
        this.odeme_turu = odeme_turu;
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
