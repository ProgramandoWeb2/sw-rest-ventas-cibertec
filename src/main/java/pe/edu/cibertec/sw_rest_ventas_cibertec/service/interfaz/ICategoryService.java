package pe.edu.cibertec.sw_rest_ventas_cibertec.service.interfaz;

import pe.edu.cibertec.sw_rest_ventas_cibertec.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {

    Category guardarCategoria(Category category);

    List<Category> obtenerCategorias();

    Optional<Category> obtenerCategoria(Integer id);

    Optional<Category> obtenerCategoriaXnombre(String categoryName);

}
