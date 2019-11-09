package com.unicom.engineplan.model;

import java.util.Date;

public class News {
    private int id;
    private String author;
    private String title;
    private int pageviews;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageviews() {
        return pageviews;
    }

    public void setPageviews(int pageviews) {
        this.pageviews = pageviews;
    }

    public News() {
    }

    public News(int id, String author, String title, int pageviews) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.pageviews = pageviews;
    }
}
