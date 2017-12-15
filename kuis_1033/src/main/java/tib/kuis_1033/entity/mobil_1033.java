/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tib.kuis_1033.entity;
import java.io.Serializable;
import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "mobil_1033")

/**
 *
 * @author PC-5-320
 */
public class mobil_1033 implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 
    private Long id_mobil;
    @Column(length = 255, nullable = false)
    private String nama;
    @Column(length = 255, nullable = false)
    private String jumlah;
    @Column(length = 255, nullable = false)
    private String warna;
    @Column(length = 255, nullable = false)
    
   
    
    @OneToMany
   
    @JoinColumn(name="id_mobil")
    private Set<aksesoris_1033> aksesoris_1033;

    
    /**
     * @return the 
     * 
     */
    public Long getid_mobil() {
        return id_mobil;
    }

    /**
     * @param nim t to set
     */
    public void setid_mobil(Long id_mobil) {
        this.id_mobil = id_mobil;
    }

 
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
     public String getjumlah() {
        return jumlah;
    }

    public void setjumlah(String jumlah) {
        this.jumlah = jumlah;
    }
    
     public String getwarna() {
        return warna;
    }

    public void setwarna(String warna) {
        this.warna = warna;
    }


    

    

    
    
  
}




