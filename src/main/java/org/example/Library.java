package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Library {


  //private Book[] bookList;　　←ここで配列にしていたから↓でストリームやArrayのメソッド使うとエラーになったのだ。
  public List<Book> bookList;

  public Library() {

    //オブジェクトを生成してArrayに入れる書き方が分らなかった。arrayに入れる途中で一緒に生成していいの？？

    bookList = Arrays.asList(
        new Book("吾輩は猫である", "夏目漱石", 411),
        new Book("羅生門", "芥川龍之介", 222),
        new Book("こころ", "夏目漱石", 224)
    );

  }

  public List<Book> searchBook(int searchNumber) {

    Scanner scanner = new Scanner(System.in);

    switch (searchNumber) {
      case 1 -> {
        System.out.println("検索したいタイトル名を入力してください");
        String inputTitle = scanner.nextLine();

        return bookList.stream()
            .filter(book -> book.getTitle().contains(inputTitle))
            .collect(Collectors.toList());
      }
      case 2 -> {
        System.out.println("検索したい著者を入力してください");
        String inputAuthor = scanner.nextLine();
        return bookList.stream()
            .filter(book -> book.getAuthor().contains(inputAuthor))
            .collect(Collectors.toList());
      }
      case 3 -> {
        System.out.println("検索したいISBN番号を入力してください");
        int inputNumber = scanner.nextInt();
        return bookList.stream()
            .filter(book -> book.getIsbn() == inputNumber)
            .collect(Collectors.toList());
      }
      default -> {
        return null;

      }

    }

  }
}






//try {
/*
    String inputTitle = scanner.nextLine();
    boolean hasTitle = false;
    Book searchBook = new Book();

    for (Book book:bookList) {
      searchBook = bookList;
      hasTitle = inputTitle.contains(bookList);

      if (hasTitle == true) {

        searchBook = bookList[i];
        return bookList[i];
      } else {
        System.out.println("探してる本は見つかりません");
      }
    }
    return searchBook;
  }

  public static Book searchAuthor() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("検索したい著書名を入力してください");

    String inputTitle = scanner.nextLine();
    boolean hasTitle = false;
    Book serchBook = new Book();


/*
    for (Object book : bookList) {

      hasTitle = inputTitle.contains(bookList[book].getAuthor);

      if (hasTitle == true) {
        serchBook = bookList[book];
        return bookList[book];
      } else {
        System.out.println("探してる本は見つかりません");
      }
    }
    return serchBook;
  }

  public static Book searchIBSN(){

    Scanner scanner = new Scanner(System.in);
    System.out.println("検索したいIBSN番号を入力してください");

//try {

    Int inputNumber = scanner.nextInt();
   // boolean hasTitle = false;
    Book serchBook = new Book();

    for (Book book : bookList) {

      if (inputNumber == bookList[book].getIBSN){

        serchBook = bookList[book];
        return bookList[book];
      } else {
        System.out.println("探してる本は見つかりません");
      }
    }
    return serchBook;
  }
*/






