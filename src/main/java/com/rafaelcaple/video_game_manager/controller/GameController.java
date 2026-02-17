package com.rafaelcaple.video_game_manager.controller;

import com.rafaelcaple.video_game_manager.rawg.RawgClient;
import com.rafaelcaple.video_game_manager.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
public class GameController {
    private final GameService service;

    @GetMapping("/search")
    public ResponseEntity<Map<String,Object>> searchGames (@RequestParam String query) {
        return ResponseEntity.ok(service.searchGames(query));
    }
}
