package org.example;

public class Book {

  // タイトル　著書　管理番号

  String title;
  String author;
  int isbn;

  //コンストラクタ　

  public Book() {
  }

  public Book(String title, String author, int isbn) {

    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }

//書籍の情報は変更される事が、ないためsetterは不要

  public int getIsbn() {
    return isbn;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }
}
