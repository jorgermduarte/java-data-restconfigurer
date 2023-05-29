package pt.jorgeduarte.spring.data.rest.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.jorgeduarte.spring.data.rest.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
