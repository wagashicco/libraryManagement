package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Library {



  public List<Book> bookList;

  public Library() {


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







