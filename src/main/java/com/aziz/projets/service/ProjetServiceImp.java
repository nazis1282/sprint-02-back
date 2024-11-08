package com.aziz.projets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aziz.projets.entities.Domaine;
import com.aziz.projets.entities.Projet;
import com.aziz.projets.repos.ProjetRepository;

@Service
public class ProjetServiceImp implements ProjetService {

    @Autowired
    ProjetRepository projetRepository;

    @Override
    public Projet saveProjet(Projet p) {
        return projetRepository.save(p);
    }

    @Override
    public Projet updateProjet(Projet p) {
        return projetRepository.save(p);
    }

    @Override
    public void deleteProjet(Projet p) {
        projetRepository.delete(p);
    }

    @Override
    public void deleteProjetById(Long id) {
        projetRepository.deleteById(id);
    }

    @Override
    public Projet getProjet(Long id) {
        return projetRepository.findById(id).get();
    }

    @Override
    public List<Projet> getAllProjets() {
        return projetRepository.findAll();
    }

    @Override
    public List<Projet> findByNomProjet(String nom) {
        return findByNomProjet(nom);
    }

    @Override
    public List<Projet> findByNomProjetContains(String nom) {
        return findByNomProjetContains(nom);
    }

    @Override
    public List<Projet> findByDomaineIdDom(Long id) {
        return projetRepository.findByDomaineIdDom(id);
    }

    @Override
    public List<Projet> findByOrderByNomProjetAsc() {
        return findByOrderByNomProjetAsc();
    }

    @Override
    public List<Projet> findByNomCout(String nom, Double cout) {
        return findByNomCout(nom, cout);
    }

    @Override
    public List<Projet> findByDomaine(Domaine domaine) {
        return findByDomaine(domaine);
    }

    @Override
    public List<Projet> trierProjetsNomsCout() {
        return trierProjetsNomsCout();
    }

}
