package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author ÁõÉ­»ª 2019/04/01
 */

@Controller
public class CategoryController {

  @RequestMapping("addCategory")
  public ModelAndView addCategory(HttpServletRequest request, HttpServletResponse response) throws Exception {
    ModelAndView mav = new ModelAndView("showCategory");
    return mav;
  }
}
