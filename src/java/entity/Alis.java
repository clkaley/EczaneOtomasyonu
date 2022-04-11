/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Timestamp;

/**
 *
 * @author Taha
 */
public class Alis {
    
    private int alis_id;
    private int alis_fiyati;
    private String alinan_firma;
    private String alinan_tarih;
    private Timestamp created;
    private Timestamp updated;

    public Alis() {
    }
    

    public Alis(int alis_id, int alis_fiyati, String alinan_firma, String alinan_tarih, Timestamp created, Timestamp updated) {
        this.alis_id = alis_id;
        this.alis_fiyati = alis_fiyati;
        this.alinan_firma = alinan_firma;
        this.alinan_tarih = alinan_tarih;
        this.created = created;
        this.updated = updated;
    }
    
    public Alis(int alis_id, int alis_fiyati, String alinan_firma, String alinan_tarih, Timestamp created) {
        this.alis_id = alis_id;
        this.alis_fiyati = alis_fiyati;
        this.alinan_firma = alinan_firma;
        this.alinan_tarih = alinan_tarih;
        this.created = created;
    }
    
    public Alis(int alis_fiyati, String alinan_firma, String alinan_tarih, Timestamp created) {
        this.alis_fiyati = alis_fiyati;
        this.alinan_firma = alinan_firma;
        this.alinan_tarih = alinan_tarih;
        this.created = created;
    }


    public int getAlis_id() {
        return alis_id;
    }

    public void setAlis_id(int alis_id) {
        this.alis_id = alis_id;
    }

    public int getAlis_fiyati() {
        return alis_fiyati;
    }

    public void setAlis_fiyati(int alis_fiyati) {
        this.alis_fiyati = alis_fiyati;
    }

    public String getAlinan_firma() {
        return alinan_firma;
    }

    public void setAlinan_firma(String alinan_firma) {
        this.alinan_firma = alinan_firma;
    }

    public String getAlinan_tarih() {
        return alinan_tarih;
    }

    public void setAlinan_tarih(String alinan_tarih) {
        this.alinan_tarih = alinan_tarih;
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
