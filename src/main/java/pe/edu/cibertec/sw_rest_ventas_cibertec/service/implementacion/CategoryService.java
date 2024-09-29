package pe.edu.cibertec.sw_rest_ventas_cibertec.service.implementacion;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.sw_rest_ventas_cibertec.model.Category;
import pe.edu.cibertec.sw_rest_ventas_cibertec.repository.CategoryRepository;
import pe.edu.cibertec.sw_rest_ventas_cibertec.service.interfaz.ICategoryService;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CategoryService implements ICategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category guardarCategoria(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> obtenerCategorias() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> obtenerCategoria(Integer id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Optional<Category> obtenerCategoriaXnombre(String categoryName) {
        return categoryRepository.findByCategoryname(categoryName);
    }
}
