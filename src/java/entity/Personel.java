
package entity;

import java.sql.Timestamp;

public class Personel {
    private int personel_id;
    private String personel_name;
    private String personel_tc;
    private String personel_telefon;
    private String personel_maas;
    private Timestamp created;
    private Timestamp updated;

    public Personel() {
    }

    public Personel(int personel_id, String personel_name, String personel_tc, String personel_telefon, String personel_maas, Timestamp created, Timestamp updated) {
        this.personel_id = personel_id;
        this.personel_name = personel_name;
        this.personel_tc = personel_tc;
        this.personel_telefon = personel_telefon;
        this.personel_maas = personel_maas;
        this.created = created;
        this.updated = updated;
    }

    public Personel(int personel_id, String personel_name, String personel_tc, String personel_telefon, String personel_maas, Timestamp created) {
        this.personel_id = personel_id;
        this.personel_name = personel_name;
        this.personel_tc = personel_tc;
        this.personel_telefon = personel_telefon;
        this.personel_maas = personel_maas;
        this.created = created;
    }

    public Personel(String personel_name, String personel_tc, String personel_telefon, String personel_maas, Timestamp created) {
        this.personel_name = personel_name;
        this.personel_tc = personel_tc;
        this.personel_telefon = personel_telefon;
        this.personel_maas = personel_maas;
        this.created = created;
    }
    
    

    public int getPersonel_id() {
        return personel_id;
    }

    public void setPersonel_id(int personel_id) {
        this.personel_id = personel_id;
    }

    public String getPersonel_name() {
        return personel_name;
    }

    public void setPersonel_name(String personel_name) {
        this.personel_name = personel_name;
    }

    public String getPersonel_tc() {
        return personel_tc;
    }

    public void setPersonel_tc(String personel_tc) {
        this.personel_tc = personel_tc;
    }

    public String getPersonel_telefon() {
        return personel_telefon;
    }

    public void setPersonel_telefon(String personel_telefon) {
        this.personel_telefon = personel_telefon;
    }

    public String getPersonel_maas() {
        return personel_maas;
    }

    public void setPersonel_maas(String personel_maas) {
        this.personel_maas = personel_maas;
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
