package com.aziz.projets.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aziz.projets.entities.Projet;
import com.aziz.projets.service.ProjetService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProjetRESTController {
    @Autowired
    ProjetService projetService;

    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<Projet> getAllProjets() {
        return projetService.getAllProjets();
    }

    @RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
    public Projet getProjetById(@PathVariable("id") Long id) {
        return projetService.getProjet(id);
    }

    @RequestMapping(path="/addproj" ,  method = RequestMethod.POST)
    public Projet createProjet(@RequestBody Projet projet) {
        return projetService.saveProjet(projet);
    }

    @RequestMapping(path = "/updateproj",method = RequestMethod.PUT)
    public Projet updateProjet(@RequestBody Projet projet) {
        return projetService.updateProjet(projet);
    }

    @RequestMapping(value = "/delproj/{id}", method = RequestMethod.DELETE)
    public void deleteProjet(@PathVariable("id") Long id) {
        projetService.deleteProjetById(id);
    }

    @RequestMapping(value = "/projsdom/{idDom}", method = RequestMethod.GET)
    public List<Projet> getProjetByDomId(@PathVariable("idDom") Long idDom) {
        return projetService.findByDomaineIdDom(idDom);
    }

}
