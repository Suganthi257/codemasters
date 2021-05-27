package com.cts.codemasters.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.codemasters.entity.Product;
import com.cts.codemasters.service.IProductService;
@RestController
public class ProductController 
{
@Autowired
private IProductService productService;
//mapping the getProduct() method to /product
@GetMapping(value = "/product")
public List<Product> getProduct() 
{
//finds all the products
List<Product> products = productService.findAll();
//returns the product list
return products;
}
}
