package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
  
  @RequestMapping("/jump")
  public ModelAndView jump() {
    ModelAndView mav = new ModelAndView("redirect:/index");
    return mav;
  }
  
  @RequestMapping("/check")
  public ModelAndView check(HttpSession session) {
    Integer i = (Integer) session.getAttribute("count");
    if (i == null)
      i = 0;
    i++;
    session.setAttribute("count", i);
    ModelAndView mav = new ModelAndView("check");
    return mav;
  }
  
  @RequestMapping("/clear")
  public ModelAndView clear(HttpSession session) {
    session.setAttribute("count", null);
    ModelAndView mav = new ModelAndView("redirect:/check");
    return mav;
  }
}
