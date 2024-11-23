package com.mg.shakespeareapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "wordform", schema = "shakespeare")
public class Wordform {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 64)
    @NotNull
    @Column(name = "plain_text", nullable = false, length = 64)
    private String plainText;

    @Size(max = 64)
    @NotNull
    @Column(name = "phonetic_text", nullable = false, length = 64)
    private String phoneticText;

    @Size(max = 64)
    @NotNull
    @Column(name = "stem_text", nullable = false, length = 64)
    private String stemText;

    @NotNull
    @Column(name = "occurences", nullable = false)
    private Integer occurences;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public String getPhoneticText() {
        return phoneticText;
    }

    public void setPhoneticText(String phoneticText) {
        this.phoneticText = phoneticText;
    }

    public String getStemText() {
        return stemText;
    }

    public void setStemText(String stemText) {
        this.stemText = stemText;
    }

    public Integer getOccurences() {
        return occurences;
    }

    public void setOccurences(Integer occurences) {
        this.occurences = occurences;
    }

}