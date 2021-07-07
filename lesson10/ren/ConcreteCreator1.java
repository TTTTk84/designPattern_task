package lesson10.ren;

class ConcreteCreator1 extends Creator {
  public Product factoryMethod() {
    return new ConcreteProduct1();
  }

  public void operation1(Product product) {
    ConcreteProduct1 product1 = (ConcreteProduct1) product;
    // productに施す処理を記述
  }

  public void operation2(Product product) {
    ConcreteProduct1 product1 = (ConcreteProduct1) product;
    // productに施す処理を記述
  }
}
