/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;
import java.sql.Timestamp;
/**
 *
 * @author ruslu
 */
public class Ilac {
    private int ilac_id;
    private String seri_no;
    private String name;
    private String type;
    private Timestamp created;
    private Timestamp updated;

    public Ilac() {
    }

    public Ilac( String seri_no, String name, String type, Timestamp created) {
        this.ilac_id = ilac_id;
        this.seri_no = seri_no;
        this.name = name;
        this.type = type;
        this.created = created;
    }

    public Ilac(int ilac_id, String seri_no, String name, String type, Timestamp created) {
        this.ilac_id = ilac_id;
        this.seri_no = seri_no;
        this.name = name;
        this.type = type;
        this.created = created;
    }
    
    
    
    public Ilac(int ilac_id, String seri_no, String name, String type, Timestamp created, Timestamp updated) {
        this.ilac_id = ilac_id;
        this.seri_no = seri_no;
        this.name = name;
        this.type = type;
        this.created = created;
        this.updated = updated;
    }

    
    
    public int getIlac_id() {
        return ilac_id;
    }

    public void setIlac_id(int ilac_id) {
        this.ilac_id = ilac_id;
    }

    public String getSeri_no() {
        return seri_no;
    }

    public void setSeri_no(String seri_no) {
        this.seri_no = seri_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.ilac_id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ilac other = (Ilac) obj;
        if(this.ilac_id !=other.ilac_id){
            return false;
        }
        return true;

    }
    
    
    
    
    
}
