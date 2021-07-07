package lesson10.ren;

abstract class Creator {
  public abstract Product factoryMethod();

  public abstract void operation1(Product product);

  public abstract void operation2(Product product);

  public final Product anOperation() {
    Product product = factoryMethod();
    operation1(product);
    operation2(product);
    return product;
  }
}
