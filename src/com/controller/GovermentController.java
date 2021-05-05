package com.controller;

import com.model.Gamer;
import com.service.IGovermentService;

public class GovermentController {

    private IGovermentService govermentService;

    public GovermentController(IGovermentService govermentService) {
        this.govermentService = govermentService;
    }

    public boolean apply(Gamer gamer) {
        return govermentService.apply(gamer);
    }
}
