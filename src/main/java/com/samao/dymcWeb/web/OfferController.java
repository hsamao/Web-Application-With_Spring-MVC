package com.samao.dymcWeb.web;

import com.samao.dymcWeb.domain.Offer;
import com.samao.dymcWeb.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by hsamao on 10/19/15.
 */

@Controller
public class OfferController {

    private OfferService offerService;

    @Autowired
    public void setOfferService(OfferService offerService) {
        this.offerService = offerService;
    }

    @RequestMapping(value = "/offer", method = RequestMethod.GET)
    public String showOffer(Model model) {

        // offerService.throwTestException();

        List<Offer> offers = offerService.getCurrent();
        model.addAttribute("offers", offers);
        return "offer";
    }

    @RequestMapping(value = "/createoffer", method = RequestMethod.GET)
    public String createOffer(Model model) {
        model.addAttribute("offer", new Offer());
        return "createoffer";
    }

    @RequestMapping(value = "/text")
    public String showTest(Model model, @RequestParam("id") String id) {
        System.out.println("Id is : " + id);
        return "home";
    }

    @RequestMapping(value = "/docreate", method = RequestMethod.POST)
    public String doCreate(Model model, @Valid Offer offer, BindingResult result) {

        System.out.println(offer.getEmail());

        if (result.hasErrors()) {
            return "createoffer";
        }

        offerService.create(offer);


        return "offercreated";
    }

}
