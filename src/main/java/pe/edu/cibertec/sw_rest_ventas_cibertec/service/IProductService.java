package pe.edu.cibertec.sw_rest_ventas_cibertec.service;

import pe.edu.cibertec.sw_rest_ventas_cibertec.model.Product;

import java.util.List;


public interface IProductService {

    Product registrarProducto(Product product);

    List<Product> obtenerProductosMayoresXStock(int stock);

}
