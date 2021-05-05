package com.controller;

import com.model.Campaing;
import com.model.Gamer;
import com.service.ICampaignService;
import com.service.ISalesService;

public class SalesController {

    private ISalesService salesService;
    private ICampaignService campaignService;

    public SalesController(ISalesService salesService,ICampaignService campaignService) {
        this.salesService = salesService;
        this.campaignService=campaignService;
    }

    public void sales(Gamer gamer, Campaing campaing) {
        salesService.sales(gamer,campaignService.findCompaing(campaing));
    }

}
