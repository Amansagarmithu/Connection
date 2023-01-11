package com.Aman.DB_Connection;


import jakarta.persistence.*;

@Entity
@Table(name = "book_db")
public class book {

    @Id
    private int id;

    @Column(name = "name")
    private String book_name;

    private int pages;

    @OneToOne
    @JoinColumn
    private User user;

    public book(){}
    public book(int id,String name,int pages){
        this.id = id;
        this.book_name = name;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
