
package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.formation.entities.Produit;


public interface IProduitRepository extends JpaRepository<Produit, Integer>{

//      public Produit findByQuantitéAndPrix(int qte,int prix);
//
//	//		@Query("select p from Produit p where p.description=:x")
//
//	//		public Produit getByName(@Param("x") String description);
//
//	@Query(value="select * from produit where description=:x" , nativeQuery=true)
//	public Produit getByName(@Param("x") String description);

}


