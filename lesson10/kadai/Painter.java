package lesson10.kadai;

class Painter extends Artist {
  public Art factoryMethod() {
    return new Picture();
  }

  public void sign(Art art) {
    Picture p = (Picture) art;
    p.insertName();
  }
}
