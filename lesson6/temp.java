package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class temp {
  public static void main(String[] args) {
    List<String> c1 = new ArrayList<>(Arrays.asList("赤", "黄", "青"));

    Iterator<String> c2 = c1.iterator();

    String a;
    while (c2.hasNext()) {
      a = c2.next();
      System.out.println(a); // 赤 黄 青
    }
  }
}

// abstract interface Vesselable {
// abstract void crateIterator();
// }

// class BookShelf implements Vesselable {

// @Override
// public void crateIterator() {
// return new BookManager(this);
// }
// }
