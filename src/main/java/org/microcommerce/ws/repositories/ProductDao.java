package org.microcommerce.ws.repositories;

import java.util.List;

import org.microcommerce.ws.dtos.ProduitDTO;

public interface ProductDao {
	  List<ProduitDTO> findAll();
	  ProduitDTO findById(int id);
	  ProduitDTO save(ProduitDTO product);
	}