package com.service;

import com.model.Gamer;

public class SalesServiceImpl implements ISalesService {

    @Override
    public void sales(Gamer gamer, double discount) {
        System.out.println(discount+" kampanya uygulandi");
        System.out.println(gamer.getName() + " " + gamer.getSurname() + " satisi yapildi");
    }
}
