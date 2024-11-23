package com.mg.shakespeareapi.repositories;

import com.mg.shakespeareapi.entities.Paragraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParagraphRepository extends JpaRepository<Paragraph, Integer> {
}