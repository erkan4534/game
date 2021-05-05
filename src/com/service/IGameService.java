package com.service;

import com.model.Gamer;

public interface IGameService {

    void add(Gamer gamer);

    void delete(Gamer gamer);

    void update(Gamer gamer);
}
