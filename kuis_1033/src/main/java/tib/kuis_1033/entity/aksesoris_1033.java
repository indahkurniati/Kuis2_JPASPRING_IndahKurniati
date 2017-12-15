/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tib.kuis_1033.entity;
import java.io.Serializable;
import java.sql.Blob;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "aksesoris_1033")


/**
 *
 * @author PC-5-320
 */
public class aksesoris_1033 implements Serializable {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mobil;
    @Column(length = 255, nullable = false)
    private Long id_aksesoris;
    private String nama_aksesoris;
    private String jumlah_aksesoris;
    private String warna_aksesoris;
   
    
   

   
    
    public Long getid_mobil() {
        return id_mobil;
    }

   
    public void setid_mobil(Long id_mobil) {
        this.id_mobil = id_mobil;
    }

    
    public Long getid_aksesoris() {
        return id_aksesoris;
    }


    public void setid_aksesoris(Long kode_cv) {
        this.id_aksesoris = id_aksesoris;
    }

   
    public String getnama_aksesoris() {
        return nama_aksesoris;
    }

  
    public void setnama_aksesoris(String nama_aksesoris) {
        this.nama_aksesoris = nama_aksesoris;
    }

    public String getjumlah_aksesoris() {
        return jumlah_aksesoris;
    }

  
    public void setjumlah_aksesoris(String jumlah_aksesoris) {
        this.jumlah_aksesoris = jumlah_aksesoris;
    }
    
    public String getwarna_aksesoris() {
        return warna_aksesoris;
    }

  
    public void setwarna_aksesoris(String warna_aksesoris) {
        this.warna_aksesoris = warna_aksesoris;
    }
    
    


}