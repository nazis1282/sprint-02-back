package com.aziz.projets;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aziz.projets.entities.Domaine;
import com.aziz.projets.entities.Projet;
import com.aziz.projets.repos.ProjetRepository;

@SpringBootTest
class ProjetsApplicationTests {
	@Autowired
	private ProjetRepository projetRepository;


	@Test
public void testCreateProjet() {
Projet proj = new Projet("agame","aziz",2250.500,new Date());
projetRepository.save(proj);
}

@Test
public void testFindProjet()
{
Projet p = projetRepository.findById(1L).get();
System.out.println(p);
}

@Test
public void testUpdateProjet()
{
Projet p = projetRepository.findById(1L).get();
p.setCout(1000.0);
projetRepository.save(p);
}

@Test
public void testDeleteProjet()
{
projetRepository.deleteById(1L);;
}

@Test
public void testListerTousProjets()
{
List<Projet> projs = projetRepository.findAll();
for (Projet p : projs)
{
System.out.println(p);
}}

@Test
public void testFindByNomProjet()
{
List<Projet> projs = projetRepository.findByNomProjet("agame");
for (Projet p : projs)
{
System.out.println(p);
}
}

@Test
public void testFindByNomProjetContains ()
{
List<Projet> projs=projetRepository.findByNomProjetContains("game");
for (Projet p : projs)
{
System.out.println(p);
} }

@Test
public void testFindByNomCout(){
	List<Projet> prods = projetRepository.findByNomCout("agame", 1000.0);
for (Projet p : prods)
{
System.out.println(p);
}
}

@Test
public void testfindByDomaine()
{
Domaine dom = new Domaine();
dom.setIdDom(1L);
List<Projet> projs = projetRepository.findByDomaine(dom);
for (Projet p : projs)
{
System.out.println(p);
}
}
@Test
public void testfindByDomaineIdDom()
{
List<Projet> projs = projetRepository.findByDomaineIdDom(1L);
for (Projet p : projs)
{
System.out.println(p);
}
 }

 @Test
public void testfindByOrderByNomProjetAsc()
{
List<Projet> projs =
projetRepository.findByOrderByNomProjetAsc();
for (Projet p : projs)
{
System.out.println(p);
}
}

@Test
public void testTrierProjetsNomsCout()
{
List<Projet> projs = projetRepository.trierProjetsNomsCout();
for (Projet p : projs)
{
System.out.println(p);
}
}



}
