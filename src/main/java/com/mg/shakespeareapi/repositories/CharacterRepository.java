package com.mg.shakespeareapi.repositories;

import com.mg.shakespeareapi.entities.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, String> {
}