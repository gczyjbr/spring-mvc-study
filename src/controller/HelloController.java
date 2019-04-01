package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author ��ɭ�� 2019/04/01
 */

/*public class HelloController implements Controller {

  @Override
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    ModelAndView mav = new ModelAndView("hello");
    mav.addObject("message", "Hello World");
    return mav;
  }

}*/

@org.springframework.stereotype.Controller
public class HelloController {
   
  @RequestMapping("/hello")
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    ModelAndView mav = new ModelAndView("hello");
    mav.addObject("message", "Hello World");
    return mav;
  }
  
  @RequestMapping("/helloWorld")
  public ModelAndView helloWorld() {
    ModelAndView mav = new ModelAndView("redirect:/hello");
    return mav;
  }
}
