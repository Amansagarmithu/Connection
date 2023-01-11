package com.Aman.DB_Connection;

public class update_book {
    private int id;
    private int pages;

    public update_book(int id, int pages) {
        this.id = id;
        this.pages = pages;
    }

    public update_book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
