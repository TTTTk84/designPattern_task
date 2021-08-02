package lesson14;

public class MoneyManager extends CostManager implements Goods {
  private int value;
  private int amount;

  MoneyManager(int v, int a) {
    value = v;
    amount = a;
  }

  public int getPrice() {
    return (int) (compute(value, amount) * 1.1);
  }
}
