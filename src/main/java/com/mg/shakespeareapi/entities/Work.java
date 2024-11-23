package com.mg.shakespeareapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "work", schema = "shakespeare")
public class Work {
    @Id
    @Size(max = 32)
    @Column(name = "id", nullable = false, length = 32)
    private String id;

    @Size(max = 32)
    @NotNull
    @Column(name = "title", nullable = false, length = 32)
    private String title;

    @Size(max = 64)
    @NotNull
    @Column(name = "long_title", nullable = false, length = 64)
    private String longTitle;

    @NotNull
    @Column(name = "year", nullable = false)
    private Integer year;

    @Size(max = 1)
    @NotNull
    @Column(name = "genre_type", nullable = false, length = 1)
    private String genreType;

    @Column(name = "notes", length = Integer.MAX_VALUE)
    private String notes;

    @Size(max = 16)
    @NotNull
    @Column(name = "source", nullable = false, length = 16)
    private String source;

    @NotNull
    @Column(name = "total_words", nullable = false)
    private Integer totalWords;

    @NotNull
    @Column(name = "total_paragraphs", nullable = false)
    private Integer totalParagraphs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLongTitle() {
        return longTitle;
    }

    public void setLongTitle(String longTitle) {
        this.longTitle = longTitle;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenreType() {
        return genreType;
    }

    public void setGenreType(String genreType) {
        this.genreType = genreType;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getTotalWords() {
        return totalWords;
    }

    public void setTotalWords(Integer totalWords) {
        this.totalWords = totalWords;
    }

    public Integer getTotalParagraphs() {
        return totalParagraphs;
    }

    public void setTotalParagraphs(Integer totalParagraphs) {
        this.totalParagraphs = totalParagraphs;
    }

}