package com.mg.shakespeareapi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "character_work", schema = "shakespeare")
public class CharacterWork {
    @EmbeddedId
    private CharacterWorkId id;

    @MapsId("characterId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @MapsId("workId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "work_id", nullable = false)
    private Work work;

    public CharacterWorkId getId() {
        return id;
    }

    public void setId(CharacterWorkId id) {
        this.id = id;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

}