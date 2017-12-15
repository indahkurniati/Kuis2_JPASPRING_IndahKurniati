/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tib.kuis_1033.service;
import tib.kuis_1033.entity.mobil_1033;
import tib.kuis_1033.repo.mobil_1033Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service("mobil_1033Service")
 @Transactional
/**
 *
 * @author PC-5-320
 */
public class mobil_1033Service {
   
    @Autowired
    private mobil_1033Repo repo;

    public mobil_1033 insert(mobil_1033 idn) {
        return repo.save(idn);
    }
    
    public mobil_1033 update(mobil_1033 idn) {
        return repo.save(idn);
    }
    
    public boolean delete(Long id_mobil){
        repo.delete(id_mobil);
        return true;
    }
    
    public mobil_1033 getById_mobil(Long id_mobil){
        return repo.findOne(id_mobil);
    }
    
    public List<mobil_1033> getAll(){
        return repo.findAllmobil_1033();
    }
}

    

