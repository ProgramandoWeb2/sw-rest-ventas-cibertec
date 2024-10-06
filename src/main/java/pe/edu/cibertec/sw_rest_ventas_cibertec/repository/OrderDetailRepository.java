package pe.edu.cibertec.sw_rest_ventas_cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.sw_rest_ventas_cibertec.model.OrderDetail;
import pe.edu.cibertec.sw_rest_ventas_cibertec.model.pk.ProductOrderId;

@Repository
public interface OrderDetailRepository extends
        JpaRepository<OrderDetail, ProductOrderId> {
}
