package pe.edu.cibertec.sw_rest_ventas_cibertec.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.sw_rest_ventas_cibertec.model.Product;
import pe.edu.cibertec.sw_rest_ventas_cibertec.service.IProductService;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Override
    public Product registrarProducto(Product product) {
        return null;
    }

    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public List<Product> obtenerProductosMayoresXStock(int stock) {
        return List.of();
    }
}
