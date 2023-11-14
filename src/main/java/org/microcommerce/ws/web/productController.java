package org.microcommerce.ws.web;

import java.util.List;

import org.microcommerce.ws.dtos.ProduitDTO;
import org.microcommerce.ws.repositories.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class productController {
	private final ProductRepository productRepository;
	
	@GetMapping("")
	public String getMessageHello() {
		return "hello you are here in Micro WS application !!!!";
	}

	 @GetMapping("/produits")
	   public List<ProduitDTO> listeProduits() {
	       return productRepository.findAll();
	   }
	 @GetMapping("/produits/{id}")
	 public ProduitDTO afficherUnProduit(@PathVariable int id) {
	   return productRepository.findById(id);
	 }
}
