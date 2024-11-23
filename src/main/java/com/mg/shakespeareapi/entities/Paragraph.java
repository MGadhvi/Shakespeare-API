package com.mg.shakespeareapi.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "paragraph", schema = "shakespeare")
public class Paragraph {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Chapter chapter;

    @NotNull
    @Column(name = "paragraph_num", nullable = false)
    private Integer paragraphNum;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @NotNull
    @Column(name = "plain_text", nullable = false, length = Integer.MAX_VALUE)
    private String plainText;

    @NotNull
    @Column(name = "phonetic_text", nullable = false, length = Integer.MAX_VALUE)
    private String phoneticText;

    @NotNull
    @Column(name = "stem_text", nullable = false, length = Integer.MAX_VALUE)
    private String stemText;

    @Size(max = 1)
    @NotNull
    @Column(name = "paragraph_type", nullable = false, length = 1)
    private String paragraphType;

    @NotNull
    @Column(name = "char_count", nullable = false)
    private Integer charCount;

    @NotNull
    @Column(name = "word_count", nullable = false)
    private Integer wordCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    public Integer getParagraphNum() {
        return paragraphNum;
    }

    public void setParagraphNum(Integer paragraphNum) {
        this.paragraphNum = paragraphNum;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
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

    public String getParagraphType() {
        return paragraphType;
    }

    public void setParagraphType(String paragraphType) {
        this.paragraphType = paragraphType;
    }

    public Integer getCharCount() {
        return charCount;
    }

    public void setCharCount(Integer charCount) {
        this.charCount = charCount;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

}