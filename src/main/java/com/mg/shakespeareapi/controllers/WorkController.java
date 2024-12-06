package com.mg.shakespeareapi.controllers;

import com.mg.shakespeareapi.entities.Work;
import com.mg.shakespeareapi.repositories.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkController {
    private final WorkRepository workRepository;

    @Autowired
    public WorkController(WorkRepository workRepository) {
        this.workRepository = workRepository;
    }

    @GetMapping("/work")
    public List<Work> getAllWork() {
        return workRepository.findAll();
    }
}
