package lesson8;

class NeteruState extends HumanState {
  private static HumanState s = new NeteruState();

  private NeteruState() {
  }

  public static HumanState getInstance() {
    return s;
  }

  public void punch(Human human) {
    human.changeState(KizetsuState.getInstance());
  }

  public void touch(Human human) {
    human.changeState(OkiteruState.getInstance());
  }
}
