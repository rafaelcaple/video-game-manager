package com.rafaelcaple.video_game_manager.service;

import com.rafaelcaple.video_game_manager.entity.Game;
import com.rafaelcaple.video_game_manager.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {
    private final GameRepository repo;

    public List<Game> findAll (){
        return repo.findAll();
    }

    public Game save (Game game) {
        return repo.save(game);
    }

    public void delete (Game game) {
        repo.delete(game);
    }
}
