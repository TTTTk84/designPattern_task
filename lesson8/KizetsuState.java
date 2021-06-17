package lesson8;

class KizetsuState extends HumanState {
  private static HumanState s = new KizetsuState();

  private KizetsuState() {
  }

  public static HumanState getInstance() {
    return s;
  }

  public void punch(Human human) {
  }

  public void touch(Human human) {

  }
}
