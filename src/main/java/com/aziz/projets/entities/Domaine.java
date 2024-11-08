package com.aziz.projets.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Domaine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDom;
    private String nomDom;

@JsonIgnore
@OneToMany(mappedBy = "domaine")
private List<Projet> projets;


public Long getIdDom() {
    return idDom;
}
public void setIdDom(Long idDom) {
    this.idDom = idDom;
}
public String getNomDom() {
    return nomDom;
}
public void setNomDom(String nomDom) {
    this.nomDom = nomDom;
}
public List<Projet> getProjets() {
    return projets;
}
public void setProjets(List<Projet> projets) {
    this.projets = projets;
}
public Domaine(){}
public Domaine(Long idDom, String nomDom, List<Projet> projets) {
    this.idDom = idDom;
    this.nomDom = nomDom;
    this.projets = projets;
}



}
