package com.mg.shakespeareapi.repositories;

import com.mg.shakespeareapi.entities.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepository extends JpaRepository<Chapter, Integer> {
}