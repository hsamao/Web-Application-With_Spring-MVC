package com.samao.dymcWeb.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by hsamao on 10/18/15.
 */
@Controller
public class DispatcherController {

    @RequestMapping(value = "/tutorial", method = RequestMethod.GET)
    public String view(HttpSession httpSession) {
        httpSession.setAttribute("session", "I have been passed form controller");
        return "mainpage";
    }


    @RequestMapping(value = "/sub", method = RequestMethod.GET)
    public String sub(Model model) {

        model.addAttribute("sub_page", "I am using Model instead of using Model And View");
        return "subPage";
    }


    @RequestMapping(value = "/testDB", method = RequestMethod.GET)
    public String test() {
        return "test";
    }

    /*@RequestMapping (value = "/sub", method = RequestMethod.GET)
    public ModelAndView sub(){

        ModelAndView modelAndView = new ModelAndView("subPage");

        Map<String, Object> model = modelAndView.getModel();

        model.put("name", "I am Model And View, and I have been passed by controller");

        return modelAndView;
    }*/
}
