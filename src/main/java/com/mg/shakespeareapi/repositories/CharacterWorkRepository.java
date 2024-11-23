package com.mg.shakespeareapi.repositories;

import com.mg.shakespeareapi.entities.CharacterWork;
import com.mg.shakespeareapi.entities.CharacterWorkId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterWorkRepository extends JpaRepository<CharacterWork, CharacterWorkId> {
}