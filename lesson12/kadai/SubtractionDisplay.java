package lesson12.kadai;

interface TimeAdmin {
  public void update(Subject s);
}

public class SubtractionDisplay implements TimeAdmin {
  int countDownValue = 10000;

  public void update(Subject s) {
    countDownValue -= 1;
    System.out.println("countDownValue: " + countDownValue);
  }
}
