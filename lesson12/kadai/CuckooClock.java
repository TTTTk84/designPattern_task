package lesson12.kadai;

public class CuckooClock implements TimeAdmin {
  public void update(Subject subject) {
    int hour = ((ConcreteSubject) subject).getHour();

    for (int i = 0; i < hour; i++) {
      System.out.println("ぽっぽー");
    }
  }
}
