package ie.atu.cicd1.catalog.cicd1catalogservice.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}