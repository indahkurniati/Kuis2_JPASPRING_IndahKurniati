/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tib.kuis_1033.service;
import tib.kuis_1033.entity.aksesoris_1033;
import tib.kuis_1033.repo.aksesoris_1033Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service("aksesoris_1033Service")
 @Transactional
/**
 *
 * @author PC-5-320
 */
public class aksesoris_1033Service {
   
    @Autowired
    private aksesoris_1033Repo repo;

    public aksesoris_1033 insert(aksesoris_1033 idn) {
        return repo.save(idn);
    }
    
    public aksesoris_1033 update(aksesoris_1033 idn) {
        return repo.save(idn);
    }
    
    public boolean delete(Long id_aksesoris){
        repo.delete(id_aksesoris);
        return true;
    }
    
    public aksesoris_1033 getById_aksesoris(Long id_aksesoris){
        return repo.findOne(id_aksesoris);
    }
    
    public List<aksesoris_1033> getAll(){
        return repo.findAllaksesoris_1033();
    }
}

    

