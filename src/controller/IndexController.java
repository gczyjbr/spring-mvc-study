package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author ÁõÉ­»ª 2019/04/01
 */

/*public class IndexController implements Controller {
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    ModelAndView mav = new ModelAndView("index");
    mav.addObject("message", "Hello Spring MVC");
    return mav;
  }
}*/

@org.springframework.stereotype.Controller
public class IndexController {
  
  @RequestMapping("/index")
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    ModelAndView mav = new ModelAndView("index");
    mav.addObject("message", "Hello Spring MVC");
    return mav;
  }
}
