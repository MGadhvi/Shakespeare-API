package com.mg.shakespeareapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "\"character\"", schema = "shakespeare")
public class Character {
    @Id
    @Size(max = 32)
    @Column(name = "id", nullable = false, length = 32)
    private String id;

    @Size(max = 64)
    @NotNull
    @Column(name = "name", nullable = false, length = 64)
    private String name;

    @Size(max = 32)
    @Column(name = "abbrev", length = 32)
    private String abbrev;

    @Size(max = 2056)
    @Column(name = "description", length = 2056)
    private String description;

    @NotNull
    @Column(name = "speech_count", nullable = false)
    private Integer speechCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSpeechCount() {
        return speechCount;
    }

    public void setSpeechCount(Integer speechCount) {
        this.speechCount = speechCount;
    }

}