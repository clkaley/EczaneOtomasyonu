/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Timestamp;


public class Hasta {
    private int hasta_id;
    private String hasta_name;
    private String hasta_tc;
    private Ilac ilac;
    private Timestamp created;
    private Timestamp updated;

    public Hasta() {
    }

    public Hasta(int hasta_id, String hasta_name, String hasta_tc, Ilac ilac, Timestamp created, Timestamp updated) {
        this.hasta_id = hasta_id;
        this.hasta_name = hasta_name;
        this.hasta_tc = hasta_tc;
        this.ilac = ilac;
        this.created = created;
        this.updated = updated;
    }

    public Hasta(int hasta_id, String hasta_name, String hasta_tc, Ilac ilac, Timestamp created) {
        this.hasta_id = hasta_id;
        this.hasta_name = hasta_name;
        this.hasta_tc = hasta_tc;
        this.ilac = ilac;
        this.created = created;
    }

    public Hasta(String hasta_name, String hasta_tc, Ilac ilac, Timestamp created) {
        this.hasta_name = hasta_name;
        this.hasta_tc = hasta_tc;
        this.ilac = ilac;
        this.created = created;
    }

    public int getHasta_id() {
        return hasta_id;
    }

    public void setHasta_id(int hasta_id) {
        this.hasta_id = hasta_id;
    }

    public String getHasta_name() {
        return hasta_name;
    }

    public void setHasta_name(String hasta_name) {
        this.hasta_name = hasta_name;
    }

    public String getHasta_tc() {
        return hasta_tc;
    }

    public void setHasta_tc(String hasta_tc) {
        this.hasta_tc = hasta_tc;
    }

    public Ilac getIlac() {
        return ilac;
    }

    public void setIlac(Ilac ilac) {
        this.ilac = ilac;
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
