package com.controller;

import com.model.Campaing;
import com.service.ICampaignService;

public class CampaignController {

    private ICampaignService campaignService;

    public CampaignController(ICampaignService campaignService) {
        this.campaignService = campaignService;
    }

    public void add(Campaing campaing) {
        campaignService.add(campaing);
    }

    public void delete(Campaing campaing) {
        campaignService.delete(campaing);
    }

    public void update(Campaing campaing) {
        campaignService.update(campaing);
    }

    public double discount(Campaing campaing){
       return campaignService.findCompaing(campaing);
    }

}
