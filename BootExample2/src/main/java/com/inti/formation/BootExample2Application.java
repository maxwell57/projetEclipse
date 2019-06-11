package com.inti.formation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.inti.formation.entities.Produit;
import com.inti.formation.imetier.IProduitMetier;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BootExample2Application {

//		@Autowired
//		private IProduitMetier metier;

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.inti.formation")).build();


	}			
		
	public static void main(String[] args) {
		SpringApplication.run(BootExample2Application.class, args);


//		@Override
//		public void run(String... args) throws Exception {
//			// TODO Auto-generated method stub
//			Produit p = new Produit (1, "Salade",5, 2);
//			Produit p1 = new Produit (2, "Tomate",10, 3);
//			Produit p2 = new Produit (3, "Oignon",20, 4);
			//		
//			metier.ajouter(p);
//			metier.ajouter(p1);
//			metier.ajouter(p2);
			// System.out.println(metier.ajouter(p));
			//		 p1.setAge(99);
			//		 System.out.println(metier.update(p1));
			//		System.out.println(metier.findOne(1));
			//		List<Produit> produits = metier.findAll();
			//				for (Produit produit : produits) {
			//					System.out.println(produit);
			//				}

			//		metier.delete(2);

		
	}
	
	
}



