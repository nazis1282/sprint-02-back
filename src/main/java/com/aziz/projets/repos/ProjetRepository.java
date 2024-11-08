package com.aziz.projets.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aziz.projets.entities.*;

@RepositoryRestResource(path = "rest")
public interface ProjetRepository extends JpaRepository<Projet, Long> {
    List<Projet> findByNomProjet(String nom);
    List<Projet> findByNomProjetContains(String nom);
    List<Projet> findByDomaineIdDom(Long id);
    List<Projet> findByOrderByNomProjetAsc();

    @Query("select p from Projet p where p.nomProjet like %?1 and p.cout > ?2")
    List<Projet> findByNomCout (String nom, Double cout);

    @Query("select p from Projet p where p.domaine = ?1")
    List<Projet> findByDomaine(Domaine domaine);

    @Query("select p from Projet p order by p.nomProjet ASC, p.cout DESC")
    List<Projet> trierProjetsNomsCout ();
}
