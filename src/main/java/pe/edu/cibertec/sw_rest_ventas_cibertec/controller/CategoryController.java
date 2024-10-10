package pe.edu.cibertec.sw_rest_ventas_cibertec.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.sw_rest_ventas_cibertec.exception.ResourceNotFoundException;
import pe.edu.cibertec.sw_rest_ventas_cibertec.model.Category;
import pe.edu.cibertec.sw_rest_ventas_cibertec.service.ICategoryService;

import java.util.List;
//@CrossOrigin(origins = {"http://cibertec.edu.pe","http://cibertec-ventas.edu.pe"})
//@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/category")
public class CategoryController {
    private final ICategoryService categoryService;


    @GetMapping("")
    public ResponseEntity<List<Category>> listarCategorias(){
        List<Category> categoryList = categoryService.obtenerCategorias();
        if(categoryList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> obtenerCategoriaXid(
            @PathVariable Integer id
    ){
        Category category = categoryService.obtenerCategoria(id)
                .orElseThrow(() -> new ResourceNotFoundException("La categoria " +
                        "con el id "+id+" no existe"));
        return new ResponseEntity<>(category, HttpStatus.OK);
    }
    //localhost:8080/api/v1/category?categoryName=
    @GetMapping("/")
    public ResponseEntity<Category> obtenerCategoriaXNombre(
            @RequestParam String categoryName
    ){
        Category category = categoryService.obtenerCategoriaXnombre(categoryName)
                .orElseThrow(() -> new ResourceNotFoundException("La categoria " +
                        "con el nombew "+categoryName+" no existe"));
        return new ResponseEntity<>(category, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Category> registrarCategoria(
            @RequestBody Category category
    ){
        return new ResponseEntity<>(
                categoryService.guardarCategoria(category),
                HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> actualizarCategoria(
            @PathVariable Integer id,
            @RequestBody Category category
    ){
        Category currentCategory = categoryService.obtenerCategoria(id)
                .orElseThrow(() -> new ResourceNotFoundException("La categoria" +
                        "con el ID = "+ id+", no existe"));
        currentCategory.setCategoryname(category.getCategoryname());
        currentCategory.setDescription(category.getDescription());
        return new ResponseEntity<>(
                categoryService.guardarCategoria(currentCategory),
                HttpStatus.ACCEPTED);
    }



}
