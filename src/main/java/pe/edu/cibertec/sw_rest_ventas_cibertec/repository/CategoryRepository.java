package pe.edu.cibertec.sw_rest_ventas_cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.sw_rest_ventas_cibertec.model.Category;

import java.util.Optional;

@Repository
public interface CategoryRepository
        extends JpaRepository<Category, Integer> {

    Optional<Category> findByCategoryname(String categoryName);

}
