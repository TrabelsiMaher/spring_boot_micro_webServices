package org.microcommerce.ws.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.microcommerce.ws.dtos.ProduitDTO;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository implements ProductDao {

	 public static List<ProduitDTO> products = new ArrayList<ProduitDTO>();

	   static {
	       products.add(new ProduitDTO(1, "Ordinateur portable", 350));
	       products.add(new ProduitDTO(2, "Aspirateur Robot", 500));
	       products.add(new ProduitDTO(3, "Table de Ping Pong", 750));
	   }

	@Override
	public List<ProduitDTO> findAll() {
		
		return products;
	}

	@Override
	public ProduitDTO findById(int id) {
		
		return (ProduitDTO) products.stream().filter(elt ->elt.getId()==id).collect(Collectors.toList()).get(0);
						
	}

	@Override
	public ProduitDTO save(ProduitDTO product) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
