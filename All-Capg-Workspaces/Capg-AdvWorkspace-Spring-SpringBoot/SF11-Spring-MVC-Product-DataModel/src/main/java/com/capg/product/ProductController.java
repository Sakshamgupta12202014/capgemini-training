package com.capg.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	/*
    @Autowired
    - Injects LoginService automatically
    - Dependency Injection (DI)
   */
   @Autowired
   private ProductService productService;

   /*
    @RequestMapping("/login.spring")
    - Maps URL to this method
    - Called when form is submitted
   */
   @RequestMapping("/product.spring")
   public ModelAndView productValid(@RequestParam int product_no, @RequestParam String product_name, @RequestParam float product_price) {

       ModelAndView mav = new ModelAndView();
       Product dbProduct = productService.checkProduct(product_no, product_name, product_price);

       if (dbProduct != null) {
           mav.addObject("product_no", dbProduct.getProduct_no());
           mav.addObject("product_name", dbProduct.getProduct_name());
           mav.addObject("product_price", dbProduct.getPrice());
           
           mav.setViewName("/Success.jsp");
       } else {
           mav.setViewName("/Failed.jsp");
       }
       return mav;
   }
}
