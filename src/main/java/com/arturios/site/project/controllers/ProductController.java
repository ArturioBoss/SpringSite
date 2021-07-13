package com.arturios.site.project.controllers;

import com.arturios.site.project.entities.Product;
//import com.arturios.site.project.entities.Student;
import com.arturios.site.project.services.ProductService;
//import com.arturios.site.project.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/list")
    public String showStudentsList(Model model) {
        List<Product> allProduct = productService.getAllProducts();
        model.addAttribute("productsList", allProduct);
        return "products-list";
    }

}
