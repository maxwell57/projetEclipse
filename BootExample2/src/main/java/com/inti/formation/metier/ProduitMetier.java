package com.inti.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.Produit;
import com.inti.formation.imetier.IProduitMetier;
import com.inti.formation.repository.IProduitRepository;

@Service
public class ProduitMetier implements IProduitMetier{

	@Autowired
	private IProduitRepository repo;

	@Override
	public Produit ajouter(Produit p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public Produit update(Produit p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Produit findOne(Integer id) {
		// TODO Auto-generated method stub
		return repo.getOne(id);
	}

	@Override
	public List<Produit> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
//	@Override
//	public Produit rechercherpParQuantitéEtPrix(int quantité, int prix) {
//		// TODO Auto-generated method stub
//		return repo.findByQuantitéAndPrix(quantité, prix);
//	}
//
//	@Override
//	public Produit rechercherpParQuantitéEtdescription(int quantité, String description) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Produit rechercherpParDescriptionEtPrix(String description, int prix) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
