package com.mg.shakespeareapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CharacterWorkId implements Serializable {
    private static final long serialVersionUID = -9012653211795660257L;
    @Size(max = 32)
    @NotNull
    @Column(name = "character_id", nullable = false, length = 32)
    private String characterId;

    @Size(max = 32)
    @NotNull
    @Column(name = "work_id", nullable = false, length = 32)
    private String workId;

    public String getCharacterId() {
        return characterId;
    }

    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CharacterWorkId entity = (CharacterWorkId) o;
        return Objects.equals(this.characterId, entity.characterId) &&
                Objects.equals(this.workId, entity.workId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterId, workId);
    }

}