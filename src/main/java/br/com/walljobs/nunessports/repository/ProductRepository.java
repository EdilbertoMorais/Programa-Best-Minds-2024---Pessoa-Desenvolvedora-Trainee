package br.com.walljobs.nunessports.repository;

import br.com.walljobs.nunessports.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
