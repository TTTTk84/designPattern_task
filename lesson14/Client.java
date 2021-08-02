package lesson14;

public class Client {
  public static void main(String[] args) {
    Goods moneyManager;

    moneyManager = new MoneyManager(200, 3);
    int price = moneyManager.getPrice();
    System.out.println("コスト込みの金額: " + price);
  }
}
