package com.service;

import com.model.Campaing;

public interface ICampaignService {

    void add(Campaing campaing);

    void delete(Campaing campaing);

    void update(Campaing campaing);
    double findCompaing(Campaing campaing);
}
