package com.controller;

import com.model.Gamer;
import com.service.IGameService;
import com.service.IGovermentService;

public class GameController {

    private IGameService gameService;
    private IGovermentService govermentService;

    public GameController(IGameService gameService, IGovermentService govermentService) {
        this.gameService = gameService;
        this.govermentService = govermentService;
    }

    public void add(Gamer gamer) {
        if (govermentService.apply(gamer)) {
            gameService.add(gamer);
        } else {
            System.out.println("e devlet sisteminde boyle bir kisi kayitli degil");
        }
    }

    public void delete(Gamer gamer) {
        if (govermentService.apply(gamer)) {
            gameService.delete(gamer);
        } else {
            System.out.println("e devlet sisteminde boyle bir kisi kayitli degil");
        }
    }

    public void update(Gamer gamer) {
        if (govermentService.apply(gamer)) {
            System.out.println("Game updated");
        } else {
            System.out.println("e devlet sisteminde boyle bir kisi kayitli degil");
        }
    }
}
