package com.aziz.projets.entities;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProjet;
    private String nomProjet;
    private String Manager;
    private Double cout;
    private Date startDate;
    
    @ManyToOne
    private Domaine domaine;

    public Domaine getDomaine() {
        return domaine;
    }


    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }


    public Long getIdProjet() {
        return idProjet;
    }
    

    public void setIdProjet(Long idProjet) {
        this.idProjet = idProjet;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public String getManager() {
        return Manager;
    }

    public void setManager(String manager) {
        Manager = manager;
    }

    public Double getCout() {
        return cout;
    }

    public void setCout(Double cout) {
        this.cout = cout;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

public Projet() {
super();
}

public Projet(String nomProjet,String Manager, Double cout, Date startDate) {
    super();
    this.nomProjet = nomProjet;
    this.Manager=Manager;
    this.cout = cout;
    this.startDate = startDate;
    }
    @Override
public String toString() {
return "Projet [idProjet=" + idProjet + ", nomProjet=" +
nomProjet + ", Cout=" + cout +" ,Manager" + Manager
+ ", startDate=" + startDate + "]";
}


}
