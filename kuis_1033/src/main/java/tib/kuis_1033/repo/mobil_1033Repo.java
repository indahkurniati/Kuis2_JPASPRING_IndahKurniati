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
import tib.kuis_1033.entity.mobil_1033;

/**
 *
 * @author PC-5-320
 */
public interface mobil_1033Repo extends CrudRepository<mobil_1033, Long> {
      @Query("select i from mobil_1033 i")
    public List<mobil_1033> findAllmobil_1033();
    
}
