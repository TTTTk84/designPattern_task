package lesson8;

class Human {
  private HumanState state;

  public Human() {
    state = NeteruState.getInstance();
  }

  public void changeState(HumanState nextState) {
    state = nextState;
  }
}
