package lesson10.kadai;

abstract class Artist {

  public final Art createArt() {
    Art art = factoryMethod();
    sign(art);
    return art;
  }

  public abstract Art factoryMethod();

  public abstract void sign(Art art);

}
