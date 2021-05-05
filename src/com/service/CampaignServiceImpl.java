package com.service;

import com.model.Campaing;

public class CampaignServiceImpl implements ICampaignService {

    @Override
    public void add(Campaing campaing) {
        System.out.println("Campaign added ");
    }

    @Override
    public void delete(Campaing campaing) {
        System.out.println("Campaign deleted");
    }

    @Override
    public void update(Campaing campaing) {

        System.out.println("Campaign updated");
    }

    @Override
    public double findCompaing(Campaing campaing) {
        return 5;
    }
}
