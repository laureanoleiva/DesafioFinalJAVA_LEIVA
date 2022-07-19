package com.desafiofinal_leiva.desafiofinal_leiva.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiofinal_leiva.desafiofinal_leiva.Entidad.Producto
import com.desafiofinal_leiva.desafiofinal_leiva.Service.ProductoService

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> findAll() {
        return this.productoService.findAll();
    }

    // Single item

    @GetMapping("/{id}")
    public Producto one(@PathVariable Integer id) {

        return this.productoService.findById(id);
    }

    @PostMapping
    public Producto newEntity(@RequestBody Producto producto) {
        return this.productoService.save(producto);
    }
}


