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
import tib.kuis_1033.entity.mobil_1033;
import tib.kuis_1033.service.mobil_1033Service;

/**
 *
 * @author PC-5-320
 */
public class mobil_1033Controller {
    
    @Autowired
    private mobil_1033Service mobil_1033Service;

    @RequestMapping(method = RequestMethod.POST)
    public mobil_1033 insert(@RequestBody mobil_1033 mobil_1033) {
        return mobil_1033Service.insert(mobil_1033);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public mobil_1033 update(@RequestBody mobil_1033 mobil_1033) {
        return mobil_1033Service.update(mobil_1033);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_mobil}")
    public boolean delete(@PathVariable("id_mobil") Long id_mobil) {
        return mobil_1033Service.delete(id_mobil);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_mobil}")
    public mobil_1033 getById(@PathVariable("id_mobil") Long id_mobil){
        return mobil_1033Service.getById_mobil(id_mobil);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<mobil_1033> getAll(){
        return mobil_1033Service.getAll();
    }
}
