package com.beststore.beststore.controller;
import com.beststore.beststore.dto.productDto;
import com.beststore.beststore.models.product;
import com.beststore.beststore.services.productsRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/products")
public class productcontroller {
    @Autowired
    private productsRepository repo;

    @GetMapping("")
    public String showproductList(Model model){
        List<product> products=repo.findAll();
        model.addAttribute("products",products);
        return "Sussesfully added ";
    }

   @GetMapping("/create")
   public String showcreatepage(Model model){
        productDto productDto=new productDto();
        model.addAttribute("prductDto",productDto);
        return "products";
   }
    @PostMapping("/create")
    public String createproduct(
            @Valid @ModelAttribute productDto productDto,
            BindingResult result
    ){
        return "redirect :/products";
    }





}
