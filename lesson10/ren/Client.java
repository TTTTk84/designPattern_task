package lesson10.ren;

public class Client {
  public static void main(String[] args) {
    Creator creator1 = new ConcreteCreator1();
    // Creator creator2 = new ConcreteCreator2();
    Product p1 = creator1.anOperation();
    // Product p2 = creator2.anOperation();
    Product p3 = creator1.anOperation();
  }
}
