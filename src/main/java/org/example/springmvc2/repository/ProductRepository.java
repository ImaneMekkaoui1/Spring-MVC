package org.example.springmvc2.repository;
import org.example.springmvc2.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Imane Mekkaoui
 */
public interface ProductRepository extends JpaRepository<Product ,Long> {
    List<Product> findByNameContains(String keyword);

}
