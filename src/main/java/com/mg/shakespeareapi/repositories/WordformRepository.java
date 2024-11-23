package com.mg.shakespeareapi.repositories;

import com.mg.shakespeareapi.entities.Wordform;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordformRepository extends JpaRepository<Wordform, Integer> {
}