package ie.atu.cicd1.catalog.cicd1catalogservice.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.price >= :price")
    List<Product> findByMinPrice(@Param("price") BigDecimal price);

    @Query("SELECT p FROM Product p JOIN p.category c WHERE c.name = :name")
    List<Product> findByCategoryName(@Param("name") String name);
}