package com.inti.formation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.entities.Produit;
import com.inti.formation.imetier.IProduitMetier;

@RestController
@RequestMapping("/apiProduit")
public class ProduitRestController {
	
	@Autowired
	private IProduitMetier metier;
	
	
	@RequestMapping(value="/produits", method=RequestMethod.GET)
	public List<Produit> findAll(){
		
		return metier.findAll();
	}
	
	@RequestMapping (value="/produit/{id}", method=RequestMethod.GET)
	public Produit findOne(@PathVariable("id") int id) { 
		
		return metier.findOne(id);
		
		
	}
	
	@RequestMapping(value="/deleteP/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id) {
	
	metier.delete(id);
	
	}
	
	@RequestMapping(value="/ajouterP", method=RequestMethod.POST)
	public Produit ajouter(@RequestBody Produit p) {
	
	return metier.ajouter(p);
	
	}
	
	@RequestMapping(value="/updateP", method=RequestMethod.PUT)
	public Produit update(@RequestBody Produit p) {
	
		return metier.update(p);
		
	}
	
	public IProduitMetier getMetier() {
		return metier;
	}

	public void setMetier(IProduitMetier metier) {
		this.metier = metier;
	}

	public ProduitRestController(IProduitMetier metier) {
		super();
		this.metier = metier;
	}

	public ProduitRestController() {
		super();
	}

	@Override
	public String toString() {
		return "ProduitRestController [metier=" + metier + "]";
	}
	
	
	

}
