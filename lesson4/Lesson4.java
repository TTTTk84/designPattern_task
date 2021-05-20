public class Lesson4 {
  public static void main(String[] args) {
  }
}

class WorldTimer {
  private static WorldTimer timer = new WorldTimer();

  private WorldTimer() {
  }

  public static WorldTimer getInstance() {
    return timer;
  }
}
