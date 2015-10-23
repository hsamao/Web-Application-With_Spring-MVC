package com.samao.dymcWeb.service;

import com.samao.dymcWeb.domain.Offer;
import com.samao.dymcWeb.domain.OfferDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hsamao on 10/19/15.
 */

@Service("offerService")
public class OfferService {

    private OfferDAO offerDAO;

    @Autowired
    public void setOfferDAO(OfferDAO offerDAO) {
        this.offerDAO = offerDAO;
    }

    public List<Offer> getCurrent() {

        return offerDAO.getOffer();
    }

    public  void create(Offer offer) {

        offerDAO.create(offer);
    }

    public void throwTestException() {

        offerDAO.getOffer(9999);
    }
}
