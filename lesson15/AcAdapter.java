package lesson15;

class AcAdapter extends Dengen {

  private JapaneseContent adaptee;

  AcAdapter() {
    adaptee = new JapaneseContent();
  }

  public int kyuuden() {
    return (int) (adaptee.getPower() * 0.16);
  }
}
