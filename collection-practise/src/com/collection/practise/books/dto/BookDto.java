package com.collection.practise.books.dto;

public class BookDto {
    private String title;
    private String author;
    private String genre;
    private int page;
    private double price;

    public BookDto(String title,String author,String genre,int page,double price){
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.page=page;
        this.price=price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getPage() {
        return page;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", page=" + page +
                ", price=" + price +
                '}';
    }
}
