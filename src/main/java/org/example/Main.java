package org.example;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("番号を入力してください");
    System.out.println("１：タイトル　検索");
    System.out.println("２：著書　　　検索");
    System.out.println("３：ＩＳＢＮ　検索");

    try{
  int inputNumber = scanner.nextInt();

  Library libraryBookList = new Library();
  List<Book> bookInformation = new ArrayList<>();

  if (inputNumber == 0 || inputNumber > 3) {
    System.out.println("有効な検索番号が入力されませんでした");
  } else {
    bookInformation = libraryBookList.searchBook(inputNumber);
  }
  if (bookInformation.isEmpty()) {
    System.out.println("一致する本はありません");
  } else {

    bookInformation.forEach(book -> {

      System.out.println("検索結果　タイトル [ " + book.getTitle() + " ]");
      System.out.println("　　　　  著者　  [ " + book.getAuthor() + " ]");
      System.out.println("　　　　  ISBN　 [ " + book.getIsbn() + " ]");

    });
  }

} catch (InputMismatchException e){
      System.out.println("有効な番号以外の文字が入力されました");

    }
  }
}