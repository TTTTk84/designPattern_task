package lesson8;

class OkiteruState extends HumanState {
  private static HumanState s = new OkiteruState();

  private OkiteruState() {
  }

  public static HumanState getInstance() {
    return s;
  }

  public void punch(Human human) {
  }

  public void touch(Human human) {

  }
}
