package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Product;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductServiceController {
    private static Map<Integer, Product> productRepo = new HashMap<>();
    static {
        Product shirt1 = new Product();
        shirt1.setId(10001);
        shirt1.setName("Shirt10001");
        productRepo.put(shirt1.getId(), shirt1);

        Product shirt2 = new Product();
        shirt2.setId(10002);
        shirt2.setName("Shirt10002");
        productRepo.put(shirt2.getId(), shirt2);
    }

    @RequestMapping(value = "/products")
    public ResponseEntity<Object> getProduct() {
        return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
        productRepo.put(product.getId(), product);
        return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") Integer id) {
        productRepo.remove(id);
        return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") Integer id, @RequestBody Product product) {
        productRepo.remove(id);
        product.setId(product.getId());
        productRepo.put(product.getId(), product);
        return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
    }


}