package com.mg.shakespeareapi.repositories;

import com.mg.shakespeareapi.entities.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<Work, String> {
}