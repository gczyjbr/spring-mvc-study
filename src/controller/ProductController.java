package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Product;

/**
 * 
 * @author ÁõÉ­»ª 2019/04/01
 */

@Controller
public class ProductController {

  @RequestMapping("addProduct")
  public ModelAndView add(Product product) throws Exception {
    ModelAndView mav = new ModelAndView("showProduct");
    return mav;
  }
}
