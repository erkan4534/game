package com.service;

import com.model.Gamer;

public class GovermentServiceImpl implements IGovermentService {

    @Override
    public boolean apply(Gamer gamer) {
        System.out.println("Login");
        return true;
    }
}
