package lesson12.kadai;

public class Client {
  public static void main(String[] args) {
    ConcreteSubject s = new ConcreteSubject();
    TimeAdmin o1 = new CuckooClock();
    TimeAdmin o2 = new SubtractionDisplay();
    s.attach(o1);
    s.attach(o2);

    // とりあえず発火させました。
    s.alert();
  }
}
