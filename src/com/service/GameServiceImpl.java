package com.service;

import com.model.Gamer;

public class GameServiceImpl implements IGameService {

    @Override
    public void add(Gamer gamer) {
        System.out.println("Game added");
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("Game deleted");
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("Game updated");
    }
}
