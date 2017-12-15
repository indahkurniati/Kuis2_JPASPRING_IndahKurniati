/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tib.kuis_1033.repo;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tib.kuis_1033.entity.aksesoris_1033;

/**
 *
 * @author PC-5-320
 */
public interface aksesoris_1033Repo extends CrudRepository<aksesoris_1033, Long> {
      @Query("select i from aksesoris_1033 i")
    public List<aksesoris_1033> findAllaksesoris_1033();
    
    
    
    
}

