package org.microcommerce.ws.web;

import org.microcommerce.ws.ProduitDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class productController {
	
	@GetMapping("")
	public String getMessageHello() {
		return "hello you are here in Micro WS application !!!!";
	}

	 @GetMapping("/produits")
	   public String listeProduits() {
	       return "Un exemple de produits";
	   }
	 @GetMapping("/produits/{id}")
	 public ProduitDTO afficherUnProduit(@PathVariable int id) {
	   return ProduitDTO.builder()
			   .nom("produit "+id)
			   .prix(id*10)
			   .id(id)
			   .build();
	 }
}
