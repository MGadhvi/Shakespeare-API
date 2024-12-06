package com.mg.shakespeareapi.controllers;

import com.mg.shakespeareapi.entities.Character;
import com.mg.shakespeareapi.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CharacterController {

    private final CharacterRepository  characterRepository;

    @Autowired
    public CharacterController(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @GetMapping("/character")
    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }


}
