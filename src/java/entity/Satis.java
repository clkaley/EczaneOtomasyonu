/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Timestamp;


public class Satis {
    private int satis_id;
    private int satis_fiyati;
    private String satilan_tarih;
    private Timestamp created;
    private Timestamp updated;

    public Satis() {
    }
    

    public Satis(int satis_id, int satis_fiyati, String satilan_tarih, Timestamp created, Timestamp updated) {
        this.satis_id = satis_id;
        this.satis_fiyati = satis_fiyati;
        this.satilan_tarih = satilan_tarih;
        this.created = created;
        this.updated = updated;
    }
    
    public Satis(int satis_id, int satis_fiyati, String satilan_tarih, Timestamp created) {
        this.satis_id = satis_id;
        this.satis_fiyati = satis_fiyati;
        this.satilan_tarih = satilan_tarih;
        this.created = created;
    }


    public int getSatis_id() {
        return satis_id;
    }

    public void setSatis_id(int satis_id) {
        this.satis_id = satis_id;
    }

    public int getSatis_fiyati() {
        return satis_fiyati;
    }

    public void setSatis_fiyati(int satis_fiyati) {
        this.satis_fiyati = satis_fiyati;
    }

    public String getSatilan_tarih() {
        return satilan_tarih;
    }

    public void setSatilan_tarih(String satilan_tarih) {
        this.satilan_tarih = satilan_tarih;
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
