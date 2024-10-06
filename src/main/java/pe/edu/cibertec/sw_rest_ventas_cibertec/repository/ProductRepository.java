package pe.edu.cibertec.sw_rest_ventas_cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.sw_rest_ventas_cibertec.model.Product;

import java.util.List;

@Repository
public interface ProductRepository extends
        JpaRepository<Product, Integer> {

    List<Product> findAllByUnitsinstockGreaterThan(int stock);
}
