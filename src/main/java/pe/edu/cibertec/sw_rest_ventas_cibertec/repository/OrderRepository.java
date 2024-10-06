package pe.edu.cibertec.sw_rest_ventas_cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.sw_rest_ventas_cibertec.model.Order;

@Repository
public interface OrderRepository extends
        JpaRepository<Order, Integer> {
}
