/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tao Zhao
 */
package org.shareok.data.webserv;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlosWebController{
 
   //@RequestMapping(method = RequestMethod.GET)
//     @RequestMapping("/")
//   public ModelAndView printHome() {
//       ModelAndView model = new ModelAndView();
//       System.out.print("\n **** ok the program at least gets here\n");
//       model.setViewName("plosWeb");
//      model.addObject("message", "Hello Spring MVC Framework!");
//
//      return model;
//   }
   
    @RequestMapping("/plos")
   public ModelAndView printHello() {
       ModelAndView model = new ModelAndView();
       System.out.print("\n **** ok the program at least gets here\n");
       model.setViewName("plosWeb");
      model.addObject("message", "Hello Spring MVC Framework!");

      return model;
   }

   @RequestMapping("/sage")
   public ModelAndView printSage() {
       ModelAndView model = new ModelAndView();
       System.out.print("\n **** ok the program at least gets here\n");
       model.setViewName("plosWeb");
      model.addObject("message", "Hello Spring MVC Framework for sage!");

      return model;
   }
}