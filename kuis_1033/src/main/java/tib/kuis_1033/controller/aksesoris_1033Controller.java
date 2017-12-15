/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tib.kuis_1033.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tib.kuis_1033.entity.aksesoris_1033;
import tib.kuis_1033.service.aksesoris_1033Service;

/**
 *
 * @author PC-5-320
 */
public class aksesoris_1033Controller {
    

    @Autowired
    private aksesoris_1033Service aksesoris_1033Service;

    @RequestMapping(method = RequestMethod.POST)
    public aksesoris_1033 insert(@RequestBody aksesoris_1033 nama) {
        return aksesoris_1033Service.insert(nama);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public aksesoris_1033 update(@RequestBody aksesoris_1033 nama) {
        return aksesoris_1033Service.update(nama);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_aksesoris}")
    public boolean delete(@PathVariable("id_aksesoris") Long id_aksesoris) {
        return aksesoris_1033Service.delete(id_aksesoris);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_aksesoris}")
    public aksesoris_1033 getById(@PathVariable("id_aksesoris") Long id_aksesoris){
        return aksesoris_1033Service.getById_aksesoris(id_aksesoris);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<aksesoris_1033> getAll(){
        return aksesoris_1033Service.getAll();
    }
}
