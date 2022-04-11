
package entity;

import java.util.Date;
import java.sql.Timestamp;

public class Alis {
    private int alis_id;
    private int alis_fiyati;
    private Timestamp created;
    private Timestamp updated;

    public Alis() {
    }

    public Alis(int alis_id, int alis_fiyati, Timestamp created) {
        this.alis_id = alis_id;
        this.alis_fiyati = alis_fiyati;
        this.created = created;
    }

    public Alis(int alis_fiyati, Timestamp created) {
        this.alis_fiyati = alis_fiyati;
        this.created = created;
    }
    
    

    public Alis(int alis_id, int alis_fiyati, Timestamp created, Timestamp updated) {
        this.alis_id = alis_id;
        this.alis_fiyati = alis_fiyati;
        this.created = created;
        this.updated = updated;
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
