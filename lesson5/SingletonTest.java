public class SingletonTest {
  public static void main(String[] args) {
    Renban renbanA = Renban.getInstance();
    Renban renbanB = Renban.getInstance();

    System.out.println(renbanA.getNumber());
    System.out.println(renbanB.getNumber());
    System.out.println(renbanB.getNumber());
    System.out.println(renbanA.getNumber());
    System.out.println(renbanB.getNumber());
  }
}

class Renban {
  private static Renban instance = new Renban();
  private int number;
  private int add = 1;
  private int max = 9999;

  private Renban() {
    this.number = 0;
  }

  public static Renban getInstance() {
    return instance;
  }

  public String getNumber() {
    if (number + add >= max) {
      number = max;
    } else {
      number += add;
    }
    String str = String.format("%04d", number);
    return str;
  }
}
